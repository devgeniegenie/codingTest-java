package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }

    static List<Integer> solution(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);
        for (int i = 2; i < n; i++) {
            result.add(result.get(i - 1) + result.get(i - 2));
        }
        return result;
    }
}
