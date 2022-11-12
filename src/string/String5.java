package string;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution(input));
    }

    static String solution(String input) {
        String result;
        int length = input.length();
        char[] c = input.toCharArray();
        int lt = 0, rt = length-1;
        while(lt < rt){
            if(!Character.isAlphabetic(c[lt])) lt ++;
            else if(!Character.isAlphabetic(c[rt])) rt --;
            else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt ++; rt--;
            }
        }
        result = String.valueOf(c);
        return result;
    }
}
