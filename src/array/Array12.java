package array;

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in);
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
        int result = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int pi = 0, pj = 0;
                    for(int s = 0; s < n; s++){
                        if(input[k][s] == i) pi = s;
                        if(input[k][s] == j) pj = s;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m) result ++;
            }
        }
        return result;
    }
}