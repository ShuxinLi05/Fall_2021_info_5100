package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean palindrome = isPalindrome("ABAABA");


    }

    private static boolean isPalindrome(String str){
        if(str == null || str.length() <= 1){
            return true;
        }
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length -1;

        while (start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
