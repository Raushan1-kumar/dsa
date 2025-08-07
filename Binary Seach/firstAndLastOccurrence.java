public class firstAndLastOccurrence {

    public static void firstandlast(int [] arr, int key){
        int n= arr.length;
        int start=0, end=n-1, mid;
        int first=-1 , last=-1;

        while(start<=end){
            mid= start +(end-start)/2;
            if(arr[mid]==key){
              first =mid;
              end=mid-1;
            }
            else if(arr[mid]>key){
                end--;
            }
            else{
                start++;
            }
        }
       start=0; 
       end=n-1;
        while(start<=end){
            mid= start +(end-start)/2;
            if(arr[mid]==key){
              last =mid;
              start=mid+1;
            }
            else if(arr[mid]>key){
                end--;
            }
            else{
                start++;
            }
        }


        System.out.println("first"+first+"last"+last);
    }


    public static void main(String[] args) {
        int [] arr={2,2,2,3,4};
        int key=2;
        firstandlast(arr, key);
    }
    
}