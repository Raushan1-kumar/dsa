public class smallestSubarrayOfSumK {
    
    public static int smallestSubarraySumK(int arr[] , int k){
        int n = arr.length;
        int i=0, j=0, sum=0, minLength= 10000;

        while( j< n){
            sum += arr[j];
            if(sum < k){
                j++;
            }
            else{
                
                while(i<=j || sum >= k){
                    minLength = Math.min(j-i+1, minLength);
                   sum -= arr[i];
                   i++;
                }
                j++;
            }
        }

       minLength = Math.min(j-i+1, minLength);
        return minLength;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,2,2,23,9};
        int k=21;

        System.out.println("The minimum length is "+smallestSubarraySumK(arr, k));

    }
}
