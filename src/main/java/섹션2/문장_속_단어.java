package 섹션2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 문장_속_단어 {


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
