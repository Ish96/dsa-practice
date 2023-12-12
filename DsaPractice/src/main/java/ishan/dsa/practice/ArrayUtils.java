package ishan.dsa.practice;

public class ArrayUtils {

    public static int findLargest(int [] arr){
        int n = arr.length;
        int index = -1;
        for(int i=0; i<n; i++){
            index = i;
            for(int j=0; j<n; j++){
                if(arr[i] < arr[j]){
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
}
