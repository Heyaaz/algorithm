package 섹션2;

import java.util.Scanner;


public class 암호 {

  public String solution(int n, String s) {
    String answer = "";
    for (int i = 0; i < n; i++) {
      String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0'); // 7자리씩 잘라서 tmp에 저장
      int num = Integer.parseInt(tmp, 2); // 2진수로 변환
      answer += (char) num; // 아스키 코드로 변환하여 answer에 추가
      s = s.substring(7); // 다음 7자리로 이동
    }
    return answer;
  }


  public static void main(String[] args) {
    암호 T = new 암호();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String str = kb.next();
    System.out.println(T.solution(n, str));
  }

}
