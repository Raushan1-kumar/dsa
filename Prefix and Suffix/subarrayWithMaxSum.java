// public class subarrayWithMaxSum {
//     public static int subarray(int[] arr){
//         int n=arr.length;
//         int max=0;
//         int prefixSum=0;

//          for(int i=0; i<n; i++){
//             prefixSum=0;
//             for(int j=i; j<n;j++){
//                 prefixSum += arr[j];
//                 max= Math.max(max,prefixSum);
//             }
//          }
//         return max;
//     }

//     public static void main(String[] args) {
//         int [] arr={4,-6,8,2};
//         int ans=subarray(arr);
//         System.out.println(ans);
//     }
// }






public class subarrayWithMaxSum {

    public static int subarray(int[] arr) {
        int n = arr.length;
        int max = 0;
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum = prefixSum + arr[i];

            max = Math.max(max, prefixSum);
            if (prefixSum < 0) {
                prefixSum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, -6, 8, 2 };
        int ans = subarray(arr);
        System.out.println(ans);
    }
}