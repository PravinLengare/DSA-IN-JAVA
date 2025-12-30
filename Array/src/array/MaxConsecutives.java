package array;

import java.util.Scanner;

public class MaxConsecutives {
    public static int maxConsecutive(int[] arr){
        int max = 0,count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
                max = Math.max(max,count);
            }
            else {
                count = 0;
            }
        }
        return max;
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

        System.out.println("The max consecutive are : "+maxConsecutive(arr));
    }
}
