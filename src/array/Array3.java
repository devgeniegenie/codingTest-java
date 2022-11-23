package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> input1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input1.add(scanner.nextInt());
        }
        List<Integer> input2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input2.add(scanner.nextInt());
        }
        for (String s : solution(n, input1, input2)) {
            System.out.println(s);
        }
    }

    static List<String> solution(int n, List<Integer> input1, List<Integer> input2) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(input1.get(i) == input2.get(i)) result.add("D");
            else if(input1.get(i) == 1 && input2.get(i) == 3) result.add("A");
            else if(input1.get(i) == 2 && input2.get(i) == 1) result.add("A");
            else if(input1.get(i) == 3 && input2.get(i) == 2) result.add("A");
            else result.add("B");
        }
        return result;
    }
}
