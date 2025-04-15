package 섹션2;

import java.util.Scanner;

public class 특정_문자_뒤집기 {


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
    특정_문자_뒤집기 T = new 특정_문자_뒤집기();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution(str));

  }

}
