package 섹션3;

import java.util.ArrayList;
import java.util.Scanner;


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
