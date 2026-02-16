package recursion.com.array;



public class SumOfArray {
    static int sumOfArray(int arr[],int idx){
        if (idx == arr.length - 1){    // Base Case
            return arr[idx];
        }
        if (idx == arr.length){
            return 0;
        }
        int smallWork = sumOfArray(arr,idx + 1); // sub-problem
        return smallWork + arr[idx];                // self work
    }
    public static void main(String[] args) {
        //int arr[] = {1, 5, 7, 9, 4};
        int arr[] = {};
        int idx = 0;
        System.out.print("The sum of array is : "+sumOfArray(arr, idx));
    }
}
