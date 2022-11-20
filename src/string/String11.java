package string;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution2(input));
    }

    static String solution(String input) {
        input += " ";
        String result = "";
        String[] inputArr = input.split("");
        int count = 1;
        String start = inputArr[0];
        for(int i = 1; i < inputArr.length; i++) {
            if(start.equals(inputArr[i])){
                count++;
            } else {
                String temp = "";
                if(count == 1) {
                    temp += start;
                } else {
                    temp = start + count;
                }
                count = 1;
                start = inputArr[i];
                result += temp;
            }
        }
        return result;
    }

    static String solution2(String input) {
        String result = "";
        input += " ";
        int count = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) count++;
            else {
                result += input.charAt(i);
                if (count > 1) result += String.valueOf(count);
                count = 1;
            }
        }
        return result;
    }
}

