// public class bestTimeToBuyAndSell{
//     public static int maximumProfit(int[] arr){
//          int n = arr.length;
//          int minPrice = Integer.MAX_VALUE;
//          int maxProfit = 0;
         
//          for(int i=0; i<n; i++){
//             if(arr[i] < minPrice){
//                 minPrice = arr[i];
//             }
//             else{
//                 maxProfit = Math.max(maxProfit, (arr[i]-minPrice));
//             }
//          }
//        return maxProfit;
// }
//     public static void main(String [] args){
//         int[] arr={1,34,3,63,3};
//         System.out.println(maximumProfit(arr));
//     }

// }

import java.util.*;
public class bestTimeToBuyAndSell {
   
    public static void bestTimeToBuyAndSell1(int [] arr){

        int n=arr.length;
        int maxProfit=0; 
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i]<minPrice){
                minPrice=arr[i];
            }

            maxProfit=Math.max(maxProfit, arr[i]-minPrice);
        }
      System.out.println(maxProfit);
    }

    public static void bestTimeToBuyAndSellUsingStack(int arr[]){
        Stack<Integer> stack = new Stack<>();
        int  maxProfit=0;
        int n= arr.length;

        for(int i=0; i<n; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            else{
                if(stack.peek() > arr[i]){
                    stack.pop();
                    stack.push(arr[i]);
                }
                else{
                    maxProfit=Math.max(maxProfit, arr[i]-stack.peek());
                }
            }
        }
       System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,222,3,3,2};
         bestTimeToBuyAndSell1(arr);
         bestTimeToBuyAndSellUsingStack(arr);
    }
}