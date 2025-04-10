package 섹션2;

import java.util.Scanner;

/**
 *10. 가장 짧은 문자거리
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 *
 * 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 *
 *
 * 예시 입력 1
 * teachermode e
 * 예시 출력 1
 * 1 0 1 2 1 0 1 2 2 1 0
 */

public class 가장_짧은_문자거리 {

  public int[] solution(String s, char t) {
    int[] answer = new int[s.length()];
    int p = 1000; // 최대 길이로 초기화
    for (int i = 0; i < s.length(); i++) { // 왼쪽에서부터 탐색
      if(s.charAt(i) == t) {
        p = 0; // t와 같은 문자면 0
        answer[i] = p; // 현재 인덱스에 0 저장
      } else {
        p++; // t와 다른 문자면 거리 증가
        answer[i] = p; // 현재 인덱스에 거리 저장
      }
    }
    p = 1000; // 최대 길이로 초기화
    for (int i = s.length() - 1; i >= 0; i--) {
      if(s.charAt(i) == t) {
        p = 0; // t와 같은 문자면 0
      } else {
        p++; // t와 다른 문자면 거리 증가
        answer[i] = Math.min(answer[i], p); // 현재 인덱스에 저장된 거리와 비교하여 최소값 저장
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    가장_짧은_문자거리 T = new 가장_짧은_문자거리();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    char c = kb.next().charAt(0);
    for (int x : T.solution(str, c)){
      System.out.print(x + " ");
    }
  }

}
