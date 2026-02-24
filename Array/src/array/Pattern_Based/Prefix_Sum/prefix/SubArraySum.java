package array.Pattern_Based.Prefix_Sum.prefix;

public class SubArraySum {
    public static void main(String[] args) {
        int []arr = {-2,4,-2,-5,7,2,4};

        subArraySum(arr);
    }

    private static void subArraySum(int[] arr) {
        // first approach of O(N3) time complexity
        /*
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum+= arr[k];
                }
                max = Math.max(sum,max);
            }
        }
        System.out.println("The max is : "+max);

         */
        // second approach of O(N2) time complexity
        /*
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum+= arr[j];
                max = Math.max(max,sum);
            }
        }
        System.out.println("The max is : "+max);

         */


        // third approach of O(N) time complexity
        /**
         * Kadane's Algorithm where keep adding the elements till we get the negative sum
         * if negative sum is there then reset sum to the 0 and add again
         * at last we will get the max sum from the sub array
         */
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0){
                sum = 0;
            }
            max = Math.max(max,sum);
        }
        System.out.println("The max is : "+max);
    }
}
