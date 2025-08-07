public class maxSubarrayofSumK {
    public static int maxSubarrayLength(int arr[], int k) {
        int maxLength = 0;
        int sum = 0;
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            while (sum > k && i <= j) {
                sum -= arr[i];
                i++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 32, 2, 3, 5, 2, 3, 8 };
        int k = 12;
        System.out.println("max length is " + maxSubarrayLength(arr, k));
    }
}
