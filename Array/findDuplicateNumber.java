import java.util.HashSet;

public class findDuplicateNumber{
    public static void findindDuplicateNumber(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        
        System.out.print("Duplicate numbers are :-  ");
        for(int nums: arr){
            // in HashSet you can only add unique integer therefore when duplicate comes then if condition will execute and give duplicate element
            // otherwise element will continously added in set you can print them
           if(!set.add(nums)){
            System.out.print(nums+"  ");
           } 
        }
   
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 3, 5, 63,3};
        findindDuplicateNumber(arr);
    }
}