package ishan.dsa.practice;

import java.util.ArrayList;

public class StringUtils {

    public static void main(String[] args) {
     //search("geek","geeksforgeeks").forEach(System.out::println);
        boolean additiveSequence = isAdditiveSequence("14748");
        System.out.println(additiveSequence);
    }

   static ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        int pLength = pattern.length();
        int tLength = text.length();
        String temp =text;
        ArrayList<Integer> result = new ArrayList<>();
        int occ = text.indexOf(pattern);
        if(occ != -1){
            result.add(occ+1);
            int j = occ+pLength;
            while(j < tLength)
            {
                occ = temp.substring(j,tLength).indexOf(pattern);
                if(occ != -1)
                {
                    j = occ+1+pLength;
                    result.add(j);
                }else{
                    break;
                }
            }
        }

        return result;
    }

    public static boolean isAdditiveSequence(String n) {
        // code here
        return func(0,n.toCharArray(), n.length());
    }

    public static boolean func(int i, char arr[], int len){
        Integer s = Integer.parseInt(String.valueOf(arr[i])) + Integer.parseInt(String.valueOf(arr[i+1]));
        if(s<9 && s.intValue() == Integer.parseInt(String.valueOf(arr[i+2]))){
            if(i+2 >= len-1){
                return true;
            }
            return func(i+1, arr, len);
        }else if(s>9 && i+3 <=len-1 && s.intValue() == Integer.parseInt(arr[i + 2] +String.valueOf(arr[i+3]))){
            if(i+3 >= len-1){
                return true;
            }
            return func(i+1, arr, len);
        }
        return false;
    }
}
