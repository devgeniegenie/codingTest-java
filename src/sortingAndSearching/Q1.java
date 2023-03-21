package sortingAndSearching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        mySolution(n, arr);
    }

    private static void mySolution(int n, List<Integer> arr) {
        String result = "";
        for(int i = 0; i < n - 1; i++) {
            int idx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr.get(i) > arr.get(j)){
                    idx = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(idx));
            arr.set(idx, temp);

            result += arr.get(i) + " ";
        }
        System.out.println(result);
    }
}
