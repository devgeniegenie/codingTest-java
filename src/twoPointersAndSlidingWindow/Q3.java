package twoPointersAndSlidingWindow;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int days = scanner.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }
        System.out.println(mySolution(n, days, input));

    }

    static int mySolution(int n, int days, int[] input) {
        int temp = 0;
        for(int i = 0; i < days; i++){
            temp += input[i];
        }
        int result = temp;
        for(int i = days; i < n; i++){
            temp = temp - input[i - days] + input[i];
            result = Math.max(temp, result);
        }
        return result;
    }
}
