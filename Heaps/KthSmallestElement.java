
import java.util.Collections;
import java.util.PriorityQueue;


public class KthSmallestElement {
    
    public static int maxHeap(int arr[], int k){
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr){
            maxheap.add(num);
            if(maxheap.size()>k){
                maxheap.poll();
            
            }
        }
        return maxheap.peek();
    }
    public static void main(String[] args) {
        int arr[] = {3,5,23,52,2,0};
        int k=3;
        System.out.println("The "+k+" smallest element in array is "+maxHeap(arr, k));
    }
}
