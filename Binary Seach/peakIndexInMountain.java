public class peakIndexInMountain {
    public static int peakIndex(int[] arr)
    {
       int n= arr.length;
       int start=0, end=n-1, mid;
 
       while (start<=end) {
             mid= start+(end-start)/2;
              if(mid==n-1){
               return mid;
            }
             else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
             }
             else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                start++;
             }
             
             else{
                end--;
             }
       }

        return -1;
    }
   
    public static void main(String[] args) {
     int [] arr={2,3,4,6,46,366,666,2555,8,7};
     System.out.println("the index of peak element is "+peakIndex(arr));
   }   
}
