package 섹션3;

import java.util.ArrayList;
import java.util.Scanner;


public class 큰_수_출력하기 {

  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    answer.add(arr[0]); // 1번 인덱스 추가
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[i -1]) {
        answer.add(arr[i]);
      }
    }
    return answer;
  }


  public static void main(String[] args) {
    큰_수_출력하기 T = new 큰_수_출력하기();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }

  }
}
