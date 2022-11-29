package array;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] input = new int[n][n];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(input, n));
    }

    static int solution(int[][] input, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i - 1 < 0 || input[i][j] > input[i - 1][j]) &&
                   (j - 1 < 0 || input[i][j] > input[i][j - 1]) &&
                   (i + 1 == n || input[i][j] > input[i + 1][j]) &&
                   (j + 1 == n || input[i][j] > input[i][j + 1])) {
                    result++;
                }
            }
        }
        return result;
    }
}
