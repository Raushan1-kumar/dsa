public class squarerootproblem {
  public static int squareroot(int [] arr, int key){
  int n=arr.length;
  int start=0, end=n-1, mid;

  while(start<=end){
      mid= start +(end-start)/2;

      if(arr[mid]==key/arr[mid]){
          return mid;
      }
      else if(arr[mid]>key/arr[mid]){
           end--;
      }
      else{
        start++;
      }
  }
    return -1;
  } 


  public static void main(String[] args) {
    int [] arr={2,3,5,9};
    int key=9;
    System.out.println(squareroot(arr, key));
  }
}