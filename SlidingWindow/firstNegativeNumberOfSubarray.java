
// import java.util.*;

public class firstNegativeNumberOfSubarray {
    public static void firstNegativeNumberMethod1(int arr[], int k) {
        int n = arr.length;
        int i = 0, j = 0;

        while (j < n) {
            if (j - i + 1 == k) {
                int t = i;
                while (t <= j) {
                    if (arr[t] < 0) {
                        System.out.println(arr[t]);
                        break;
                    }
                    t++;
                }
                i++;
                j++;
            }

            else {
                j++;
            }
        }
    }




    // public static void firstNegativeNumberMethod2(int arr[], int k) {
    //     int n = arr.length;
    //     int i = 0, j = 0;
    //     List<Integer> allNegativeNumber = new ArrayList<>();

    //     while (j < n || i < n - 2) {
    //         if (j - i + 1 < k) {
    //                if (arr[j] < 0) {
    //                 allNegativeNumber.add(arr[j]);
    
    //             }
    //             j++;
    //         } 
    //         else {
    //                if (arr[j] < 0) {
    //                 allNegativeNumber.add(arr[j]);
    //             }
    //             System.out.println(allNegativeNumber.get(0));
    //           if(allNegativeNumber.contains(arr[i]));
    //           {
    //             allNegativeNumber.remove(0);
    //           }
    //           i++;
    //           j++;
    //         }
    //     }
    // }

    public static void main(String[] args) {
        int arr[] = { 3, -2, 6, -3, 2, -2, -2, 2 };
        int k = 3;
        firstNegativeNumberMethod1(arr, k);
        System.out.println("________________-");
        // firstNegativeNumberMethod2(arr, k);               //something is wrong in this method
    }
}
