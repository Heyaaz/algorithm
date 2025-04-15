package 섹션2;

import java.util.Scanner;


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
