package com.pravin.basic;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        int []arr = {3,1,2};
        List<Integer> list = new ArrayList<>();
        subSeq(0,arr,list);
    }

    private static void subSeq(int i, int[] arr, List<Integer> list) {
        int n = arr.length;
        if (i >= n){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        subSeq(i+1,arr,list);
        list.remove(list.size() - 1);
        subSeq(i+1,arr,list);
    }
}
