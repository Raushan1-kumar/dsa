import java.util.PriorityQueue;

public class KsortedArray {
    

    public static int[] minHeap(int arr[], int k){
         
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
         int ans[] = new int[arr.length];
         int i=0;
        for(int num: arr){
            minheap.add(num);
            if(minheap.size()>k){
                int temp=minheap.peek();
                ans[i]=temp;
                i++;
                minheap.poll();
            }
        }
        for(int j=1; j<=3; j++){
            int temp=minheap.peek();
                ans[i]=temp;
                i++;
                minheap.poll();
        }


        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {6,5,3,2,8,10,9};
        int k=3;
        int ans[] = minHeap(arr, k);
        for(int num: ans){
            System.out.print(num+ " ");
        }
    }
}
