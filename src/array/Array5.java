package array;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution2(n));
    }

    static int solution(int n) {
        int result = 0;
        if(n < 2) return 0;
        for(int i = 2; i <= n; i++) {
            if(checkPrime(i)) result ++;
        }
        return result;
    }

    static boolean checkPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    static int solution2(int n) {
        int result = 0;
        int[] check = new int[n + 1];
        for(int i = 2; i <= n; i++) {
            if(check[i] == 0) {
                result++;
                for (int j = i; j <= n; j = j+i) check[j] = 1;
            }
        }
        return result;
    }
}
