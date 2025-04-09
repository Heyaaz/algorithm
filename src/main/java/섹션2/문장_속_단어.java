package 섹션2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 문장_속_단어 {
  /**
   * 설명
   * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
   *
   * 문장속의 각 단어는 공백으로 구분됩니다.
   *
   *
   * 입력
   * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
   *
   *
   * 출력
   * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
   *
   * 단어를 답으로 합니다.
   *
   * 예시 입력1
   * it is time to study
   *
   * 예시 출력1
   * study
   */

  public String solution(String str) {
    String answer = ""; // 가장 긴 단어를 저장할 변수
    int m = Integer.MIN_VALUE; // 가장 긴 단어의 길이를 저장할 변수
    String[] s = str.split(" "); // 문장을 공백 기준으로 나누어 배열 생성
    for (String x : s) { // 배열의 각 단어를 순회
      int length = x.length(); // 단어의 길이 검사
      if(length > m ) { // 길이가 길면 갱신
        m = length; // 최대 길이를 업데이트
        answer = x; // 가장 긴 단어를 현재 단어로 업데이트
      }
    }
    return answer; // 가장 긴 단어 반환
  }

  // 스트림을 활용한 풀이
  public String solution2(String str) {
    return Arrays.stream(str.split(" "))
        .max(Comparator.comparingInt(String::length))
        .orElse("");
  }

  public static void main(String[] args) {
    문장_속_단어 T = new 문장_속_단어();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution2(str));
  }
}
