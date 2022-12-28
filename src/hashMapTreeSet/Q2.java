package hashMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String m = scanner.next();
        System.out.println(mySolution(n, m));
    }

    static String mySolution(String n, String m) {
        Map<Character, Integer> s1map = new HashMap<>();

        for (char c : n.toCharArray()) {
            s1map.put(c, s1map.getOrDefault(c, 0) + 1);
        }
        for (char c : m.toCharArray()) {
            if(!s1map.containsKey(c)){
                return "NO";
            } else if(s1map.get(c) == 0){
                return "NO";
            } else {
                s1map.put(c, s1map.get(c) - 1);
            }
        }
        return "YES";
    }
}
