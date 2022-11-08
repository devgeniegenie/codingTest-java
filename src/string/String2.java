package string;

import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String2 result = new String2();
        System.out.println(result.result(input1));
        System.out.println(result.result2(input1));

    }

    public String result(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }
        return result;
    }

    public String result2(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (c >= 97 && c <= 122) {
                result += (char) (c - 32);
            } else {
                result += (char) (c + 32);
            }
        }
        return result;
    }
}
