
import java.util.*;

public class longestMountain{
    public static void longestSequenceMountain(int[] arr){
        int n= arr.length;
        List<Integer> set= new ArrayList<>();
        int first, second;
        for(int i=1; i<n; i++){
            first=i-1;
            second=i;
            if(arr[first]>arr[second]){
                set.add(arr[first]);
               System.out.println("Highest peak will be "+arr[first]);
               System.out.print(set);
                return;
            }
            else if(second==n-1){
                set.add(arr[first]);
                set.add(arr[second]);
                System.out.println("Highest peak will be "+arr[second]);
                System.out.print(set);
                 return;
            }
            else{
              set.add(arr[first]);
              
            }
    }

    }
    public static void main(String[] args){
        int[] arr={1,3,5,6,67,69};
        longestSequenceMountain(arr);
    }
}
