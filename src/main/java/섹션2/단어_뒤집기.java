package 섹션2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 설명
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *
 * 예시 입력 1
 * 3
 * good
 * Time
 * Big
 *
 * 예시 출력 1
 * doog
 * emiT
 * giB
 */



public class 단어_뒤집기 {

  // StringBuilder를 사용한 풀이
  public ArrayList<String> solution(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();
    for(String x : str) {
      String tmp = new StringBuilder(x).reverse().toString(); // StringBuilder를 사용하여 문자열을 뒤집음
      answer.add(tmp); // 뒤집은 문자열을 리스트에 추가
    }

    return answer;
  }

  // StringBuilder를 사용하지 않고 풀이
  public ArrayList<String> solution2(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();
    for (String x : str) {
      char[] s = x.toCharArray(); // 문자열을 문자 배열로 변환
      int lt = 0; // 왼쪽 포인터
      int rt = x.length() - 1; // 오른쪽 포인터

      while (lt < rt) {
        char tmp = s[lt]; // 왼쪽 포인터의 문자 저장
        s[lt] = s[rt]; // 오른쪽 포인터의 문자와 교환
        s[rt] = tmp; // 왼쪽 포인터의 문자와 교환
        lt++; // 왼쪽 포인터 이동
        rt--; // 오른쪽 포인터 이동
      }
      String tmp = String.valueOf(s); // 문자 배열을 문자열로 변환
      answer.add(tmp); // 변환된 문자열을 리스트에 추가
    }
    return answer;
  }

  // 스트림을 활용한 풀이
  public ArrayList<String> solution3(int n, String[] str) {
    return Arrays.stream(str)
        .map( x -> new StringBuilder(x).reverse().toString()) // 스트림을 사용하여 각 단어를 뒤집음
        .collect(Collectors.toCollection(ArrayList::new)); // 리스트로 변환
  }




  public static void main(String[] args) {
    단어_뒤집기 T = new 단어_뒤집기();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      arr[i] = kb.next();
    }
    for (String x : T.solution3(n, arr)) {
      System.out.println(x);
    }
    }
  }

