package 섹션2;


import java.util.Scanner;



public class 문자열_압축 {

  public String solution(String s) {
    String answer = "";
    s = s + " "; // 마지막 문자를 비교하기 위해 공백 추가
    int cnt = 1; // 반복 횟수 초기화
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) { // // 현재 문자와 다음 문자가 같으면
        cnt++; // 다음 문자와 같으면 cnt 증가
      }else {
        answer += s.charAt(i); // 다음 문자와 다르면 현재 문자 추가
        if (cnt > 1) { // cnt가 1보다 크면
          answer += String.valueOf(cnt); // cnt 추가
        }
        cnt = 1; // cnt 초기화
      }

    }


    return answer;
  }



  public static void main(String[] args) {
    문자열_압축 T = new 문자열_압축();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution(str));
  }

}
