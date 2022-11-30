package array;

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] input = new int[m][n];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(input, n, m));
    }

    static int solution(int[][] input, int n, int m) {

    }
}
