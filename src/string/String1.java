package string;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        char input2 = scanner.next().charAt(0);
        String1 result = new String1();
        System.out.println(result.solution(input1, input2));
    }

    public int solution(String input, char input2){
        int result = 0;

        input = input.toUpperCase();
        input2 = Character.toUpperCase(input2);

        for(char x : input.toCharArray()) {
            if(x == input2) result ++;
        }

        return result;
    }
}
