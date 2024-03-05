package ishan.neetcode.dsa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayProblemsTest {

    @Test
    public void testIsAnagram(){
        boolean anagram = ArrayProblems.isAnagram("racecar", "carrace");
        Assertions.assertTrue(anagram);
        anagram = ArrayProblems.isAnagram("abcv", "abcz");
        Assertions.assertFalse(anagram);
    }

    @Test
    public void testGroupAnagram(){
        String[] strs= new String[]{"bat", "ate", "eat", "tea", "nat", "tan"};
        List<List<String>> lists = ArrayProblems.groupAnagram(strs);
        Assertions.assertTrue(lists.contains(Arrays.asList("ate","eat","tea")));
    }
}
