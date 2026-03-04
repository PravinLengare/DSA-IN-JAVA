package array.Pattern_Based.Two_Pointer;

import static array.MinANdMax.swap;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverseArray(int[] arr) {
        int left = 0,right = arr.length - 1;
        while (left < right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
}
