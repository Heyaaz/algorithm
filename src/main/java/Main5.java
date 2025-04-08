import java.util.Scanner;

/**
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 *
 * 예시 입력 1
 * a#b!GE*T@S
 *
 * 예시 출력 1
 * S#T!EG*b@a
 */

public class Main5 {


  public String solution(String str) {
    String answer;
    char[] s = str.toCharArray(); // 문자열을 문자 배열로 변환
    int lt = 0, rt = str.length() - 1; // 왼쪽과 오른쪽 포인터 초기화

    while (lt < rt) {
      if (!Character.isAlphabetic(s[lt])) { // 왼쪽 포인터가 알파벳이 아닐 경우
        lt ++; // 왼쪽 포인터가 알파벳이 아닐 경우 이동
      } else if (!Character.isAlphabetic(s[rt])) { // 오른쪽 포인터가 알파벳이 아닐 경우
        rt --; // 오른쪽 포인터가 알파벳이 아닐 경우 이동
      } else {
        char tmp = s[lt]; // 왼쪽 포인터의 문자 저장
        s[lt] = s[rt]; // 오른쪽 포인터의 문자와 교환
        s[rt] = tmp; // 왼쪽 포인터의 문자와 교환
        lt++; // 왼쪽 포인터 이동
        rt--; // 오른쪽 포인터 이동
      }
    }
    answer = String.valueOf(s); // 문자 배열을 문자열로 변환
    return answer;
  }


  public static void main(String[] args) {
    Main5 T = new Main5();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution(str));

  }

}
