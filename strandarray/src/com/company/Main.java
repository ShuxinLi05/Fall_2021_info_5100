package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Minimum remove to make valid parentheses
        System.out.println(minRemoveToMakeValid("a)b(c)d")); //ab(c)d
        System.out.println(minRemoveToMakeValid("))((")); //empty

        // Group anagrams
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        //List<List<String>> anagrams = groupAnagrams(arr);
        System.out.println(groupAnagrams(arr)); // [[eat, tea, ate], [bat], [tan, nat]]

        // Decode String
        String str1 = "2[abc]3[cd]ef";
        System.out.println(decodeString(str1)); //abcabccdcdcdef

        // Top K Frequent Words
        String[] words1 = {"i", "love", "leetcode", "i", "love", "coding"};
        int k1 = 2;
        String[] words2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k2 = 4;
        System.out.println(topKFrequent(words1,k1)); //[i, love]
        System.out.println(topKFrequent(words2,k2)); //[the, is, sunny, day]

        // Zigzag Conversion
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println(convert(s1,numRows1)); //PAHNAPLSIIGYIR
        System.out.println(convert(s2,numRows2)); //PINALSIGYAHRPI

        // Multiply Strings
        String num1 = "2";
        String num2 = "3";
        System.out.println(multiply(num1,num2)); //6
        String num3 = "123";
        String num4 = "456";
        System.out.println(multiply(num3,num4)); //56088

        // Find All Anagrams in a String
        String ana1 = "cbaebabacd";
        String p1 = "abc";
        System.out.println(findAnagrams(ana1,p1)); //[0, 6]
        String ana2 = "abab";
        String p2 = "ab";
        System.out.println(findAnagrams(ana2,p2)); //[0, 1, 2]

        // Remove Duplicate Letters
        String let1 = "bcabc";
        System.out.println(removeDuplicateLetters(let1)); // abc
        String let2 = "cbacdcbc";
        System.out.println(removeDuplicateLetters(let2)); // acbd

        // Palindromic Substrings
        String subs1 = "abc";
        System.out.println(countSubstrings(subs1)); // 3
        String subs2 = "aaa";
        System.out.println(countSubstrings(subs2)); // 6

        // Longest Common Subsequence
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1,text2)); //3
        String text3 = "abc";
        String text4 = "def";
        System.out.println(longestCommonSubsequence(text3,text4)); //0


    }

    // Minimum remove to make valid parentheses
    public static String minRemoveToMakeValid(String str) {
        StringBuilder sb = new StringBuilder();
        int balance = 0;
        for(char c: str.toCharArray()){
            if(c == '('){
                balance++;
            }else if(c == ')'){
                if(balance == 0) continue;
                balance--;
            }
            sb.append(c);
        }
        StringBuilder result = new StringBuilder();
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i) == '(' && balance-- > 0 ) continue;
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();
    }

    // Group anagrams
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String sorted = helper(str);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> temp : map.values()){
            result.add(temp);
        }
        return result;
    }
    public static String helper(String s){
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    // Decode String
    public static String decodeString(String s) {
        if(s == null || s.length() == 0) return "";
        Stack<String> dict = new Stack<>();
        Stack<Integer> count = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int num = c - '0';
                while(Character.isDigit(s.charAt(i + 1))){
                    num = num * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                count.push(num);
            } else if (Character.isLetter(c)){
                dict.push(c + ""); //执行push时(即，将元素推入栈中)，是通过将元素追加的数组的末尾中。
            } else if (c == '['){
                dict.push("[");
            } else if (c == ']') {
                String temp = "";
                while(dict.peek() != "["){ //执行peek时(即，取出栈顶元素，不执行删除)，是返回数组末尾的元素。
                    temp = dict.pop() + temp; //执行pop时(即，取出栈顶元素，并将该元素从栈中删除)，是取出数组末尾的元素，然后将该元素从数组中删除。
                }
                dict.pop();
                int repeat = count.pop();
                String local = "";
                for(int j = 0; j < repeat; j++){
                    local += temp;
                }
                dict.push(local);
            }
        }
        String res = "";
        while(!dict.isEmpty()){
            res = dict.pop() + res;
        }
        return res;
    }

    // Top K Frequent Words
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((a, b) -> {
            int freqA = a.getValue();
            int freqB = b.getValue();
            if (freqA != freqB) {
                return freqB - freqA;
            } else {
                return a.getKey().compareTo(b.getKey());
            }
        });
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }
        List<String> res = new ArrayList<>();
        while (k != 0 && !queue.isEmpty()) {
            res.add(queue.poll().getKey());
            k--;
        }
        return res;
    }

    // Zigzag Conversion
    public static String convert(String s, int numRows) {
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            sbs[i] = new StringBuilder();
        }
        int i = 0;
        while(i < s.length()){
            // 从上到下
            int rowIndex = 0;
            while(i < s.length() && rowIndex <= numRows - 1){
                sbs[rowIndex].append(s.charAt(i));
                i++;
                rowIndex++;
            }
            // 从下到上
            // -2才是倒数第二行
            rowIndex -= 2;
            while(i < s.length() && rowIndex >= 1){
                sbs[rowIndex].append(s.charAt(i));
                i++;
                rowIndex--;
            }
        }
        for(int j = 1; j < numRows; j++){
            sbs[0].append(sbs[j].toString());
        }
        return sbs[0].toString();
    }

    // Multiply Strings
    public static String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1 + len2];
        for(int i = len1 - 1; i >= 0; i--){
            for(int j = len2 - 1; j >= 0; j--){
                int x = num1.charAt(i) - '0';
                int y = num2.charAt(j) - '0';
                int pos1 = i + j;
                int pos2 = i + j + 1;
                int sum = x * y + res[pos2] + res[pos1] * 10;
                res[pos2] = sum % 10;
                res[pos1] = sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < res.length; i++){
            if(sb.length() == 0 && res[i] == 0) continue;
            sb.append(res[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    // Find All Anagrams in a String
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() == 0 || s == null) return res;
        int len = p.length();
        char[] temp = p.toCharArray();
        Arrays.sort(temp);
        String pSorted = new String(temp);
        for(int i = 0; i <= s.length() - len; i++){
            String sub = s.substring(i, i + len);
            char[] arr = sub.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(sorted.equals(pSorted)){
                res.add(i);
            }
        }
        return res;
    }

    // Remove Duplicate Letters
    private static int findMinLastPos(HashMap<Character, Integer> map){
        int res = Integer.MAX_VALUE;
        for(int num : map.values()){
            res = Math.min(res, num);
        }
        return res;
    }
    public static String removeDuplicateLetters(String s) {
        if(s == null || s.length() == 0) return s;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), i);
        }

        char[] res = new char[map.size()];
        int start = 0;

        int end = findMinLastPos(map);
        for(int i = 0; i < res.length; i++){
            char minChar = 'z' + 1;
            for(int k = start; k <= end; k++){
                if(map.containsKey(s.charAt(k)) && s.charAt(k) < minChar){
                    minChar = s.charAt(k);
                    start = k + 1;
                }
            }
            res[i] = minChar;
            map.remove(minChar);
            if(s.charAt(end) == minChar){
                end = findMinLastPos(map);
            }
        }
        return new String(res);
    }

    // Palindromic Substrings
    public static int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        int res = 0;
        for (int len = 1; len <= s.length(); len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        res++;
                    }
                }
            }
        }
        return res;
    }

    // Longest Common Subsequence
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++)
            for(int j = 1; j <= n; j++)
                if(text1.charAt(i-1) == text2.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        return dp[m][n];
    }

    //Array
        /* 238. Product of Array Except Self
        Given an integer array nums, return an array answer such that answer[i]
        is equal to the product of all the elements of nums except nums[i].
        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]
        */
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;

        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = cur;
            cur *= nums[i];
        }

        cur = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            res[i] *= cur;
            cur *= nums[i];
        }
        return res;
    }

    /* 189. Rotate Array
    Given an array, rotate the array to the right by k steps, where k is non-negative.
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
     */
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    /* 128. Longest Consecutive Sequence
    Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
    You must write an algorithm that runs in O(n) time.
    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
     */
    public static int longestConsecutive(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
                // sum: length of the sequence n is in
                int sum = left + right + 1;
                map.put(n, sum);

                // keep track of the max length
                res = Math.max(res, sum);

                // extend the length to the boundary(s)
                // of the sequence
                // will do nothing if n has no neighbors
                map.put(n - left, sum);
                map.put(n + right, sum);
            } else {
                // duplicates
                continue;
            }
        }
        return res;
    }
    /* 739. Daily Temperatures
    Given an array of integers temperatures represents the daily temperatures,
    return an array answer such that answer[i] is the number of days you have to
    wait after the ith day to get a warmer temperature.
    If there is no future day for which this is possible, keep answer[i] == 0 instead.
    Input: temperatures = [73,74,75,71,69,72,76,73]
    Output: [1,1,4,2,1,1,0,0]
     */
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }

     /* 56. Merge Intervals
    Given an array of intervals where intervals[i] = [starti, endi],
    merge all overlapping intervals, and return an array of the non-overlapping intervals
    that cover all the intervals in the input.
    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
     */
     public static int[][] merge(int[][] intervals) {
         if (intervals == null || intervals.length == 0) return intervals;
         List<int[]> res = new ArrayList<>();

         Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

         int[] cur = intervals[0];
         for (int i = 1; i < intervals.length; i++) {
             if (intervals[i][0] > cur[1]) {
                 res.add(cur);
                 cur = intervals[i];
             } else {
                 cur[1] = Math.max(cur[1], intervals[i][1]);

             }
         }
         res.add(cur);
         return res.toArray(new int[res.size()][2]);
     }

     /* 48. Rotate Image
    You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[7,4,1],[8,5,2],[9,6,3]]
     */
     public static void rotate(int[][] matrix) {
         int n = matrix.length;
         for (int i = 0; i < n; i++) {
             for (int j = i; j < matrix[0].length; j++) {
                 int temp = 0;
                 temp = matrix[i][j];
                 matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
             }
         }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n / 2; j++) {
                 int temp = 0;
                 temp = matrix[i][j];
                 matrix[i][j] = matrix[i][n - 1 - j];
                 matrix[i][n - 1 - j] = temp;
             }
         }
     }
     /* 15. 3Sum
    Given an integer array nums, return all the triplets
    [nums[i], nums[j], nums[k]] such that i != j, i != k,
    and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
     */
     public static List<List<Integer>> threeSum(int[] nums) {
         if (nums == null || nums.length < 3) return new ArrayList<>();
         List<List<Integer>> res = new ArrayList<>();

         Arrays.sort(nums);
         for (int i = 0; i < nums.length - 2; i++) {
             if (i != 0 && nums[i] == nums[i - 1]) continue;

             int left = i + 1;
             int right = nums.length - 1;
             while (left < right) {
                 int sum = nums[i] + nums[left] + nums[right];
                 if (sum == 0) {
                     res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                     while (left < right && nums[left + 1] == nums[left]) {
                         left++;
                     }
                     left++;
                     while (left < right && nums[right - 1] == nums[right]) {
                         right--;
                     }
                     right--;
                 } else if (sum > 0) {
                     right--;
                 } else if (sum < 0) {
                     left++;
                 }
             }
         }
         return res;
     }

     /* 73. Set Matrix Zeroes
    Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
    Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
    Output: [[1,0,1],[0,0,0],[1,0,1]]
     */
     public static void setZeroes(int[][] matrix) {
         boolean rowZero = false;
         boolean colZero = false;
         int m = matrix.length;
         int n = matrix[0].length;

         for(int i = 0; i < m; i++){
             for(int j = 0; j < n; j++){
                 if(matrix[i][j] == 0){
                     if(i == 0) rowZero = true;
                     if(j == 0) colZero = true;

                     matrix[i][0] = 0;
                     matrix[0][j] = 0;
                 }
             }
         }
         for(int j = 1; j < n; j++){
             if(matrix[0][j] == 0){
                 for(int i = 1; i < m; i++){
                     matrix[i][j] = 0;
                 }
             }
         }
         for(int i = 1; i < m; i++){
             if(matrix[i][0] == 0){
                 for(int j = 0; j < n; j++){
                     matrix[i][j] = 0;
                 }
             }
         }
         if(rowZero){
             for(int j = 0; j < n; j++){
                 matrix[0][j] = 0;
             }
         }
         if(colZero){
             for(int i = 0; i < m; i++){
                 matrix[i][0] = 0;
             }
         }
     }

     /* 560. Subarray Sum Equals K
    Given an array of integers nums and an integer k,
    return the total number of continuous subarrays whose sum equals to k.
    Input: nums = [1,1,1], k = 2
    Output: 2
     */
     public static int subarraySum(int[] nums, int k) {
         int n = nums.length;
         Map<Integer, Integer> map = new HashMap<>();
         map.put(0,1);

         int sum = 0;
         int res = 0;
         for(int i = 0; i < n; i++){
             sum += nums[i];
             if(map.containsKey(sum - k)){
                 res += map.get(sum - k);
             }
             map.put(sum, map.getOrDefault(sum, 0) + 1);
         }
         return res;
     }

      /* 1762. Buildings With an Ocean View
    There are n buildings in a line. You are given an integer array heights of size n
    that represents the heights of the buildings in the line.
    The ocean is to the right of the buildings. A building has an ocean view if the building can see the ocean
    without obstructions. Formally, a building has an ocean view if all the buildings to its right have a smaller height.
    Return a list of indices (0-indexed) of buildings that have an ocean view, sorted in increasing order.
    Input: heights = [4,2,3,1]
    Output: [0,2,3]
    Explanation: Building 1 (0-indexed) does not have an ocean view because building 2 is taller.
     */
      public int[] findBuildings(int[] heights) {
          List<Integer> temp = new ArrayList<>();
          int nextBiggest = 0;
          int j = heights.length - 1;

          while(j >= 0){
              if(heights[j] > nextBiggest) {
                  nextBiggest = heights[j];
                  temp.add(j);
              }
              j--;
          }
          int[] res = new int[temp.size()];
          int index = 0;
          for(int i = temp.size() - 1; i >= 0; i--){
              res[index] = temp.get(i);
              index++;
          }
          return res;
      }
}
