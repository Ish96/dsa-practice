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

    @Test
    public void  testCheckArrayIsSortedInNonDecrease(){
        int [] arr = new int[]{5,8,12,20};
        Assertions.assertTrue(ArrayUtils.checkArrayIsSortedInNonDecrease(arr));
        arr = new int[]{2,5,12,3};
        Assertions.assertFalse(ArrayUtils.checkArrayIsSortedInNonDecrease(arr));
    }

    @Test
    public void testReverseArray(){
        int [] arr = new int[]{5,8,12,20};
        ArrayUtils.reverseArray(arr);
        Assertions.assertEquals(20, arr[0]);
        Assertions.assertEquals(12, arr[1]);
        arr = new int[]{30,7,6,5,10};
        ArrayUtils.reverseArray(arr);
        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(5, arr[1]);
        Assertions.assertEquals(6, arr[2]);
    }

    @Test
    public void testReverseArrayV2(){
        int [] arr = new int[]{5,8,12,20};
        ArrayUtils.reverseArrayV2(arr);
        Assertions.assertEquals(20, arr[0]);
        Assertions.assertEquals(12, arr[1]);
        arr = new int[]{30,7,6,5,10};
        ArrayUtils.reverseArrayV2(arr);
        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(5, arr[1]);
        Assertions.assertEquals(6, arr[2]);
    }

    @Test
    public void testRemoveDuplicatedFromSortedArray(){
        int [] arr =  new int[]{10,20,20,30,30,30};
        int n = ArrayUtils.removeDuplicatesFromSortedArray(arr);
        Assertions.assertEquals(3,n);
        Assertions.assertEquals(30, arr[2]);
        arr = new int[]{10,10,10};
        n = ArrayUtils.removeDuplicatesFromSortedArray(arr);
        Assertions.assertEquals(1,n);
    }

    @Test
    public void testRemoveDuplicatedFromSortedArrayV2(){
        int [] arr =  new int[]{10,20,20,30,30,30};
        int n = ArrayUtils.removeDuplicatesFromSortedArrayV2(arr);
        Assertions.assertEquals(3,n);
        Assertions.assertEquals(30, arr[2]);
        arr = new int[]{10,10,10};
        n = ArrayUtils.removeDuplicatesFromSortedArrayV2(arr);
        Assertions.assertEquals(1,n);
    }

    @Test
    public void testRemoveDuplicatedFromSortedArrayV3(){
        int [] arr =  new int[]{10,20,20,30,30,30};
        int n = ArrayUtils.removeDuplicatesFromSortedArrayV3(arr);
        Assertions.assertEquals(3,n);
        Assertions.assertEquals(30, arr[2]);
        arr = new int[]{10,10,10};
        n = ArrayUtils.removeDuplicatesFromSortedArrayV3(arr);
        Assertions.assertEquals(1,n);
    }
}
