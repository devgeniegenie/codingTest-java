package sortingAndSearching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        mySolution2(n, arr);
    }

    private static void mySolution(int n, int[] arr) {
        List<Integer> negative = new ArrayList<Integer>();
        List<Integer> posigative = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) negative.add(arr[i]);
            else posigative.add(arr[i]);
        }
        List<Integer> result = Stream.concat(negative.stream(), posigative.stream()).collect(Collectors.toList());
        System.out.println(result);
    }

    private static void mySolution2(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > 0 && arr[j] < 0) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String result = "";
        for (int i : arr) {
            result += i + " ";
        }
        System.out.println(result);

    }
}
