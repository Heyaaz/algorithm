package 섹션2;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 11. 문자열 압축
 * 설명
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 *
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *
 * 단 반복횟수가 1인 경우 생략합니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 *
 *
 * 예시 입력 1
 * KKHSSSSSSSE
 * 예시 출력 1
 * K2HS7E
 * 예시 입력 2
 * KSTTTSEEKFKKKDJJGG
 * 예시 출력 2
 * KST3SE2KFK3DJ2G2
 */

public class 문자열_압축 {

  public String solution(String s) {
    String answer = "";
    s = s + " "; // 마지막 문자를 비교하기 위해 공백 추가
    int cnt = 1; // 반복 횟수 초기화
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) { // // 현재 문자와 다음 문자가 같으면
        cnt++; // 다음 문자와 같으면 cnt 증가
      }else {
        answer += s.charAt(i); // 다음 문자와 다르면 현재 문자 추가
        if (cnt > 1) { // cnt가 1보다 크면
          answer += String.valueOf(cnt); // cnt 추가
        }
        cnt = 1; // cnt 초기화
      }

    }


    return answer;
  }



  public static void main(String[] args) {
    문자열_압축 T = new 문자열_압축();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution(str));
  }

}
