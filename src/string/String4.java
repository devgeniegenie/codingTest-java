package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] input = new String[n];
        for(int i = 0; i < n; i++) {
            input[i] = scanner.next();
        }
        for(String x : solution2(n, input)){
            System.out.println(x);
        }

    }
    static List<String> solution(int n, String[] input) {
        List<String> result = new ArrayList<>();
        for (String s : input) {
            result.add(new StringBuilder(s).reverse().toString());
        }
        return result;
    }

    static List<String> solution2(int n, String[] input) {
        List<String> result = new ArrayList<>();
        for (String s : input) {
            char[] c = s.toCharArray();
            int lp = 0, rp = s.length() - 1;
            while(lp < rp) {
                char temp = c[lp];
                c[lp] = c[rp];
                c[rp] = temp;
                lp++;
                rp--;
            }
            String temp = String.valueOf(c);
            result.add(temp);
        }
        return result;
    }
}
