
import java.util.*;

public class nearestLeftLargestelement {
      
    public static int [] nearestLeftLargestelementMethod(int arr[], int n){
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
          while(!stack.isEmpty() && stack.peek() <= arr[i]){
               stack.pop();
          }

          ans[i] = stack.isEmpty()? -1: stack.peek();

          stack.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,2,3};
        int n= arr.length;
        int ans[] = nearestLeftLargestelementMethod(arr, n);

        for(int val: ans){
            System.out.print(val+" ");
        }
    }
}
