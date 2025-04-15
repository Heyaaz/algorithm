package 섹션2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;



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

