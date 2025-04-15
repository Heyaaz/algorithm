package 섹션2;

import java.util.Scanner;
import java.util.stream.Collectors;

public class 중복_문자_제거 {

  public String solution(String str) {
    String answer = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.indexOf(str.charAt(i)) == i) { // 현재 문자와 처음 등장하는 인덱스가 같으면
        answer += str.charAt(i); // answer에 추가
      }
    }
    return answer;
  }

  // 스트림을 사용한 풀이
  public String solution2(String str) {
    return str.chars() // 문자열을 int 스트림으로 변환
        .mapToObj(c -> (char) c) // int 를 문자로 변환
        .distinct() // 중복 제거
        .map(String::valueOf) // 각 문자를 문자열로 변환
        .collect(Collectors.joining()); // 문자열로 결합
  }

  public static void main(String[] args) {
    중복_문자_제거 T = new 중복_문자_제거();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution(str));
  }
}
