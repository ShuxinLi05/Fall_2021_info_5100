package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1,3,-1,3,4,-1};
        int[] arr2 = {2,1,2,5,7,1};
        System.out.println(sumOfRepeatedNum(arr1));
        System.out.println(sumOfRepeatedNum(arr2));
    }

    public static int sumOfRepeatedNum(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i]) > 1){
                sum += arr[i];
            }
        }
        return sum;
    }
}
