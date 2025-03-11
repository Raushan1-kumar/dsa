import java.util.Arrays;



public class twoSumProblem{
    public static int twoSum(int[] arr, int target){
        int n= arr.length;
        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);
        int left =0;
        int right = n-1;
       
        while(left<right){
           if(arr[left] + arr[right] == target){
                System.out.print(left +" "+right);
                return 1;
           }
           else if(arr[left] + arr[right] < target){
                left++;
           }
           else{
                right--;
           }
        }
        if(!(left<right)){
            System.out.println("There are no two number present whose sum is equal to "+target);
        }
        return 0;
    }

    public static void main(String [] args){
        int[] arr = {1,5,3,6,7,8};
        int target= 6;
        twoSum(arr, target);
    }
}