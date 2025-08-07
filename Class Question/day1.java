public class day1 {
    public static void main(String [] args){


        int arr[] ={2,2,4,5,5,5,6,7,99};

        
        int count =1;
        int currect_unique=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] != currect_unique){
                count++;
                currect_unique=arr[i];
            }
        }

        System.out.println("the total number of unique element is "+count);
    }
}
