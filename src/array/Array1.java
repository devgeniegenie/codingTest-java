package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> input = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            input.add(scanner.nextInt());
        }
        for (int i : solution(input)) {
            System.out.print(i + " ");
        }
    }

    static List<Integer> solution(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        result.add(input.get(0));
        for(int i = 1; i < input.size(); i++) {
            if(input.get(i) > input.get(i-1)){
                result.add(input.get(i));
            }
        }
        return result;
    }
}
