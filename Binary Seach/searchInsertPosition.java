public class searchInsertPosition {
 public static int insertPosition(int[] arr,int key){
    int n=arr.length;
    int start=0, end=n-1, mid;
    int insert=-1;
    while (start<=end) {
        mid=start +(end-start)/2;
        if(arr[mid]==key){
            insert=mid;
            return insert;
        }
        else if(arr[mid]>key){
            insert =mid;
            end=mid-1;
        }
        else{
            start++;
        }
    }
    if(insert==-1){
        return n;
    }
    return insert;
 }
 public static void main(String[] args) {
    int [] arr={3,4,6,6,6,33,34};
    int key=6;
    System.out.println("The correct insert position will be -> "+(insertPosition(arr, key)));
  }
}
