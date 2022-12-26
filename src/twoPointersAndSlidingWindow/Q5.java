package twoPointersAndSlidingWindow;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(solution(input));
    }

    static int mySolution(int input) {
        int result = 0;
        for(int lp = 1; lp <= input; lp++) {
            int sum = 0;
            for(int rp = lp; rp <= input; rp++){
                if(input == sum) {
                    result++;
                    sum = 0;
                    break;
                }
                else if(input > sum) sum += rp;
                else break;
            }
        }
        return result;
    }

    static int solution(int input) {
        int result = 0, cnt = 1;
        input -= 1;
        while(input > 0) {
            cnt ++;
            input -= cnt;
            if(input % cnt == 0) result ++;
        }
        return result;
    }
}
