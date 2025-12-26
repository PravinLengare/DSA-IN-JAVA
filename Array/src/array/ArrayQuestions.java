

import java.util.Scanner;

public class ArrayQuestions1 {
    public static void printArray(int arr[]){
        int n = arr.length;
        System.out.println("The array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sumNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+= arr[i];
        }
        printArray(arr);
        System.out.println();
        System.out.println("The sum is : "+sum);
    }

}
    public static void main(String[] args) {
        System.out.println(" no of elements should be : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("enter no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
//        }
//        sumNumber(arr);
//
//        ArrayList<Integer> ans = new ArrayList<>();
//        Map<Integer,Integer> a = new HashMap<>();
//        a.getOrDefault(2,2);


    }


}
