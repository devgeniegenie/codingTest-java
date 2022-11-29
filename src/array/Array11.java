package array;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] input = new int[n][5];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(input, n));
    }

    static int mySolution(int[][] input, int n) {
        int result = 0;
        int[] joinResult = new int[n];
        for(int i = 0; i < n; i++) {
            int point = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (input[j][k] == input[i][k]) {
                        point++;
                        break;
                    }
                }
            }
            joinResult[i] = point;
        }

        int idx = 0;
        int max = 0;
        for(int i = 0; i < joinResult.length; i++) {
            if(max < joinResult[i]) {
                idx = i;
                max = joinResult[i];
            }
        }
        result = idx + 1;
        return result;
    }

    static int solution(int[][] input, int n) {
        int result = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            int point = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (input[j][k] == input[i][k]) {
                        point++;
                        break;
                    }
                }
            }
            if(max < point){
                max = point;
                result = i + 1;
            }
        }
        return result;
    }
}
