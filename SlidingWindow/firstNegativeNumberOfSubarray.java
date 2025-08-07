
import java.util.*;

import java.util.ArrayList;

public class firstNegativeNumberOfSubarray {
    public static void firstNegativeNumberMethod1(int arr[], int k) {
        int n = arr.length;
        int i = 0, j = 0;

        while (j < n) {
            if (j - i + 1 == k) {
                int t = i;
                while (t <= j) {
                    if (arr[t] < 0) {
                        System.out.println(arr[t]);
                        break;
                    }
                    t++;
                }
                i++;
                j++;
            }

            else {
                j++;
            }
        }
    }




    public static void firstNegativeNumberMethod2(int arr[], int k) {
        int n= arr.length;
        int i=0 , j=0;
        List<Integer> list= new ArrayList<>();

        while(j < n){
            if(arr[j]< 0){
                list.add(arr[j]);
            }

            if(j-i+1 < k){
                j++;
            }

            else{
                if(list.size()==0){
                    System.out.println(0);
                }
                else{
                    System.out.println(list.get(0));
                }

                if(list.get(0)==arr[i]){
                    list.remove(0);
                }
                i++;
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, -2, 6, -3, 2, -2, -2, 2 };
        int k = 3;
        firstNegativeNumberMethod1(arr, k);
        System.out.println("________________-");
        firstNegativeNumberMethod2(arr, k);               //something is wrong in this method
    }
}
