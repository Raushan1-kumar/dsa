
// to find largest element we need to use min heap

import java.util.PriorityQueue;

public class KthLargestElement {

    public static int minHeap(int arr[], int k){
       PriorityQueue<Integer> minheap= new PriorityQueue<>();

       for(int value:arr){
          minheap.add(value);
          if(minheap.size()>k){
            minheap.poll();
          }
       }
       System.out.println(minheap);
      return minheap.peek();
    }
    public static void main(String[] args) {
        int arr[]={3,5,24,45,2,1};
        int k=3;
        System.out.println(minHeap(arr, k));
    }
}
