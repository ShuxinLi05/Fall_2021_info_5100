package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] str1 = {"eat","tea","tan","ate","nat","bat"};
        String[] str2 = {""};
        String[] str3 = {"a"};

        System.out.println(groupAnagramsTogether(str1));
        System.out.println(groupAnagramsTogether(str2));
        System.out.println(groupAnagramsTogether(str3));

    }
    public static List<List<String>> groupAnagramsTogether(String[] str){
        //ArrayList<String> arr = new ArrayList<>();
        if(str.length == 0 || str == null) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(String s : str){
            String sortedStr = sortStr(s);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(s);

        }
        for(List<String> temp : map.values()){
            res.add(temp);
        }
        return res;

    }
    public static String sortStr(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

}
