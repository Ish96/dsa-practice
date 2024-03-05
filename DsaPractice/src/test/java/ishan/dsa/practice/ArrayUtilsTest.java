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

    @Test
    public void testMoveZeroToEnd(){
        int [] arr = new int[]{8,5,0,0,10,0,20};
        ArrayUtils.moveZeroToEnd(arr);
        int [] exp = new int[]{8,5,10,20,0,0,0};
        Assertions.assertArrayEquals(exp,arr);
        arr = new int[]{0,0,0,10,0,0};
        ArrayUtils.moveZeroToEnd(arr);
        exp = new int[]{10,0,0,0,0,0};
        Assertions.assertArrayEquals(exp,arr);
    }

    @Test
    public void testLeftRotateArrayByOne(){
        int [] arr = new int[]{1,2,3,4,5};
        ArrayUtils.leftRotateArrayByOne(arr);
        int [] exp = new int[]{2,3,4,5,1};
        Assertions.assertArrayEquals(exp, arr);
    }

    @Test
    public void testLeftRotateArrayByNumber(){
        int [] arr = new int[]{1,2,3,4,5};
        ArrayUtils.leftArrayRotateByNumber(arr, 3);
        int [] exp = new int[]{4,5,1,2,3};
        Assertions.assertArrayEquals(exp, arr);
    }

    @Test
    public void testLeftRotateArrayByNumberV2(){
        int [] arr = new int[]{1,2,3,4,5};
        ArrayUtils.leftArrayRotateByNumberV2(arr, 3);
        int [] exp = new int[]{4,5,1,2,3};
        Assertions.assertArrayEquals(exp, arr);
    }

    @Test
    public void testMaxWater(){
        int [] arr = new int[]{16, 11, 16, 62, 2, 97, 61, 1, 66, 32, 58, 48, 17, 5, 93, 3, 83, 91, 84, 14, 5, 52, 58, 26, 37, 36, 81, 55, 55, 40, 65, 24, 97, 98, 75, 88, 97, 29, 45, 36, 77, 40, 26, 13, 84, 90, 89, 91, 43, 41, 51, 66, 86, 63, 96, 92, 8, 60, 77, 99, 60, 90, 59, 48, 30, 49};
        int maxWater = ArrayUtils.maxWater(arr, arr.length);
        arr = new int[]{2,1,3,4,5,6};
        maxWater = ArrayUtils.maxWater(arr, arr.length);
        Assertions.assertTrue(maxWater==8);
    }
}
