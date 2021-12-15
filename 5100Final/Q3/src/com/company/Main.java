package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,1,1};
        int k1 = 2;
        int[] nums2 = {1,2,3};
        int k2 = 3;
        System.out.println(totalNumofSubarrays(nums1,k1));
        System.out.println(totalNumofSubarrays(nums2,k2));
    }

    public static int totalNumofSubarrays(int[] num, int k) {
        if(num.length == 0 || num == null) return 0;
        Map<Integer, Integer> map = new HashMap<>();

        int res = 0;
        int total = 0;
        map.put(0,1);

        for(int i = 0; i < num.length; i++){
            res += num[i];
            if(map.containsKey(res - k)){
                total += map.get(res - k);
            }
            map.put(res, map.getOrDefault(res, 0) + 1);
        }

        return total;
    }
}
