package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RearrangeArrayElements {
    public static int[] rearrangeArray(int[]arr){
        int n = arr.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }

        if (pos.size() > neg.size()){

            for(int i = 0; i < neg.size() ; i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = neg.size()*2;
            for(int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        }
        else{

            for(int i = 0; i < pos.size() ; i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = pos.size()*2;
            for(int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }
        return arr;
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

        int ans[] = rearrangeArray(arr);
        System.out.println("the array is : ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] +" ");
        }
    }
}
