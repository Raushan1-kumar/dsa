
import java.util.Arrays;

public class binarySearch {
    public static int binarysearch(int [] arr, int key){
         int n= arr.length;
         Arrays.sort(arr);

         int left=0, right=n-1,mid;
          while(left<=right){
            mid=left+(right-left/2);
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid] >key){
                right--;
            }
            else{
                left++;
            }
          }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={3,6,54,3,534,64,300};
        int key=3;
        int ans=binarysearch(arr, key);
        for(int i=0; i<arr.length; i++){
        }
        if(ans==-1){
            System.out.println("key is not present in array");
        }
        else{
            System.out.println("key is present in the array at index "+ans);
        }
    }
}
