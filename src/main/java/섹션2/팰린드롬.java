package 섹션2;

import java.util.Scanner;


public class 팰린드롬 {

  public String solution(String s) {
    String answer = "YES";
    s = s.toUpperCase().replaceAll("[^A-Z]", ""); // 알파벳 이외의 문자 제거, 대문자로 변환
    String tmp = new StringBuilder(s).reverse().toString(); // 문자열을 뒤집어서 tmp에 저장
    if (!s.equals(tmp)) { // 전과 후를 비교
      answer = "NO";
    }
    return answer;
  }

  public static void main(String[] args) {
    팰린드롬 T = new 팰린드롬();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution(str));
  }


}
