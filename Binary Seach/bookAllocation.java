public class bookAllocation {
    public static int bookallocated(int[] arr, int totalStudent)
    {
      int n=arr.length;
      int max=0;
      int sum=0;
      int page, count, ans=-1;
      for(int i=0; i<n; i++){
        if(arr[i]>max){
            max=arr[i];
        }
        sum+=arr[i];
      }

      int start=max, end=sum , mid;
      while(start<=end)
      {
        mid=(start+end)/2;
        page=0;
        count=1;
        for(int i=0; i<n; i++){
            page += arr[i];
            if(page > mid){
              count++;
              page=arr[i];
            }
        }
         
        if(count<=totalStudent){
            ans=mid;
            end=mid-1;
        }
        else{
            start=mid+1;
        }
      }

      return ans;
    }

    public static void main(String[] args) {
        int [] arr={63,43,3,62};
        int totalStudent=2;
        System.out.println(bookallocated(arr, totalStudent));
    }
}
