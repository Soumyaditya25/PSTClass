// sum of array using recursion

public class sumArray {
    public static int sumarray(int[] arr, int i) {
        if(i==arr.length){
            return 0;
        }
        int result=arr[i]+sumarray(arr,i+1);
        return result;
    }
    public static void main(String[] args) {
        int[] arr={3,1,4,3};
        System.out.println(sumarray(arr,0));
    }
}
