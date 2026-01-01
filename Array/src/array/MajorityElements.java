package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElements {
    public static int majorityElementUsingAlgorithm(int[] arr){
        int n = arr.length;
        int count = 0;
        int ele = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0){
                ele = arr[i];
                count = 1;
            }
            else if (arr[i] == ele){
                count ++;
            }
            else {
                count --;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele){
               cnt++;
            }
        }
        if (cnt > n /2){
            return  ele;
        }
        return -1;

    }
    public static int majorityElement(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > n/2){
                return count;
            }
            else {
                count = 0;
            }
        }
        return -1;

    }
    public static int majorityElementMap(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }


        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        System.out.println(" no of elements should be : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("enter no of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(majorityElement(arr));
        System.out.println("Using the algorithm : "+majorityElementUsingAlgorithm(arr));
    }
}
