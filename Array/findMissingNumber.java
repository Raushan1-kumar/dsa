

public class findMissingNumber {
    public static int findingMissingNumber(int[] arr){
        int n= arr.length + 1;
        int expectedSum = n*(n+1)/2;
        int actualSum =0;

        for(int num: arr){
            actualSum += num;
        }

        int missingNumber = expectedSum- actualSum;

        return missingNumber;
    }

   public static void main(String [] args){
      int[] arr = {1,3,4,5,6,7,8,9};
      System.out.println(findingMissingNumber(arr));
   }
}