//This is nothing but two pointer approach

import java.util.Arrays;

public class squareOfSortedArray2{
    public static int[] sortedArray_square(int [] arr){
        int n = arr.length;
        int left=0, right=n-1;
        int index=n-1;
        int [] result = new int[n];

        while(left <=right){
            if(Math.abs(arr[left])> Math.abs(arr[right])){
                result[index] = arr[left]*arr[left];
                left++;
            }
            else{
                result[index] = arr[right]*arr[right];
                right--;
            }
         index--;
        }
        return result;
    }

    public static void main(String [] args){
        int[] arr = {-6,-4,5,6,7};
        System.out.print(Arrays.toString(sortedArray_square(arr)));
    }
}