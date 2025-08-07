public class question1 {
    public static void longestSubarraySum(int arr[], int key) {
        int n = arr.length;
        int start = 0, end=key;
        int sum=arr[0]+arr[1]+arr[2];
        int maxSum=sum;
        for(end=3; end<n; end++){
            sum=sum-arr[start]+arr[end];
            maxSum=Math.max(sum, maxSum);
            start++;
        }
        System.out.println("Max sum is "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={53,5,3,5,3,22,22};
        int key=3;
        longestSubarraySum(arr, key);
    }
}

//finding the longest subarray with a given max sum