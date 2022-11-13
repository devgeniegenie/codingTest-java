package string;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(solution2(input));
    }

    static String solution(String input) {
        input = input.toUpperCase();
        String temp = new StringBuilder(input).reverse().toString();
        for(int i = 0; i <input.length(); i++) {
            if(Character.isAlphabetic(input.charAt(i)) && Character.isAlphabetic(temp.charAt(i))
            && input.charAt(i) != temp.charAt(i)) {
                return "NO";
            }
        }
        return "YES";
    }

    static String solution2(String input) {
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(input).reverse().toString();
        if(temp.equals(input)){
            return "YES";
        } else {
            return "NO";
        }

    }
}
