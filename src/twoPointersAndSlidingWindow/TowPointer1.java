package twoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class TowPointer1 {
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

    static int[] mySolution(int[] input1, int[] input2, int n, int m) {
        int[] result = new int[n + m];
        int p1 = 0, p2 = 0;
        for(int i = 0; i < n + m; i++){
            if(p1 == n){
                result[i] = input2[p2];
                p2++;
                continue;
            } else if(p2 == m){
                result[i] = input1[p1];
                p1++;
                continue;
            }
            if(input1[p1] >= input2[p2]) {
                result[i] = input2[p2];
                p2 ++;
            }
            else if(input1[p1] < input2[p2]) {
                result[i] = input1[p1];
                p1 ++;
            }
        }
        return result;
    }

    static ArrayList<Integer> solution(int[] input1, int[] input2, int n, int m){
        ArrayList<Integer> result = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m){
            if(input1[p1] < input2[p2]) result.add(input1[p1++]);
            else result.add(input2[p2++]);
        }
        while(p1 < n){
            result.add(input1[p1++]);
        }
        while (p2 < m){
            result.add(input2[p2++]);
        }
        return result;
    }
}
