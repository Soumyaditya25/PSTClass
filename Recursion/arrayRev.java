
import java.util.*;
public class arrayRev {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] reverse=reverseArr(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(reverse));
    }

    public static int[] reverseArr(int[] arr,int low,int high){
        if(low>=high){
            return arr;
        }
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;

        return reverseArr(arr,low+1,high-1);
    }
}
