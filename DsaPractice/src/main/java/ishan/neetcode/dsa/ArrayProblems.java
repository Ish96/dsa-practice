package ishan.neetcode.dsa;

import java.util.*;

public class ArrayProblems {

    static boolean isAnagram(String s, String t){
        int[] counts = new int[26];

        for(char c : s.toCharArray()){
            counts[c-'a']++;
        }

        for(char c : t.toCharArray()){
            counts[c-'a']--;
        }

        for(int i: counts){
            if(i!=0){
                return false;
            }
        }

        return true;
    }

    static List<List<String>> groupAnagram(String[] strs){
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            List<String> list = hm.getOrDefault(key, new ArrayList<>());
            list.add(str);
            hm.put(key, list);
        }
        return new ArrayList<>(hm.values());
    }
}
