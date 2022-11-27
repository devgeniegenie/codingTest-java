package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(scanner.nextInt());
        }
        System.out.println(soluion(input));
    }

    static int soluion(List<Integer> input) {
        int result = 0;
        int point = 0;
        for (Integer i : input) {
            if (i == 1){
                point ++;
                result += point;
            }else {
                point = 0;
            }
        }
        return result;

    }
}
