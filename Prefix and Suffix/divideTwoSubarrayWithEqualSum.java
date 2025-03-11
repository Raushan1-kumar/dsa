
//brute case for this question

// public class divideTwoSubarrayWithEqualSum {
//     public static boolean twoSubarray(int arr[]){
//       int n = arr.length;
//       int sum_first_subarray=0;
//       int sum_second_subarray=0;

//       for(int i=0; i<n-1; i++){
//         sum_first_subarray += arr[i];
//         sum_second_subarray=0;
//         for(int j=i+1; j<n; j++){
//             sum_second_subarray +=arr[j];
//         }

//         if(sum_first_subarray == sum_second_subarray){
//             return true;
//         }
//       }
//         return false;
//     }   

//     public static void main(String[] args) {
//         int[] arr={3,4,-2,5,8,20,-10,8};
//         boolean answer = twoSubarray(arr);
//         System.out.println(answer);
//     }
// }




// import java.util.HashSet;;

// public class divideTwoSubarrayWithEqualSum {

//     public static boolean twoSubarray(int[] arr) {
//         int n = arr.length;
//         int sum = 0;
//         HashSet<Integer> map = new HashSet<>();
//         for (int i = 0; i < n; i++) {
//             sum += arr[i];
//             map.add(sum);
//         }
//         System.out.println(map);
//         if (sum % 2 != 0) {
//             return false;
//         } else {
//             sum = sum / 2;
//             if (map.contains(sum)) {
//                 return true;
//             }

//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 3, 4, -2, 5, 8, 20, -10, 8 };
//         boolean answer = twoSubarray(arr);
//         System.out.println(answer);
//     }

// }



public class divideTwoSubarrayWithEqualSum {

    public static boolean twoSubarray(int[] arr){
        int n= arr.length;
        int totalsum=0, ans,prefixsum=0;

        for(int i=0; i<n; i++){
            totalsum +=arr[i];
        }
       for(int i=0;i<n-1; i++){
          prefixsum += arr[i];
          ans=totalsum-prefixsum;

          if(ans == prefixsum){
            System.out.println(ans +"  "+prefixsum);
            return true;
          }
       }
        return false;
    }

    public static void main(String[] args) {
                int[] arr = { 3, 4, -2, 5, 8, 20, -10, 8 };
                boolean answer = twoSubarray(arr);
                System.out.println(answer);
            }
        
}