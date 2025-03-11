

import java.util.*;

public class minimumAbsoluteDifference{
    public static List<List<Integer>> minimumDifference(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int diff=0;
        int minDiff= Integer.MAX_VALUE;

        List<List<Integer>> set = new ArrayList<>();

        for(int i=1; i<n; i++){
            diff = arr[i]- arr[i-1];
            if(diff < minDiff){
                minDiff= diff;
                set.clear();
            }

            if(diff== minDiff){
                set.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
    return set;
    }


    public static void main(String [] args){
         int arr[] = {2,56,3,8,4,6};
         System.out.print(minimumDifference(arr));
    }
}