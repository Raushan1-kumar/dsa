import java.util.*;

public class nearestRightSmallestElement {
    
    public static int[] nearestRightSmallestElementMethod(int arr[], int n){
        int ans[] = new int[n];
        Stack <Integer> stack = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }

             ans[i] = stack.isEmpty()? -1: stack.peek();
             stack.push(arr[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,2,6,3,9};
        int n= arr.length;

        int ans []= nearestRightSmallestElementMethod(arr, n);

        for(int val: ans){
         System.out.print(val+ " ");
        }
    }
}
