import java.util.*;

public class stockSpanProblem {

    public static int[] stockSpanProblemMethod(int arr[], int n){
        int ans[] = new int[n];
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && stack.peek().getValue() <= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = i+1;
            }else{
                ans[i]=i-stack.peek().getKey();
            }

            stack.push(new AbstractMap.SimpleEntry<>(i,arr[i]));

            
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {100,23,59,66,90,20};
        int n= arr.length;
        int span[] = stockSpanProblemMethod(arr, n);

        for(int val : span){
            System.out.print(val + " ");
        }
    }
}
