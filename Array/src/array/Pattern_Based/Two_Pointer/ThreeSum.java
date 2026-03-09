package array.Pattern_Based.Two_Pointer;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
//        int arr[] = {2, 7, 4, 0, 9};
//        int target =  13;
//        int[] ans = threeSum(arr,target);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i] + " ");
//        }
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> answer = threeSumTwoPointer(arr,3);
        System.out.println(answer);
    }

    private static int[] threeSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int third = target - (arr[i] + arr[j]);
                if (set.contains(third)){
                    int[] result = {arr[i], arr[j], third};
                    Arrays.sort(result);
                    return result;
                }
                set.add(arr[j]);
            }
        }
        return new int[]{-1, -1, -1};
    }
    public static List<List<Integer>> threeSumTwoPointer(int[] arr,int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr); // Step 1: Sort to use two pointers

        for (int i = 0; i < n; i++) {
            // Skip duplicate elements for the first position
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < target) {
                    j++; // Sum too small, move left pointer right
                } else if (sum > target) {
                    k--; // Sum too large, move right pointer left
                } else {
                    // Found a triplet!
                    list.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    // Move pointers first before checking for duplicates
                    j++;
                    k--;

                    // Skip duplicates for the second and third positions
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        return list;
    }
}
