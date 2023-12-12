package ishan.dsa.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    @Test
    public void testFindLargest(){
        int [] arr = new int[]{5,8,12,20};
        int largest = ArrayUtils.findLargest(arr);
        Assertions.assertEquals(arr[largest], 20);
        largest = ArrayUtils.findLargetsV2(arr);
        Assertions.assertEquals(arr[largest], 20);
    }

    @Test
    public void testFindSecondLargest(){
        int [] arr = new int[]{5,8,12,20};
        int secondLargest = ArrayUtils.findSecondLargest(arr);
        Assertions.assertEquals(arr[secondLargest], 12);
    }
}
