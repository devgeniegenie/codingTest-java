package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(scanner.nextInt());
        }
        for(int i : solution(input)){
            System.out.print(i + " ");
        }
    }

    static List<Integer> solution(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            int num = 1;
            for (int j = 0; j < input.size(); j++) {
                if (input.get(i) < input.get(j)) {
                    num++;
                }
            }
            result.add(num);
        }
        return result;
    }
}
