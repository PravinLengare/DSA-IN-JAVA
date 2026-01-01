package array;

import java.util.Scanner;

public class MaxSumSubArray {
    public static int maxSumSubArray(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum+= arr[j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
    public static int maxSumSubArrayUsingAlgorithm(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int start = -1;
            int ansStart = -1;
            int ansEnd = -1;
            if (sum == 0){
                start = i;
            }
            sum+=arr[i];
            if (sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0){

                sum = 0;
            }
            max = Math.max(max,sum);
        }

        if (max > 0){
            return max;
        }
       return 0;
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


        System.out.println("The sum of max sub-array is : "+maxSumSubArray(arr));
        System.out.println("The sum of max sub-array Using Kadane Algorithm is : "+maxSumSubArrayUsingAlgorithm(arr));
    }
}
