package array.Pattern_Based.Prefix_Sum.prefix;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int []arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 4;
        //System.out.println("The longest length is : "+longestSubArraySumK(arr,k));
        System.out.println("The longest length is : "+longestSubArraySumKTwoPointer(arr,k));
    }

    private static Long longestSubArraySumK(int[] arr, int k) {
        long length = 0;
        long sum = 0;
        Map<Long,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            if (sum == k){
                length = Math.max(length,i+1);
            }
            long rem = sum-k;
            if (map.containsKey(rem)){
                int len = i - map.get(rem);
                length = Math.max(length,len);
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        return length;
    }
    // Time complexity is O(N) approximately.
    private static Long longestSubArraySumKTwoPointer(int[] arr, int k) {
        long MaxLength = 0;
        int n = arr.length;
        long sum = arr[0];
        int left = 0;
        int right = 0;
        while (right < n){
            while (left <= right && sum > k){        // because of repeated tasks
                sum-= arr[left];
                left++;
            }
            if (sum == k){
                MaxLength = Math.max(MaxLength,right-left+1);
            }
            right++;
            if (right < n) sum+= arr[right];
        }
        return MaxLength;
    }
}
