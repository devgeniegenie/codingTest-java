package string;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution3(input));
    }

    static String solution(String input){
        String result = "";
        String[] inputArr = input.split(" ");
        int lengthChk = Integer.MIN_VALUE;
        for (String s : inputArr) {
            if(s.length() > lengthChk) {
                lengthChk = s.length();
                result = s;
            }
        }
        return result;
    }

    static String solution2(String input){
        String result = "";
        int lengthChk = Integer.MIN_VALUE, pos;
        while((pos = input.indexOf(" ")) != -1){
            String temp = input.substring(0, pos);
            int leng = temp.length();
            if(lengthChk < leng){
                lengthChk = leng;
                result = temp;
            }
            input = input.substring(pos + 1);
        }
        if(input.length() > lengthChk) result = input;
        return result;
    }

    static String solution3(String input){
        String result = "";
        for(String s : input.split(" ")){
            if(s.length() > result.length()) result = s;
        }
        return result;
    }
}
