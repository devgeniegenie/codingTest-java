package twoPointersAndSlidingWindow;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(mySolution(n, k, arr));
    }

    static int mySolution(int n, int k, int[] arr) {
        int lt = 0, rt = 0, cnt = 0, length = 0, max = 0;
        while(rt < n) {
            if(arr[rt] == 1) {
                length ++;
                rt ++;
            } else if(arr[rt] == 0) {
                cnt ++;
                if(cnt <= k) {
                    length ++;
                    rt ++;
                } else {
                    max = Math.max(max, length);
                    lt ++;
                    rt = lt;
                    length = 0;
                    cnt = 0;
                }
            }
        }
        return max;
    }
}
