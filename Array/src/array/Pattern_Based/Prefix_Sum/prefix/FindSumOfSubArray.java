package array.Pattern_Based.Prefix_Sum.prefix;

import java.util.Scanner;

public class FindSumOfSubArray {
    public static void main(String[] args) throws Exception {
        int N = 5;
        int q = 3;
        int arr[] = {2,3,4,5,6};
        int []ans = findPrefix(arr);
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (q-- > 0){
            System.out.println("enter the l and r ");
            int l = s.nextInt();
            int r = s.nextInt();
            if (l < 0 || r > arr.length-1 ){
                throw new Exception("Enter valid l and r");
            }
            sum = ans[r+1] - ans[l];
            System.out.println("The sum from "+l +" to "+r +" is :"+sum);
        }
    }

    private static int[] findPrefix(int[] arr) {
        int n = arr.length;
        int []pref = new int[n+1];
        pref[0] = 0;
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i-1] + arr[i-1];
        }
        return pref;
    }
}
