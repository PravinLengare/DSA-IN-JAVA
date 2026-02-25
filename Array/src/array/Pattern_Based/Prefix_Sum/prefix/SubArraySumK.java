package array.Pattern_Based.Prefix_Sum.prefix;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {
    public static void main(String[] args) {
        int []arr = {2,9,3,4,5};
        int k = 3;
        System.out.println("The count is : "+subArraySumK(arr,k));
    }
    // Time complexity will be O(N * log(N))
    private static int subArraySumK(int[] arr, int k) {
        int count = 0;
        int preSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i = 0; i < arr.length; i++) {
            preSum+= arr[i];
            int remove = preSum - k;
           if (map.containsKey(remove)){
               count += map.get(remove);
           }
           else {
               map.put(preSum,map.getOrDefault(preSum,0) + 1);
           }
        }
        return count;
    }
}
