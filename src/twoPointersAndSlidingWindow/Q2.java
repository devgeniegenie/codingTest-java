package twoPointersAndSlidingWindow;

import java.util.*;

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

        for (int i : solution(input1, input2, n, m)) {
            System.out.print(i + " ");
        }
    }

    static List<Integer> mySolution(int[] input1, int[] input2, int n, int m) {
        List<Integer> result = new ArrayList<>();
        for(int x : input1) {
            for(int y = 0; y < m; y++) {
                if(x == input2[y]) {
                    result.add(x);
                    input2[y] = 0;
                }
            }
        }
        for(int x : input2) {
            for(int y : input1) {
                if(x == y) {
                    result.add(x);
                }
            }
        }
        result.sort(Comparator.naturalOrder());
        return result;
    }

    static List<Integer> solution(int[] input1, int[] input2, int n, int m) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(input1);
        Arrays.sort(input2);
        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m) {
            if(input1[p1] == input2[p2]){
                result.add(input1[p1++]);
                p2++;
            } else if(input1[p1] < input2[p2]) {
                p1 ++;
            } else {
                p2 ++;
            }
        }
        return result;
    }
}
