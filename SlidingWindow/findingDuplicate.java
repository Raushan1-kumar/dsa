// Given an array return true if any duplicate exists within a sliding window of size k.

import java.util.HashSet;

public class findingDuplicate {
    public static void findingDuplicateElement(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right;
        HashSet<Integer> set = new HashSet<>();
        set.add(arr[left]);
        for (right = 1; right < n; right++) {
            if (set.contains(arr[right])) {
                System.out.print(true);
                return;
            }
            set.add(arr[right]);

            if (set.size() > k) {
                set.remove(arr[left]);
                left++;
            }
        }
        System.out.print(false);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 7, 3 };
        int k = 3;
        findingDuplicateElement(arr, k);
    }
}