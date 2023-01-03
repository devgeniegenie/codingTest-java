package hashMapTreeSet;

import java.util.*;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for (Integer integer : mySolution2(n, m, arr)) {
            System.out.print(integer + " ");
        }

    }

    //time out
    static List<Integer> mySolution(int n, int m, int[] arr){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n-m+1; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = i; j < m + i; j++){
                temp.add(arr[j]);
            }
            List<Integer> distinctList = temp.stream().distinct().collect(Collectors.toList());
            result.add(distinctList.size());
        }
        return result;
    }

    //time out (mySolution보다는 약간 빠른듯)
    static List<Integer> mySolution2(int n, int m, int[] arr){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n-m+1; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = i; j < m + i; j++){
                temp.add(arr[j]);
            }
            Set<Integer> set = new HashSet<>(temp);
            List<Integer> distinctList =new ArrayList<>(set);

            result.add(distinctList.size());
        }
        return result;
    }


}
