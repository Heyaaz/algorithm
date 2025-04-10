package 섹션3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4. 피보나치 수열
 * 설명
 * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 *
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 *
 * 입력
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 *
 *
 * 출력
 * 첫 줄에 피보나치 수열을 출력합니다.
 *
 *
 * 예시 입력 1
 * 10
 * 예시 출력 1
 * 1 1 2 3 5 8 13 21 34 55
 */

public class 피보나치_수열 {

  public ArrayList<Integer> solution(Integer n) {
    ArrayList<Integer> answer = new ArrayList<>();
    int[] array = new int[n];
    answer.add(1);
    answer.add(1);
    array[0] = 1;
    array[1] = 1;
    for (int i = 2; i < n; i++) {
      int sum = array[i-2] + array[i-1];
      array[i] = sum;
      answer.add(sum);
    }
    return answer;
  }

  public int[] solution2 (int n) {
    int[] answer = new int[n];
    answer[0] = 1;
    answer[1] = 1;
    for (int i = 2; i < n; i++) {
      answer[i] = answer[i -2] + answer[i - 1];
    }
    return answer;
  }

  public static void main(String[] args) {
    피보나치_수열 T = new 피보나치_수열();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    for (int x : T.solution(n)) {
      System.out.print(x + " ");
    }
  }
}
