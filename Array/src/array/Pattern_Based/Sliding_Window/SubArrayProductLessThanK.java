package array.Pattern_Based.Sliding_Window;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 100;

        System.out.println("The count is : "+optimal(arr,k));
        System.out.println("The count is : "+bruteForce(arr,k));
    }

    private static int optimal(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        double prod = 1;

        while (right < arr.length){
            prod *= arr[right];
            while (left <= right && prod >= k){
                prod /= arr[left];
                left++;
            }
            count += (right - left + 1);
            right++;

        }
        return count;
    }

    private static int bruteForce(int[] arr, int k) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr.length; j++) {
                prod *= arr[j];
                if (prod < k){
                    count++;
                }else {
                    break;
                }
            }
        }

        return count;
    }
}
