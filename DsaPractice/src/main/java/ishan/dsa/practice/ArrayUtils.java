package ishan.dsa.practice;

public class ArrayUtils {

    public static int findLargest(int [] arr){
        int n = arr.length;
        int index = -1;
        for(int i=0; i<n; i++){
            index = i;
            for (int k : arr) {
                if (arr[i] < k) {
                    index = -1;
                    break;
                }
            }
        }
        return index;
    }

    public static int findLargetsV2(int [] arr){
        int n = arr.length;
        int max = 0;
        for(int i=1; i<n; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static int findSecondLargest(int [] arr){
        int largest = findLargetsV2(arr);
        int n = arr.length;
        int max =0;
        for(int i=1; i<n; i++){
            if(i!= largest){
                if(arr[max] < arr[i]){
                    max = i;
                }
            }
        }
        return max;
    }

    public static boolean checkArrayIsSortedInNonDecrease(int [] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void reverseArray(int [] arr){
        int n = arr.length;
        for(int i = 0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    public static void reverseArrayV2(int [] arr){
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    //Time: Big O n square, Space: constant
    public static int removeDuplicatesFromSortedArray(int[] arr) {
        int distinctArraySize = 1;
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length -1; j++){
                if(arr[i] != arr[j]){
                    if(j != i+1){
                        arr[i+1]= arr[j];
                    }
                    distinctArraySize ++;
                    break;
                }
                if(arr[i]==arr[j]){
                    j++;
                }
            }
        }
        return distinctArraySize;
    }

    //Time: Big O n, Space: Big O n
    public static int removeDuplicatesFromSortedArrayV2(int[] arr) {
        int [] temp = new int[arr.length];
        int res = 1;
        temp[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(temp[res-1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        System.arraycopy(temp, 0, arr, 0, temp.length);
        return res;
    }

    //Time: Big O n, Space: constant
    public static int removeDuplicatesFromSortedArrayV3(int[] arr) {
        int res = 1;
        for(int i = 1; i<arr.length; i++) {
            if (arr[res - 1] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void moveZeroToEnd(int [] arr){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                if(i != res){
                    arr[res]= arr[i];
                    arr[i] = 0;
                }
                res++;
            }
        }
    }

    public static void leftRotateArrayByOne(int [] arr){
        int temp = arr[0];
        int n = arr.length;
        for(int i = 1; i< n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }

    public static void leftArrayRotateByNumber(int [] arr, int n){
        for(int i = 0; i<n; i++){
            leftRotateArrayByOne(arr);
        }
    }

    public static void leftArrayRotateByNumberV2(int [] arr, int n){
        int [] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr[i];
        }
        for(int i = n; i<arr.length; i++){
            arr[i-n] = arr[i];
        }
        for(int i = 0; i<n; i++){
            arr[arr.length - n + i] = temp[i];
        }
    }

}
