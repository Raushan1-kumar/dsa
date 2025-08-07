
import java.util.*;
public class rainTrappingWater {
    public static int[] nearestRightLargestElement(int arr[], int n){
       
        int ans[] = new int[n];
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek().getValue() <= arr[i]){
                stack.pop();
            }

            ans[i] = stack.isEmpty()?arr[i]+1:stack.peek().getKey();

            stack.push(new AbstractMap.SimpleEntry<>(i, arr[i]));

        }
        return ans;
    }

    public static int[] nearestLeftLargestElement(int arr[], int n){
         int ans[] = new int[n];
         Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();

         for(int i=0; i<n; i++){
            while(!stack.isEmpty() && stack.peek().getValue() >= arr[i]){
                stack.pop();
            }

            ans[i] = stack.isEmpty()?-1:stack.peek().getKey();

            stack.push(new AbstractMap.SimpleEntry<>(i, arr[i]));

         }

         return ans;
    }

    public static int rainTrappingWaterMethod(int arr[], int n){
        int right[] = nearestRightLargestElement(arr,n);
        int left[] = nearestLeftLargestElement(arr, n);
        int currentarea=0;
        int maxArea =0;
        for(int i=0; i<n; i++){
            currentarea= (right[i]-left[i]-1)*arr[i];
            maxArea = Math.max(maxArea, currentarea);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[]={5,3,2,1,2,5};
        int n= arr.length;
        System.out.println("the max area for rain trap water is "+ rainTrappingWaterMethod(arr, n));
    }
}
