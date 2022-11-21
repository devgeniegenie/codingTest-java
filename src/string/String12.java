package string;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String input = scanner.next();

        System.out.println(solution2(length, input));
    }

    static String solution(int length, String input) {
        String result = "";
        String trans = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '#') trans += "1";
            else trans += "0";
        }
        for (int i = 0; i < trans.length(); i += 7) {
            result += (char)Integer.parseInt(trans.substring(i, i + (input.length() / length)), 2);
        }
        return result;
    }

    static String solution2(int length, String input){
        String result= "";
        for(int i = 0; i < length; i++) {
            String temp = input.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(temp, 2);
            result += (char) num;
            input = input.substring(7);
        }
        return result;
    }
}
