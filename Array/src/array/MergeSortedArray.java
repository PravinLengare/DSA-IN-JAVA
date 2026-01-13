package array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void mergeTwoArrays(int[] arr1,int[] arr2,int n1,int n2){
        int []ans = new int[n1+n2];
        int left = 0;
        int right = 0;
        int index = 0;
        while (left < n1 && right < n2){
            if (arr1[left] < arr2[right]){
                ans[index++] = arr1[left];
                left++;
            }
            else {
                ans[index++] = arr1[right];
                right++;
            }


        }
        while (left < n1){
            ans[index++] = arr1[left];
            left++;
        }
        while (right < n2){
            ans[index++] = arr2[right];
            right++;
        }
        for (int j = 0; j < n1+n2; j++) {
            if (j < n1){
                arr1[j] = ans[j];
            }
            else {
                arr2[j - n1] = ans[j];
            }
        }
        printArray(arr1);
        printArray(arr2);

    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void optimizeMerge(int[] arr1, int[] arr2, int n1, int n2) {
        int left = n1 - 1;
        int right = 0;
        while (left >= 0 && right < n2){
            if (arr1[left] > arr2[right]){
                swap(arr1,arr2,left,right);
                left--;
                right++;
            }
            else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        printArray(arr1);
        printArray(arr2);
    }
    public static void gapMethod(int[] arr1, int[] arr2, int n1, int n2){
        int len = n1 + n2;

        // Initial Gap: ceil(len / 2)
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                // Case 1: Left in arr1, Right in arr2
                if (left < n1 && right >= n1) {
                    swapGreater(arr1, arr2, left, right - n1);
                }
                // Case 2: Both in arr2
                else if (left >= n1) {
                    swapGreater(arr2, arr2, left - n1, right - n1);
                }
                // Case 3: Both in arr1
                else {
                    swapGreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }

            // CRITICAL CHECK: Break if we just finished the gap=1 pass
            if (gap == 1) {
                break;
            }
            // Update Gap: ceil(gap / 2)
            gap = (gap / 2) + (gap % 2);
        }

        printArray(arr1);
        printArray(arr2);
    }
    public static void swap(int[] arr1,int []arr2,int l,int r){
        int temp = arr1[l];
        arr1[l] = arr2[r];
        arr2[r] = temp;
    }
    public static void swapGreater(int[] arr1,int []arr2,int left,int right){
        if (arr1[left] > arr2[right]){
            int temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
        }
    }
    public static void swap(int arr1,int arr2){
        int temp = arr1;
        arr1 = arr2;
        arr2 = temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Better user prompts
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter sorted elements for Array 1:");
        for (int j = 0; j < n1; j++) {
            arr1[j] = sc.nextInt();
        }

        System.out.println("Enter sorted elements for Array 2:");
        for (int j = 0; j < n2; j++) {
            arr2[j] = sc.nextInt();
        }

        System.out.println("--- Merged Output ---");
        // mergeTwoArrays(arr1, arr2, n1, n2);

        // optimizeMerge(arr1,arr2,n1,n2);

        gapMethod(arr1,arr2,n1,n2);
    }


}
