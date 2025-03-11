import java.util.Arrays;

public class squareOfSortedArray{
    public static int[] sortedArray_square(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
             arr[i]*=arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String [] args){
        int[] arr={-2,-1,6,7,8};
        System.out.print(Arrays.toString(sortedArray_square(arr)));
    }
}