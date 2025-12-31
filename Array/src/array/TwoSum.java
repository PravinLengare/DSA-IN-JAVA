package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSumMap(int[]arr,int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int more = target - a ;
            if (map.containsKey(more)){
                return new int[]{map.get(more),i};
            }
            else{
                map.put(a,i);
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSum(int[]arr,int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            if (arr[i] + arr[j] == target){
                return new int[]{i,j};
            } else if (arr[i] + arr[j] < target) {
                i++;
            }
            else if (arr[i] + arr[j] > target) {
                j--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        System.out.println(" no of elements should be : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        System.out.println("enter no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = 14;
        /*
        int []ans = twoSum(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }

         */
        int []ans = twoSumMap(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}
