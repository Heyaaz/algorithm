package 섹션2;

import java.util.Scanner;



public class 숫자만_추출 {

  private int solution(String s) {
    int answer = 0;

    for (char x : s.toCharArray()) { // 문자열을 문자 배열로 변환
      if (48<= x && x <= 57) { // 아스키코드로 숫자만 추출
        answer = answer * 10 + (x - 48); // 아스키코드로 변환하여 숫자만 추출
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    숫자만_추출 T = new 숫자만_추출();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution(str));
  }

}
