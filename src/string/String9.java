package string;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution2(input));
    }

    static int solution(String input) {
        String result = "";
        char[] temp = input.toCharArray();
        for (char c : temp) {
            if(c >= 48 && c <= 57) {
                result += c;
            }
        }
        return Integer.parseInt(result);
    }

    static int solution2(String input){
        int result = 0;
        char[] temp = input.toCharArray();
        for (char c : temp) {
            if(c >= 48 && c <= 57) {
                result = result * 10 + (c - 48);
            }
        }
        return result;
    }

    static int solution3(String input){
        String result = "";
        char[] temp = input.toCharArray();
        for (char c : temp) {
            if(Character.isDigit(c)) {
                result += c;
            }
        }
        return Integer.parseInt(result);
    }
}
