package string;

import java.util.Arrays;
import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String c = scanner.next();

        System.out.println(solution(input, c));
    }

    static String solution(String input, String c) {
        int startPoint = 101;
        String[] inputArr = input.split("");
        int[] result = new int[inputArr.length];
        for (int i = 0; i <input.length(); i++) {
            if(!inputArr[i].equals(c)) {
                startPoint ++;
                result[i] = startPoint;
            }
            else {
                startPoint = 0;
                result[i] = startPoint;
            }
        }

        startPoint = 101;
        for(int i = inputArr.length - 1; i >= 0; i--) {
            if(!inputArr[i].equals(c)) {
                startPoint ++;
                result[i] = Math.min(result[i], startPoint);
            }
            else {
                startPoint = 0;
                result[i] = startPoint;
            }
        }
        return Arrays.toString(result);
    }
}
