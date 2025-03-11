public class twoElementWithMaxDifference {
    public static int maxDifference(int[] arr){
        int n=arr.length;
        int max=0;
        int diff=0;
        for(int i=0; i<n-1; i++){
           diff=0;
           for(int j=i+1; j<n; j++){
              diff=arr[j]-arr[i];
              max=Math.max(max,diff);
              System.out.println(max);
           }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr={2,-2,6,56};
        int answer= maxDifference(arr);
        System.out.println(answer);
    }
}



// public class twoElementWithMaxDifference {
//     public static int maxDifference(int[] arr){
//         int n=arr.length;
//         int max=arr[n-1];
//         int diff=0;
//         int[] arr1= new int[n];
//         arr1[n-1]=max;
//         for(int i=n-2; i>=0; i--){
//             max=Math.max(max, arr[i]);
//             arr1[i]=max;
//         } 
//         max=0;
//         for(int i=n-2; i>=0; i--){
//             diff=arr1[i+1]-arr[i];
//             max=Math.max(max, diff);
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int [] arr={2,-1,6,12,21,11};
//         int answer= maxDifference(arr);
//         System.out.println(answer);
//     }
// }

