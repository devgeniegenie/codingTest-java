package string;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution2(input));
    }

    static String solution(String input) {
        String result = "";
        for(int i = 0; i < input.length(); i++) {
            if(i == input.indexOf(input.charAt(i))){
                result += input.charAt(i);
            }
        }
        return result;
    }

    static String solution2(String input) {
        String result = "";
        char[] charArr = input.toCharArray();
        for (char c : charArr) {
            if(result.indexOf(c) == -1) result += c;
        }
        return result;
    }
}
