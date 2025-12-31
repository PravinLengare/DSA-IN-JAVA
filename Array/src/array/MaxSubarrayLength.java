package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxSubarrayLength {
    public static int maxLengthSubArray(int[] arr,long k){
        int left = 0,right = 0;
        int  maxLength = 0;
        long sum = arr[0];
        while(right < arr.length){
            while(left <= right && sum > k){
                sum-= arr[left];
                left++;
            }
            if (sum == k){
                maxLength = Math.max(maxLength,right-left + 1);
            }
            right++;
            if(right < arr.length){
                sum+= arr[right];
            }
        }
        return maxLength;

    }
    public static int maxLengthSubArrayForThePositiveAndNegative(int[] arr,long k){
        int  maxLength = 0;
        Map<Long,Integer> preSumMap = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            if (sum == k){
                maxLength = Math.max(maxLength,i+1);
            }
            long rem = sum - k;
            if (preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLength = Math.max(maxLength, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(" no of elements should be : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("enter no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long k = 6;
        System.out.println("The longest length of the sub-array is : "+maxLengthSubArray(arr,k));
        System.out.println("The longest length of the sub-array is : "+maxLengthSubArrayForThePositiveAndNegative(arr,k));
    }
}
