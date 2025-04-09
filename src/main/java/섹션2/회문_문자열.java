package 섹션2;

import java.util.Scanner;

/**
 * 7. 회문 문자열
 * 설명
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 *
 *
 * 예시 입력 1
 * gooG
 * 예시 출력 1
 * YES
 */

public class 회문_문자열 {

  public String solution(String str) {
    String answer = "YES"; // 기본적으로 회문으로 가정
    str = str.toUpperCase(); // 대문자로 변환
    int len = str.length(); // 문자열 길이

    for (int i = 0; i < len / 2; i++) {
      if (str.charAt(i) != str.charAt(len - i - 1)) { // 앞과 뒤가 다를때
        answer = "NO"; // 회문이 아님
      }
    }
    return answer;
  }

  // 스트링 빌더를 사용한 풀이
  public String solution2 (String str) {
    String answer = "YES"; // 기본적으로 회문으로 가정
    String tmp = new StringBuilder(str).reverse().toString(); // 문자열을 뒤집어서 tmp에 저장

    if (!str.equalsIgnoreCase(tmp)) { // 대소문자 구분없이 비교
      answer = "NO"; // 회문이 아님
    }

    return answer;
  }

  public static void main(String[] args) {
    회문_문자열 T = new 회문_문자열();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution(str));
  }

}
