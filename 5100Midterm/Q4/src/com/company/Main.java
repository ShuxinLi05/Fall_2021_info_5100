package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(nonRepeatingChar(s1));

    }

    public static int nonRepeatingChar(String s) {
        if( s==null || s.length() ==0) return 0;

        int result = 0;
        int[] str = new int[200];
        int p1 = 0;
        int p2 = 0;

        while (p2 < s.length()) {
            char r = s.charAt(p2);
            str[r]++;

            while (str[r] > 1) {
                char l = s.charAt(p1);
                str[l]--;
                p1++;
            }
            result = Math.max(result, p2 - p1 + 1);
            p2++;
        }
        return result;
    }
}
