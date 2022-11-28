package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(scanner.nextInt());
            }
            input.add(temp);
        }
        System.out.println(solution(input, n));
    }

    static int solution(List<List<Integer>> input, int n) {
        int result = 0;
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for(int i = 0; i < n; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for(int j = 0; j < n; j++) {
                rowSum += input.get(i).get(j);
                columnSum += input.get(j).get(i);
                if(i == j) diagonalSum1 += input.get(i).get(j);
                if(i == n - j - 1) diagonalSum2 += input.get(i).get(j);
            }
            result = Math.max(result, rowSum);
            result = Math.max(result, columnSum);
        }
        int maxDiagonal = Math.max(diagonalSum1, diagonalSum2);
        result = Math.max(result, maxDiagonal);
        return result;
    }
}
