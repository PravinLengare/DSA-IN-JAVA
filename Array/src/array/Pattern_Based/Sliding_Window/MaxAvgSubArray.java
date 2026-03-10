package array.Pattern_Based.Sliding_Window;

public class MaxAvgSubArray {
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 4;
        System.out.println("the mx avg is : "+avgSubArray(arr,k));
    }

    private static double avgSubArray(int[] arr, int k) {
        int left = 0;
        int right = 0;
        double maxAvg;
        double sum = 0;
        while (right < k){
            sum+= arr[right];
            right++;
        }
        maxAvg = sum / k;

        while (right < arr.length){
            sum -= arr[left];
            sum += arr[right];

            double currAvg = sum / k;
            maxAvg = Math.max(maxAvg,currAvg);
            left++;
            right++;
        }

        return maxAvg;
    }
}
