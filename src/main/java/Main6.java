import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import javax.print.DocFlavor.STRING;

/**
 * 설명
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 *
 *
 * 예시 입력 1
 * ksekkset
 *
 * 예시 출력 1
 * kset
 */

public class Main6 {

  public String solution(String str) {
    String answer = "";
    for (int i = 0; i < str.length(); i++) {
//      System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
      if (str.indexOf(str.charAt(i)) == i) { // 현재 문자와 처음 등장하는 인덱스가 같으면
        answer += str.charAt(i); // answer에 추가
      }
    }
    return answer;
  }

  // 스트림을 사용한 풀이
//  public String solution2(String str) {
//    return Arrays.stream(str)
//        .distinct() // 중복된 문자 제거
//        .collect(Collectors.toCollection(ArrayList::new)); // ArrayList로 변환
//  }

  public static void main(String[] args) {
    Main6 T = new Main6();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution(str));
  }
}
