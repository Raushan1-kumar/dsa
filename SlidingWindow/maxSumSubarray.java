public class maxSumSubarray {

    public static int maxSumMethod1(int [] arr, int k){
        int n = arr.length;
        int sum =0; 
        int maxSum=0;
        int start=0;

        for(int i=0; i<k; i++){
            maxSum += arr[i];
        }
        sum = maxSum;
       
        for(int end =k; end<n; end++){
            sum = sum-arr[start]+arr[end];
            maxSum = Math.max(maxSum, sum);
            start++;
        }


        return maxSum;
    }
    
    public static int maxSumMethod2(int [] arr, int k){
        int n = arr.length;
        int i=0, sum=0, maxSum=0;
        int j=0;
        
        while(j<n){
             sum += arr[j];
            if(j-i+1 < k){
                j++;
            }
            else{
                maxSum= Math.max(sum, maxSum);
                sum = sum-arr[i];
                i++;
                j++;
            }
        }

        return maxSum;
    }
    
    
    public static void main(String[] args) {
        int [] arr={2,3,411,2,5,34,2,2};
        int k=2;
        System.out.println("The maximum sum of subarray is "+maxSumMethod1(arr, k));
        System.out.println("The maximum sum of subarray is "+maxSumMethod2(arr, k));
    }
}


