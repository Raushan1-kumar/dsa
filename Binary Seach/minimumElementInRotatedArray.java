public class minimumElementInRotatedArray {
  
        public static int smallestElement(int[] arr)  //method 1 to solve
        {
           int n= arr.length;
           int start=0, end=n-1, mid;
     
           while (start<=end) {
                 mid= start+(end-start)/2;
                  if(mid==n-1){
                   return mid;
                }
                 else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    System.out.println(mid);
                    return arr[mid+1];
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
        public static int smallestElement2(int[] arr){    //method 2 to solve this problem
          int n=arr.length;
          int start=0, end=n-1, mid;
          int element=arr[0];

          while (start<=end) {
              mid = start +(end-start)/2;
              System.out.println(mid);
              if(arr[mid]>=arr[0]){
                   start=mid+1;
              }
              else{
                element=arr[mid];
                end=mid-1;
              }

            }
            return element;
        }        public static void main(String[] args) {
         int [] arr={4,3};
         System.out.println("the minimum element is "+smallestElement(arr));
         System.out.println("The minimum element in rotated array is " +smallestElement2(arr));
       }   
    }
    
