import java.util.*;

public class Imp {

    public static void main(String[] args) {
        int arr[] = {2,2,3,6,6,23,60};
        int repeat =0;
        int second_repeat=0;
        int sum =0;
        int even =0;
        int odd =0;
        int largest=-22;
        int check_sorted =0;
        int divibleByThree =0;

        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> repeatSet = new HashSet<>();


        int last_element =arr[0];
        for(int i=0; i<arr.length; i++){

            //storing unique element in set for calculating no. of unique element in array
            set.add(arr[i]);

            // calculating sum of all element
            sum += arr[i];

            //finding largest element
            if(largest <arr[i] ){
                largest=arr[i];
            }

            //checking for given array is sorted or not  for ascending only
            if(last_element<=arr[i]){
                last_element=arr[i];
            }
            else{
                check_sorted=1;
            }

            // checking for second repeating element 
            if(repeatSet.contains(arr[i])){
                repeat++;
                if(repeat ==2){
                   second_repeat=arr[i];
                }
            }
            else{
                repeatSet.add(arr[i]);
            }
        }

        for(int i =0; i<arr.length; i++){

          // checking for divisible by 3
          if(arr[i] %3 ==0){
            divibleByThree++;
          }


            if(arr[i] %2 ==0){
                even++;
            }
            else{
                odd++;
            }
        }

      //second largest element 
      
      int second=-1;

      for(int i =0 ;i<arr.length; i++){
         if(arr[i]>second && arr[i] != largest){
            second=arr[i];
         }
      }
      
     System.out.println("sum is "+sum);
     System.out.println("Even is "+even);
     System.out.println("Odd is "+odd);
     System.out.println("Largest element is "+largest);
     System.out.println("The second largest number is "+second);
     System.out.println("The total element is divisible by 3 is "+divibleByThree);
     if(check_sorted==0){
        System.out.println("the given array is sorted");
     }
     else{
        System.out.println("the given array is unsorted");
     }

     System.out.println("the total number of unique element is "+set.size());
     System.out.println("The second repeating element is "+second_repeat);
    }
}