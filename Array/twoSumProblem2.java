import java.util.HashMap;

public class twoSumProblem2{
    public static int[] twoSum(int[] arr, int  target){
        int n=arr.length;
        int requiredNumber=0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            requiredNumber = target-arr[i];
            if(map.containsKey(requiredNumber)){
                return new int[]{map.get(requiredNumber), i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        
        return new int[]{};
    }

    public static void main(String[] args){
        int[] arr={3,5,6,3,2};
        int target = 11;
        int result [] = twoSum(arr, target);
        System.out.println(result[0] +" "+result[1]);
    }
}