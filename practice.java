public class practice {

    public static int maxSubarray(int arr[], int k){
        int n= arr.length;
        int sum=0;
        int currentCount=0, maxCount=0;

        for(int i=0; i<n; i++){
            sum=0;
            for(int j=i; j<n; j++){
             sum +=arr[j];
              if(sum !=0 && sum % k==0){
                maxCount = Math.max(maxCount, j-i+1);
             }
             if(maxCount==n){
                break;
             }
            }
        }




        return maxCount;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,0,-2,-3,1};
        int k=5;
        
    }
}
