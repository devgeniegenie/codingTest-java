package twoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] input1 = new int[n];
        for (int i = 0; i < n; i++) {
            input1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] input2 = new int[m];
        for (int i = 0; i < m; i++) {
            input2[i] = scanner.nextInt();
        }

        for (int i : mySolution(input1, input2, n, m)) {
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> mySolution(int[] input1, int[] input2, int n, int m) {
        List<Integer> result = new ArrayList<>();

    }
}
