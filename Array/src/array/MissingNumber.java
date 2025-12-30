package array;

import java.util.Scanner;

public class MissingNumber {

    public static int missingNumber(int[] arr){
        int n = arr.length;
        for (int i = 1; i <= n; i++) {
            boolean check = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i){
                    check = true;
                    break;
                }
            }
            if (check == false){
                return i;
            }
        }
        return -1;
    }
    public static int hashMissing(int[] arr){
        int n = arr.length + 1;
        int[] hash = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = 1;
        }
        for (int i = 1; i <= hash.length; i++) {
           if (hash[i] == 0){
               return i;
           }
        }
        return -1;
    }
    public static int xorMissing(int[] arr){
        int xor1 = 0,xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
           xor2 = xor2 ^ arr[i];
           xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ arr.length+1;
        return xor1 ^ xor2;
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

        System.out.println("The missing number is : "+missingNumber(arr));
        System.out.println("The missing number is : "+hashMissing(arr));
        System.out.println("The missing number is : "+xorMissing(arr));
    }
}
