package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /*
    Build Array from Permutation
    Given a zero-based permutation nums (0-indexed),
    build an array ans of the same length where ans[i] = nums[nums[i]]
    for each 0 <= i < nums.length and return it.
    A zero-based permutation nums is an array of distinct integers
    from 0 to nums.length - 1 (inclusive).
    Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
     */

    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i = 0; i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }

        return ans;

    }
    /*
    Concatenation of Array
    Given an integer array nums of length n, you want to create an array ans of length 2n
    where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    Specifically, ans is the concatenation of two nums arrays.
    Return the array ans.
    Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]
     */

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;

    }
    /*
    Shortest Word Distance
    Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2,
    return the shortest distance between these two words in the list.
    Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "coding", word2 = "practice"
    Output: 3
     */

    public int shortestDistance(String[] wordsDict, String w1, String w2) {
        int distance = wordsDict.length;

        for(int i = 0; i < wordsDict.length; i++){
            if(wordsDict[i].equals(w1)){
                for(int j = 0; j < wordsDict.length; j++){
                    if(wordsDict[j].equals(w2)){
                        distance = Math.min(distance, Math.abs(i-j));

                    }

                }

            }
        }

        return distance;
    }
    /*
    Move Zeroes
    Given an integer array nums, move all 0's to the end of it while maintaining
    the relative order of the non-zero elements.
    Note that you must do this in-place without making a copy of the array.
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
     */

    public void moveZeroes(int[] nums) {

        int p1 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[p1] = nums[i];
                p1++;
            }

        }
        for(int i=p1;i<nums.length;i++){
            nums[i]=0;
        }

    }
    /*
    Merge Sorted Array
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;

        for(int i=m+n-1;i>=0;i--){
            if(p2<0){
                break;
            }
            if(p1>=0 && nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1--];

            }else{
                nums1[i] = nums2[p2--];

            }
        }

    }

    /*
    Sort Array by Increasing Frequency
    Given an array of integers nums, sort the array in increasing order based on the frequency of the values.
    If multiple values have the same frequency, sort them in decreasing order.
    Return the sorted array.
    Input: nums = [1,1,2,2,2,3]
    Output: [3,1,1,2,2,2]
     */

    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a, b) -> {
            return (map.get(a) == map.get(b)) ? b - a : map.get(a) - map.get(b);
        });

        int[] result = new int[nums.length];
        int i = 0;
        for(int num : list){
            for(int j = 0; j < map.get(num); j++){
                result[i++] = num;
            }
        }
        return result;
    }
    /*
    Maximum Product of Three Numbers
    Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
    Input: nums = [1,2,3]
    Output: 6
     */

    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        return Math.max(nums[0]*nums[1]*nums[nums.length-1],
                nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);

    }
    /*
    Missing Number
    Given an array nums containing n distinct numbers in the range [0, n],
    return the only number in the range that is missing from the array.
    Input: nums = [3,0,1]
    Output: 2
     */

    public int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        //int newCount = nums.length + 1;
        for(int i = 0; i <= nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;

    }
    /*
    Contains Duplicate
    Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.
    Input: nums = [1,2,3,1]
    Output: true
     */

    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;

    }
    /*
    Find All Numbers Disappeared in an Array
    Given an array nums of n integers where nums[i] is in the range [1, n],
    return an array of all the integers in the range [1, n] that do not appear in nums.
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [5,6]
     */

    public List<Integer> findDisappearedNumbers(int[] nums) {
        //if(nums == null || nums.length == 0){
        //    return null;
        //}
        HashMap<Integer, Boolean> map = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], true);
        }

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;

    }
    /*
    Summary Ranges
    You are given a sorted unique integer array nums.
    Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
    That is, each element of nums is covered by exactly one of the ranges,
    and there is no integer x such that x is in one of the ranges but not in nums.
    Input: nums = [0,1,2,4,5,7]
    Output: ["0->2","4->5","7"]
     */

    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();

        if(nums == null || nums.length == 0){
            return list;
        }

        for(int i = 0; i < nums.length; i++){
            int p = nums[i];
            while (i < nums.length-1 && nums[i]+1 == nums[i+1]){
                i++;
            }
            if(p != nums[i]){
                list.add(p + "->" + nums[i]);
            } else {
                list.add(p + "");
            }
        }
        return list;

    }
    /*
    Single Number
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    Input: nums = [2,2,1]
    Output: 1
     */

    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(map.get(i) == 1){
                return i;
            }
        }
        return 0;

    }
    /*
    Remove Duplicates from Sorted Array
    Given an integer array nums sorted in non-decreasing order,
    remove the duplicates in-place such that each unique element appears only once.
    The relative order of the elements should be kept the same.
    Since it is impossible to change the length of the array in some languages,
    you must instead have the result be placed in the first part of the array nums.
    More formally, if there are k elements after removing the duplicates,
    then the first k elements of nums should hold the final result.
    It does not matter what you leave beyond the first k elements.
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
     */

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int p1 = 0;
        for (int p2 = 1; p2 < nums.length; p2++){
            if(nums[p2]!= nums[p1]){
                p1++;
                nums[p1] = nums[p2];


            }
        }
        return p1+1;

    }
    /*
    Sum of Unique Elements
    You are given an integer array nums. The unique elements of an array are the elements
    that appear exactly once in the array.
    Input: nums = [1,2,3,2]
    Output: 4
     */

    public int sumOfUnique(int[] arr) {

        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i]) == 1){
                result += arr[i];
            } else if(map.get(arr[i]) == 2){
                result -= arr[i];
            }
        }
        return result;

    }
    /*
    Squares of a Sorted Array
    Given an integer array nums sorted in non-decreasing order,
    return an array of the squares of each number sorted in non-decreasing order.
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
     */

    public int[] sortedSquares(int[] arr) {
        int[] output = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        int ind = arr.length-1;

        while (start <= end)
        {
            if(Math.abs(arr[start]) < Math.abs(arr[end]))
            {
                output[ind] = arr[end] * arr[end];
                end--;
            } else {
                output[ind] = arr[start] * arr[start];
                start ++;
            }
            ind--;
        }
        System.out.println(Arrays.toString(output));
        return output;

    }

    /*205. Isomorphic Strings
    Given two strings s and t, determine if they are isomorphic.
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    All occurrences of a character must be replaced with another character while preserving the order of characters.
    No two characters may map to the same character, but a character may map to itself.
     */
    public static boolean isIsomorphic(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        if(s.length() != t.length()) return false;

        char[] sNew = new char[256];
        char[] tNew = new char[256];

        for(int i = 0; i < s.length(); i++){
            if(sNew[s1[i]] == 0 && tNew[t1[i]] == 0){
                sNew[s1[i]] = t1[i];
                tNew[t1[i]] = s1[i];
            }else{
                if(sNew[s1[i]] != t1[i] || tNew[t1[i]] != s1[i]){
                    return false;
                }
            }
        }
        return true;
    }
    /*415. Add Strings
    Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
    You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
    You must also not convert the inputs to integers directly.
     */
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            int a = i >= 0 ? (num1Array[i--] - '0') : 0;
            int b = j >= 0 ? (num2Array[j--] - '0') : 0;
            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        return sb.toString();
    }
    /*125. Valid Palindrome
    Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     */
    public boolean isPalindrome(String s) {
        String sNew = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if(sNew == null || sNew.length() <= 1){
            return true;
        }
        char[] arr = sNew.toCharArray();
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            if(arr[start] !=arr[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
    /*28. Implement strStr()
    Implement strStr().
    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     */
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0) return 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j = 1;
                for(j = 1; j < needle.length(); j++){
                    if(haystack.charAt(i + j) != needle.charAt(j)) break;
                }

                if(j == needle.length()){
                    return i;
                }
            }
        }

        return -1;
    }
    /*696. Count Binary Substrings
    Give a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's,
    and all the 0's and all the 1's in these substrings are grouped consecutively.
    Substrings that occur multiple times are counted the number of times they occur.
     */
    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int current = 1;
        int previous = 0;
        int count = 0;
        for(int i = 1; i < chars.length;i++){
            if(chars[i] == chars[i - 1]){
                current++;
            }else{
                count += Math.min(current, previous);
                previous = current;
                current = 1;
            }
        }
        return Math.min(current, previous) + count;
    }
    /*13. Roman to Integer
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    For example, 2 is written as II in Roman numeral, just two one's added together.
    12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     */
    public int romanToInt(String s) {
        int sum = 0;

        if(s.indexOf("IV") != -1){sum -= 2;}
        if(s.indexOf("IX") != -1){sum -= 2;}
        if(s.indexOf("XL") != -1){sum -= 20;}
        if(s.indexOf("XC") != -1){sum -= 20;}
        if(s.indexOf("CD") != -1){sum -= 200;}
        if(s.indexOf("CM") != -1){sum -= 200;}

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'I') sum += 1;
            if(c == 'V') sum += 5;
            if(c == 'X') sum += 10;
            if(c == 'L') sum += 50;
            if(c == 'C') sum += 100;
            if(c == 'D') sum += 500;
            if(c == 'M') sum += 1000;
        }
        return sum;
    }
    /*680. Valid Palindrome II
    Given a string s, return true if the s can be palindrome after deleting at most one character from it.
     */
    public boolean validPalindrome(String s) {
        int left_pointer = 0;
        int right_pointer = s.length() - 1;

        while(left_pointer <= right_pointer){
            if(s.charAt(left_pointer) != s.charAt(right_pointer)){
                return helperMethod(s, left_pointer + 1, right_pointer) || helperMethod(s, left_pointer, right_pointer - 1);
            }
            left_pointer++;
            right_pointer--;
        }
        return true;
    }

    public boolean helperMethod(String s, int i, int j) {
        int left_pointer = i;
        int right_pointer = j;

        while(left_pointer <= right_pointer){
            if(s.charAt(left_pointer) != s.charAt(right_pointer)){
                return false;
            }

            left_pointer++;
            right_pointer--;
        }
        return true;
    }
    /*14. Longest Common Prefix
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String pre = strs[0];

        for(int i = 0; i < strs.length; i++){
            while(!strs[i].startsWith(pre)){
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }
    /*387. First Unique Character in a String
    Given a string s, find the first non-repeating character in it and return its index.
    If it does not exist, return -1.
     */
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    /*383. Ransom Note
    Given two stings ransomNote and magazine,
    return true if ransomNote can be constructed from magazine and false otherwise.
    Each letter in magazine can only be used once in ransomNote.
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);
        }
        for(char ch : ransomNote.toCharArray()){
            int count = map.getOrDefault(ch,0) - 1;
            map.put(ch, count);
            if (count < 0){
                return false;
            }
        }
        return true;
    }

}
