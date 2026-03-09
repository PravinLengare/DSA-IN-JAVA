package array.Pattern_Based.Two_Pointer;

public class ContainerWater {
    public static void main(String[] args) {
        int arr[] = {2, 7, 4, 0, 9};
        System.out.println(containerWithMostWater(arr));
    }

    private static int containerWithMostWater(int[] arr) {
        int maxArea = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int heightOfContainer = Math.min(arr[left],arr[right]);
            int area = (right - left) * heightOfContainer;
            maxArea = Math.max(area,maxArea);
            if (arr[left] < arr[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
