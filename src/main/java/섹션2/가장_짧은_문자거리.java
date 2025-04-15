package 섹션2;

import java.util.Scanner;

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
