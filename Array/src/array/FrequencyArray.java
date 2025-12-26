package array;

import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        System.out.println(" no of elements should be : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("enter no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] freq = makeFrequencyArray(arr);
        System.out.println("enter the queries : ");
        int q = scanner.nextInt();
        scanner.nextLine();


        while (q > 0){
            System.out.println("Enter the number to be searched : ");
            int k = scanner.nextInt();

            if (freq[k] > 0)
                System.out.println("Present ");
            else
                System.out.println("Not present");

            q--;
        }
    }

    public static int[] makeFrequencyArray(int[] arr){
        int n = arr.length;
        int freq[] = new int[100000];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
}
