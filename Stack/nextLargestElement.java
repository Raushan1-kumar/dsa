
import java.util.*;
public class nextLargestElement {

    public static int[] nextLargestElementMethod(int arr[], int n){
       int ans[] = new int[n];
       Stack<Integer> stack = new Stack<>();

       for(int i=n-1; i>=0; i--){
         
         while(!stack.isEmpty() && stack.peek() <= arr[i]){
              stack.pop();
         }
          
         ans[i]=stack.isEmpty()?-1:stack.peek();

         stack.push(arr[i]);
       }
      
      return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        int  n = arr.length;
        int ans[] = nextLargestElementMethod(arr, n);

        for(int val:ans){
         System.out.println(val+" ");
        }
    }
}
