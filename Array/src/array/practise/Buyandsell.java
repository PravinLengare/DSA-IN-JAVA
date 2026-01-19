package array.practise;

import java.util.Scanner;

public class Buyandsell {
    public static void main(String[] args) {
        System.out.println(" no of elements should be : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        System.out.println("enter no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The profit is "+buyAndSell(arr));
    }

    private static int buyAndSell(int[] arr) {
        int minPrice = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length ; i++) {
            int profit = arr[i] - minPrice;
            maxProfit = Math.max(maxProfit,profit);
            minPrice = Math.min(minPrice,arr[i]);
        }
        return maxProfit;
    }
}
