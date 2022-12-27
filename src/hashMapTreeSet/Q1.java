package hashMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        System.out.println(mySolution(n, input));
    }

    static char mySolution(int n, String input) {
        char result = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        for(char k : map.keySet()) {
            if(map.get(k) > max) {
                max = map.get(k);
                result = k;
            }
        }
        return result;
    }
}
