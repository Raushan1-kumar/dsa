public class countOccurrence {

   public static int totalOccurrence(int [] arr, int key){
          int n=arr.length;
          int start=0, end=n-1, mid;
          int count=0;
          int first=-1, last=-1;

          while (start<=end) {
               mid=start+(end-start)/2;
               if(arr[mid]==key){
                   end=mid-1;
                   first=mid;
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
          while (start<=end) {
            mid=start+(end-start)/2;
            if(arr[mid]==key){
               start=mid+1;
               last=mid;
            }
            else if(arr[mid]>key){
               end--;
            }
            else{
             start++;
            }
       }
       System.out.println(first+"->"+last);
     if(first==-1){
        return 0;
     }
      count=last-first+1;
      return count;
   }


    public static void main(String[] args) {
        int [] arr={3,6,6,6,32,253};
        int key=6;

        System.out.println("the total number of occurrence is -> "+totalOccurrence(arr, key));

    }
}
