

public class addElementinArray {
    public static void main(String[] args) {
        int arr[] = {3,6,2,2};
        int new_arr[] = new int[arr.length+1];

        //add at first
        new_arr[0] = 23;
        for(int i=1; i<new_arr.length; i++){
            new_arr[i]=arr[i-1];
        }
        for(int n:new_arr){
              System.out.print(n+" ");
              
        }

        System.out.println("\n");



        // add at last 
        new_arr[new_arr.length-1] = 23;
        for(int i=0; i<new_arr.length-1; i++){
            new_arr[i]= arr[i];
        }
         for(int n:new_arr){
              System.out.print(n+" ");
        }


        System.out.println("\n");

        // add middle
        int middle = arr.length/2;
        for(int i=0; i<middle; i++){
            new_arr[i]= arr[i];
        }

        new_arr[middle]=23;

        for(int i=middle+1; i<new_arr.length; i++){
            new_arr[i]=arr[i-1];
        }

        for(int n: new_arr){
            System.out.print(n+" ");
        }


          System.out.println("\n");
        int arr2[]=new int[5];
        arr2[4]=43;
     
        for(int n: arr2){
            System.out.print(n+" ");
        }
    }
}
