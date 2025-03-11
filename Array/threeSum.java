public class threeSum{
    public static void findSum(int[] arr, int target){
        int n= arr.length;
        int first, second, last;
        
        for(int i=0; i<n-1; i++){
            first=i;
            second=i+1;
            last=n-1;
            while(second <= last){
                if(arr[first]+arr[second]+arr[last]== target){
                    System.out.print(first+" "+second+" "+last);
                    return;
                }
                else if(arr[first]+arr[second]+arr[last] > target){
                    last--;
                }
                else{
                    second++;
                }
            }
        }
        System.out.print("there are no three present whose sum is equal to "+ target);
    }

    public static void main(String [] args){
        int[] arr= {2,6,7,9,10,14};
        int target=21;
        findSum(arr, target);
    }
}