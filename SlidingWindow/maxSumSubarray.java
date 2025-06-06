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

        for(int j=0; j<n; j++){
            if(j-i+1 ==k){
             sum +=arr[j];
              maxSum = Math.max(maxSum, sum);
              sum = sum-arr[i];
              i++;
            }
            else{
                sum += arr[j];
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


