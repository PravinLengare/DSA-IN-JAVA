package array.Pattern_Based.Two_Pointer;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    // optimized time complexity O(N)
    private static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            if (arr[left] + arr[right] == target){
                return new int[]{arr[left],arr[right]};
            } else if (arr[left] + arr[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
