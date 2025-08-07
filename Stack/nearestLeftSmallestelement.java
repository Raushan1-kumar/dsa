import java.util.*;

public class nearestLeftSmallestelement {

    public static int [] nearestLeftSmallestelementMethod(int arr[], int n){
         int ans[] = new int[n];

         Stack <Integer> stack = new Stack<>();

         for(int i=0; i<n; i++){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }

            ans[i] = stack.isEmpty()?-1:stack.peek();

            stack.push(arr[i]);
         }

         return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,2,5,6};
        int n=arr.length;
        int ans[] = nearestLeftSmallestelementMethod(arr, n);

        for(int val: ans){
            System.out.print(val +" ");
        }
    }
}
