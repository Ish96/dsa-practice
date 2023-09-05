package ishan.dsa.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RecursionUtils {

    public static boolean isPalindrome(String s){
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        return isPalindrome(s.substring(1, s.length()-1));
    }

    public static int sumOfDigits(int n){
        if(n < 10){
            return n;
        }
        int sum = n%10;
        return sum + sumOfDigits(n/10);
    }

    public static int ropeCut(int n, int a, int b, int c){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }
        if(n%2 == 1 && a%2==0 && b%2==0 && c%2==0){
            return -1;
        }
        return 1 + getMaxFrom3(ropeCut(n-a,a,b,c), ropeCut(n-b,a,b,c),ropeCut(n-c,a,b,c));
    }

    private static int getMaxFrom3(int ropeCut, int ropeCut1, int ropeCut2) {
        if(ropeCut >= ropeCut1 && ropeCut >= ropeCut2){
           return ropeCut;
        }
        if(ropeCut1 >= ropeCut && ropeCut1 >= ropeCut2){
            return ropeCut1;
        }
        if(ropeCut2 >= ropeCut && ropeCut2 >= ropeCut1){
            return ropeCut2;
        }
        return ropeCut;
    }

    public static Set<String> subString(String s){
        HashSet<String> sb = new HashSet<>();
        getSubString(s,0, "", sb);
        return sb;
    }

    private static void getSubString(String s, int i, String curr, HashSet<String> sb) {
        if(i >= s.length()){
            sb.add(curr);
            return;
        }
        getSubString(s, i+1, curr + s.charAt(i), sb);
        getSubString(s, i+1, curr, sb);
    }
}
