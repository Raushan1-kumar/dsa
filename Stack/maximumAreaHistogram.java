// This question is also known as MAH

import java.util.*;

public class maximumAreaHistogram {
    public static int[] rightNearestSmallestElement(int []arr, int n){
        int ans[] = new int[n];

        Stack<Map.Entry<Integer, Integer>>stack = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek().getValue()>=arr[i]){
                stack.pop();
            }

            ans[i]=stack.isEmpty()?-1:stack.peek().getKey();

            stack.push(new AbstractMap.SimpleEntry<>(i,arr[i]));


        }
        return ans;
    }

    public static int[] leftNearestSmallestElement(int []arr, int n){
        int ans[]= new int[n];

        Stack<Map.Entry<Integer, Integer>> stack= new Stack<>();

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && stack.peek().getValue() >= arr[i]){
                 stack.pop();
            }

            ans[i] = stack.isEmpty()?-1:stack.peek().getValue();

            stack.push(new AbstractMap.SimpleEntry<>(i,arr[i]));
        }

        return ans;
    }

    public static int maximumAreaHistogramMethod(int []arr,int n){
       int right[] = rightNearestSmallestElement(arr, n);
       int left[] = leftNearestSmallestElement(arr, n);
       int max=0;
       int sum=0;


       for(int i=0; i<n; i++){
         sum = (right[i]-left[i]-1)*arr[i];
         max=Math.max(max, sum);
       }

        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,3,8,7,4,1,6};
        int n = arr.length;

        System.out.println("The maximum area histogram is "+ maximumAreaHistogramMethod(arr, n));
    }
}
