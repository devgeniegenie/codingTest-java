package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> input = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            input.add(scanner.nextInt());
        }
        System.out.println(solution(input));
    }

    static int solution(List<Integer> input){
        int result = 1;
        int max = input.get(0);
        for(int i = 1; i < input.size(); i++){
            if(max < input.get(i)) {
                result++;
                max = input.get(i);
            }
        }
        return result;
    }
}
