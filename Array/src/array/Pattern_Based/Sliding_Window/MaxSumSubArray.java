package array.Pattern_Based.Sliding_Window;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 4;
        System.out.println("the mx long len is : "+maxSubArray(arr,k));
    }

    private static long maxSubArray(int[] arr, int k) {
        int left = 0;
        int right = 0;
        long sum = 0;
        long maxLen = 0;
        while (right < arr.length){
            sum += arr[right];
            while (left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if (sum == k){
                maxLen = Math.max(maxLen,right - left + 1);
            }
            right++;


        }
        return maxLen;
    }
}
