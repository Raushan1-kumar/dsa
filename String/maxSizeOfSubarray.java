
import java.util.ArrayList;
import java.util.List;

public class maxSizeOfSubarray {
    static public int maxSize(int[] arr) {
        int length = arr.length;
        int currentSize = 0;
        int maxSize = 0;
        List<Integer> map = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            while (map.contains(arr[i])) {
                currentSize = map.size();
                maxSize = Math.max(maxSize, currentSize);
                map.remove(0);
            }
            map.add(arr[i]);
        }

        currentSize = map.size();
        maxSize = Math.max(maxSize, currentSize);
        return maxSize;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 234, 23, 3, 2, 32, 23, 23 };

        int result = maxSize(arr);
        System.out.println("the Max subarray length is :" + result);
    }
}
