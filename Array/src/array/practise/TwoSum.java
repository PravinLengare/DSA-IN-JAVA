package array.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] usingMap(int[] arr,int target){
        /**
         * problem with the function of the map
         */
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int more = target - a;
            if (map.containsKey(more)){
                return new int[]{map.get(more),i};
            }
            map.put(a,i);
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
        int target = 9;
        int[] ans = usingMap(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}
