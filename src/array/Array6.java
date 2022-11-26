package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(scanner.next());
        }
        for(int x : solution(input)){
            System.out.print(x + " ");
        }
    }

    static List<Integer> solution(List<String> input) {
        List<Integer> result = new ArrayList<>();
        for (String s : input) {
            StringBuffer temp = new StringBuffer(s);
            int changeInt = Integer.parseInt(temp.reverse().toString());
            if(checkPrime(changeInt)){
                result.add(changeInt);
            }
        }
        return result;
    }

    private static boolean checkPrime(int x) {
        if(x < 2) return false;
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0) return false;
        }
        return true;
    }
}
