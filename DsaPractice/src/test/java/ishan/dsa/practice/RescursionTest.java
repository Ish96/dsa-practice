package ishan.dsa.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class RescursionTest {

    @Test
    public void testPalidrome(){
        String s = "abcba";
        boolean palindrome = RecursionUtils.isPalindrome(s);
        Assertions.assertEquals(true, palindrome);

        String s1 = "abcdbca";
        boolean palindrome1 = RecursionUtils.isPalindrome(s1);
        Assertions.assertEquals(false, palindrome1);

        String s2 = "abcdcba";
        boolean palindrome2 = RecursionUtils.isPalindrome(s2);
        Assertions.assertEquals(true, palindrome2);


        String s3 = "ishan";
        boolean palindrome3 = RecursionUtils.isPalindrome(s3);
        Assertions.assertEquals(false, palindrome3);
    }

    @Test
    public void testSumOfDigits(){
        int n = 253;
        int answer = RecursionUtils.sumOfDigits(n);
        Assertions.assertEquals(10, answer);

        n = 10;
        answer = RecursionUtils.sumOfDigits(n);
        Assertions.assertEquals(1, answer);

        n =7887;
        answer = RecursionUtils.sumOfDigits(n);
        Assertions.assertEquals(30, answer);

        n =9345;
        answer = RecursionUtils.sumOfDigits(n);
        Assertions.assertEquals(21, answer);
    }

    @Test
    public void testRopeCut(){
        int ans = RecursionUtils.ropeCut(5, 2, 5, 1);
        Assertions.assertEquals(5, ans);

        ans = RecursionUtils.ropeCut(23,12,9,11);
        Assertions.assertEquals(2, ans);

        ans = RecursionUtils.ropeCut(5,4,2,6);
        Assertions.assertEquals(-1, ans);
    }

    @Test
    public void testSubString(){
        String s = "ABC";
        Set<String> strings = RecursionUtils.subString(s);
        System.out.println(strings);
        Assertions.assertNotNull(strings);
    }

}
