// public class containerWithWater {
    
//     public static int maxWaterStore(int[] arr){
//         int n=arr.length;
//         int minDiff;
//         int last=arr[n-1];
//         int width=0;
//         int current;
//         int ans=0;
        
//         for(int i=n-2; i>=0; i--){
//             width++;
//             minDiff=Math.min(last, arr[i]);
//             current=minDiff*width;
//             ans=Math.max(ans, current);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,8,6,2,3,4,6,9,6};
//            System.out.println(maxWaterStore(arr));
//     }
// }
