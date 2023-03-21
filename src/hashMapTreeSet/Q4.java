package hashMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String m = scanner.nextLine();
//        System.out.println(mySolution(n,m));
    }

    /*static String mySolution(String n, String m) {
        int result = 0;
        char[] c = m.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < c.length; i++) {
            map.put(String.valueOf(c[i]), map.getOrDefault(c[i], 0) + 1);
        }

        for(int i = m.length() - 1; i < n.length(); i++){
            for(int j = i; j >= i - m.length() - 1; j--){

            }
        }
    }*/
}
