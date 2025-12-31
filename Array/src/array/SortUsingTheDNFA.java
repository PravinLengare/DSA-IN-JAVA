package array;

import java.util.Scanner;

import static array.MinANdMax.swap;
import static array.RotateArray.printArray;

public class SortUsingTheDNFA {
    public static void sortZeroOneTwo(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while(mid <= high){

            if (arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }
            else if (arr[mid] == 2) {
                swap(arr,mid,high);
                high--;
            }
        }
        printArray(arr);
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
        sortZeroOneTwo(arr);
    }
}
