package array.practise;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void removeDuplicates(int[]arr){
        int slow = 0;
        int fast = 1;
        while (slow < fast && fast < arr.length){
            if (arr[fast]!=arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
            else {
                fast++;
            }
        }
        System.out.println("array with removed duplicates");
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i]+" ");
        }
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
        removeDuplicates(arr);
    }
}
