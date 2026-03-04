package array.Pattern_Based.Two_Pointer;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int i = removeDuplicates(arr);
        System.out.println("Array After removing duplicates : ");
        for (int k = 0; k < i; k++) {
            System.out.print(arr[k]+" ");
        }
    }

    // Time Complexity is O(N)
    private static int removeDuplicates(int[] arr) {
        if (arr.length == 0)  return 0;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;

    }
}
