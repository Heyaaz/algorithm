package 섹션2;

import java.util.Scanner;

public class 문자_찾기 {



    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (int i = 0; i < str.length(); i++) {
            if(t == str.charAt(i)) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        문자_찾기 T = new 문자_찾기();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
