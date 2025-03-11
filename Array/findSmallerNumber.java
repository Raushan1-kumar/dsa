import java.util.Arrays;
import java.util.HashMap;

public class findSmallerNumber{
      public static int[] smallerNumbersThanCurrent(int [] nums){
        int n = nums.length;

        // creating duplicate array for sorting
        int [] sortedNums = nums.clone();

        //sorting array using predefined method
        Arrays.sort(sortedNums);

        // create hashmap for storing unique <key, value>  key should we unique
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){

            //putting value in map when value(sortedNums[i]) is unique along with their index value
            map.putIfAbsent(sortedNums[i], i);
        }

        int[] result = new int[n];

        for( int i=0; i<n; i++){
            // putting their correspond value for each nums[i] store in map
            result[i]= map.get(nums[i]);
        }
       return result;
      }

      public static void main(String[]  args){
        int [] nums = {3,53,3,6,9,7};
        // we can also use loop for printing result array but this is efficient way to show
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
      }
}