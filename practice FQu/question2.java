public class question2 {



    public static void longestSubarray(int arr[] , int value){
        int n = arr.length;
        int count =1;
        int i=0;
        int maxcount=0;
        int sum=arr[0];
        for(int j=1; j<n; j++){
            sum=sum+arr[j];
            if(sum ==value){
                count++;
                maxcount=Math.max(maxcount, count);
                count=count-1;
                sum=sum-arr[i];
                i++;
            }
            else if(sum < value){
                count++;
            }
            else{
                sum= sum-arr[i];
                i++;
            }
        }

        System.out.println("longest subarray is "+maxcount);
    }
    public static void main(String[] args) {
        int arr[]={2,23,2,3,5,1,1,1,1,1,2,3};
        longestSubarray(arr, 5);
    }
}
