package array;

import java.util.Scanner;

public class MaxSubarrayLength {
    public static int maxLengthSubArray(int[] arr,int k){
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
    public static void main(String[] args) {
        System.out.println(" no of elements should be : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("enter no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = 6;
        System.out.println("The longest length of the sub-array is : "+maxLengthSubArray(arr,k));
    }
}
