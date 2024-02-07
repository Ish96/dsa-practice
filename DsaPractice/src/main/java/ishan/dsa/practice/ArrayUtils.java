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
}
