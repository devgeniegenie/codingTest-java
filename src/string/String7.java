package string;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution2(input));
    }

    static String solution(String input) {
        input = input.toUpperCase();
        for(int i = 0; i <input.length()/2; i++) {
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
                return "NO";
            }
        }
        return "YES";
    }

    static String solution2(String input) {
        String temp = new StringBuilder(input).reverse().toString();
        String result = input.equalsIgnoreCase(temp) ? "YES" : "NO";
        return result;
    }
}
