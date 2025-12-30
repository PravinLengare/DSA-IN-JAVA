package array;

import java.util.Scanner;

public class PrefixSum {
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int []pref = new int[n+1];
        pref[0] = arr[0];

        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i-1] + arr[i-1];
        }

        return pref;
    }
    public static int[] prefixSumWithoutMemory(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static int findSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return sum;
    }
    public static int findPrefixSum(int[]arr){
        int []prefix = prefixSumWithoutMemory(arr);
        int sum = 0;
        for (int i = 0; i < prefix.length; i++) {
            sum+=prefix[i];
        }
        return sum;
    }
    public static boolean checkSubArray(int[] arr){
        int totalSum = findSum(arr);
        int prefixSum = findPrefixSum(arr);
        int suffixSum = totalSum - prefixSum;
        if (suffixSum == prefixSum){
            return true;
        }
        return false;
    }
    public static void findSuffixSum(int[] arr){
        int n = arr.length;
        for (int i = n-2; i >=0 ; i--) {
            arr[i] = arr[i] + arr[i+1];
        }
        printArray(arr);
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


        int[] ans = prefixSum(arr);



        //int []prefixSum = prefixSumWithoutMemory(arr);

        System.out.println("Enter the no of queries : ");
        int q = scanner.nextInt();
        int sum = 0;
        while (q > 0){
            System.out.println("Enter the l  and r :");
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            sum = ans[r] - ans[l-1];
            System.out.println("The sum from l to r is : "+sum);
            q--;
        }
        //System.out.println("The sum from l to r is : "+sum);




        // suffix sum
        System.out.println("The suffix sum is : ");
        findSuffixSum(arr);

        // sub-array will form or not
        System.out.println("This is sub-array : "+checkSubArray(arr));

    }
}
