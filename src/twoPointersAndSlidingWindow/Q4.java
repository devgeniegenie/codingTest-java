package twoPointersAndSlidingWindow;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }
        System.out.println(mySolution(n, m, input));

    }

    static int mySolution(int n, int m, int[] input) {
        int sum = 0, l = 0, r = 0, cnt = 0;
        while(r < n) {
            sum += input[r];
            if(sum == m){
                cnt ++;
                r++;
            } else if (sum < m) {
                r++;
            } else if (sum > m) {
                if(l == r) {
                    sum -= input[l];
                    l++;
                    r++;
                } else {
                    sum -= input[l];
                    sum -= input[r];
                    l++;
                }
            }
        }
        return cnt;
    }

    static int solution(int n, int m, int[] input) {
        int answer = 0, sum = 0, l = 0;
        for(int r = 0; r < n; r++) {
            sum += input[r];
            if(sum == m) answer ++;
            while(sum > m) {
                sum -= input[l++];

            }
            if(sum == m) answer ++;
        }
        return answer;
    }
}
