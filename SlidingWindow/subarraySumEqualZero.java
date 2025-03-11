//Given an array arr of integers. determine if there exists a contiguous subarray whose sum is equal to zero

import java.util.HashMap;

public class subarraySumEqualZero{
    public static int subarrays(int [] arr){
        int n=arr.length;
        int sum=0;
        int count=0;

        HashMap<Integer, Integer> prefixFreq = new HashMap<>();

        prefixFreq.put(0,1);

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(prefixFreq.containsKey(sum)){
                count += prefixFreq.get(sum);
            }
        prefixFreq.put(sum, prefixFreq.getOrDefault(sum, 0)+1);

        }
        return count;
    }


    public static void main(String [] args){
         int [] arr = {1,3,-4,2,-2,-4,4};
         System.out.print(subarrays(arr));

    }
}