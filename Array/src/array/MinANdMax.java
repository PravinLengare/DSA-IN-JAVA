package array;

import java.util.Arrays;
import java.util.Scanner;

import static array.ArrayQuestions.printArray;

public class MinANdMax {
    public static void minMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min "+min);
        System.out.println("Max "+max);

    }
    public static int[] valueEqualTOIndex(int[] arr){
        // int result[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int indexValue = i + 1;
            if (value == indexValue){
                count++;
            }
        }
        int []result = new int[count];
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i+1){
                result[resultIndex] = arr[i];
                resultIndex++;
            }
        }
        return result;
    }
    public static boolean isSortedArray(int []arr){
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void pairSum(int[] arr,int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        System.out.println("the count is : "+count);
    }
    static int[] largestAndSmallest(int[] arr) {
        Arrays.sort(arr);
        return new int[] {
                arr[0],arr[arr.length-1]
        };

    }
    public static void secondLargestElement(int []arr){
//        Arrays.sort(arr);
//        int largest = arr[arr.length-1];
//        int secondLargest = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < largest){
//                secondLargest = arr[i];
//            }
//        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i]!=largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("Duplicate Values");
        }else
             System.out.println("Second Largest is : "+secondLargest);
    }
    public static void removeDuplicates(int []arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
        }
        int []result = new int[count];
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    result[resultIndex] = arr[i];
                    resultIndex++;
                }
            }
        }
        printArray(result);
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
        minMax(arr);

        System.out.println("--------------------");
        int res[] = valueEqualTOIndex(arr);
        printArray(res);


        printArray(arr);
        System.out.println("Sorted : "+isSortedArray(arr));
        System.out.println("enter the target value : ");
        int target = scanner.nextInt();
        System.out.println("Sum of pairs of Array : ");
        pairSum(arr,target);


        System.out.println("Largest and Smallest Element : ");
        int []ans = largestAndSmallest(arr);
        printArray(ans);

        secondLargestElement(arr);

        System.out.println("Remove duplicate from the array : ");
        System.out.println("1.Using Extra Space find duplicate elements ");
        removeDuplicates(arr);

    }
}
