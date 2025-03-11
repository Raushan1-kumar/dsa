
// Approach 1

// import java.util.HashSet;

// public class bitManipulationSingleNumber{
//     public static void bitManipulation(int[] arr){
//         int n= arr.length;
        
//         HashSet<Integer> set = new HashSet<>();

//         for(int i=0; i<n; i++){
//              if(set.contains(arr[i])){
//                 set.remove(arr[i]);
//              }
//              else{
//                 set.add(arr[i]);
//              }
//         }

//         System.out.print(set);
//     }

//     public static void main(String [] args){
//          int arr[]  = {2,4,2,5,3,3,5,4};
//          bitManipulation(arr);
//     }
// }




// Approach 2 using HashMap



//  import java.util.HashMap;

//  public class bitManipulationSingleNumber{
//     public static void bitManipulation(int [] arr){
//         HashMap<Integer, Integer> result = new HashMap<>();

//         for(int num: arr){
//             result.put(num, result.getOrDefault(num, 0)+1);
//         }

//         for(int key: result.keySet()){
//             if(result.get(key)==1){
//                 System.out.print(key);
//                 return;
//             }
//         }
//         System.out.print(-1);
//     }

//     public static void main (String [] args){
//         int[] arr= {2,3,3,5,2,6,5};
//         bitManipulation(arr);
//     }
//  }



//Approach 3 Best approach because it's time complexity is O(n) and space complexity is O(1)


public class bitManipulationSingleNumber{
    public static int bitManipulation(int[] arr){
        int result =0;
        for(int num: arr){
            result ^=num;
        }
        return result;
    }

    public static void main(String [] args){
        int [] arr = {2,3,3,5,2,5,6};
        System.out.print(bitManipulation(arr));
    }
}