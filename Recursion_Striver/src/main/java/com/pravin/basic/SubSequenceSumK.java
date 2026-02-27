package com.pravin.basic;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceSumK {
    public static void main(String[] args) {
        int []arr = {1,2,1};
        List<Integer> list = new ArrayList<>();
        //subSeqSumK(0,arr,list,0);
        subSeqSumKB(0,arr,list,0);
        int sum = 0;
        System.out.println("The count of the sub seq is : "+countSubSequence(0,arr,sum));
    }

    private static int countSubSequence(int i, int[] arr, int sum) {
        int k = 2;
        if (i == arr.length){
            if (sum == k){
                return 1;
            }
            else {
                return 0;
            }
        }
        sum+= arr[i];
        int l = countSubSequence(i+1,arr,sum);
        sum-= arr[i];
        int r = countSubSequence(i+1,arr,sum);
        return l + r;
    }

    private static void subSeqSumK(int i, int[] arr, List<Integer> list, int sum) {
        int k = 2;
        if (i == arr.length){
            if (sum == k){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        sum+= arr[i];
        subSeqSumK(i+1,arr,list,sum);
        list.remove(list.size() - 1);
        sum-= arr[i];
        subSeqSumK(i+1,arr,list,sum);
    }
    private static boolean subSeqSumKB(int i, int[] arr, List<Integer> list, int sum) {
        int k = 2;
        if (i == arr.length){
            if (sum == k){
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[i]);
        sum+= arr[i];
        if (subSeqSumKB(i + 1, arr, list, sum))
            return true;
        list.remove(list.size() - 1);
        sum-= arr[i];
        if (subSeqSumKB(i+1,arr,list,sum))
            return true;

        return false;
    }
}
