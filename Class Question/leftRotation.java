import java.util.Arrays;

public class leftRotation {

    public static void rotate_array(int arr[]) {
        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 3, 6, 4, 6 };
        int k_position = 4;

        for (int i = 1; i <= k_position; i++) {
            rotate_array(arr);
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }

        int rotate_array[] = { 4, 6, 2, 3, 3, 6 };
        // check is rotated or not
        String str = Arrays.toString(arr);
        String rotated = Arrays.toString(rotate_array);
        String final_str = str + str;
        if (final_str.contains(rotated)) {
            System.out.println("\nThe given rotated array belongs to array");
        } else {
            System.out.println("\nthe given rotated doesn't belongs to array");
        }

        // check given array is rotatedsorted or not
        int arr3[] = { 3, 5, 5, 3 };
        int count = 0;
        for (int i = 0; i < arr3.length - 1; i++) {
            if (arr3[i] > arr3[i + 1]) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("not rotated s sorted array");
        } else {
            System.out.println(count);
            if (count == 0 || (count == 1 && arr3[0] >= arr3[arr3.length - 1]))
                System.out.println("rotated sorted array");
            else {
                System.out.println("not rotated sorted array");
            }
        }
    }
}
