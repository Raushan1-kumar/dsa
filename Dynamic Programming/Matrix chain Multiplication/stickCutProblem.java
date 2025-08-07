import java.lang.annotation.Retention;
import java.util.Arrays;

public class stickCutProblem {
    
    public static void sortTheCuts(int cuts[],int n ,int length){
        int sortedCuts[] = new int[n+2];
        sortedCuts[0]=0;
        sortedCuts[n-1]=length;

        for(int i=1; i<n-1; i++){
            sortedCuts[i]=cuts[i-1];
        }

        Arrays.sort(sortedCuts);
        int i=0;
        int j=n-1;
        stickCutProblemMethod(sortedCuts, i, j);
    }
    public static int stickCutProblemMethod(int cuts[], int i,int j){
         int temp_ans=0;
         int ans=Integer.MAX_VALUE;
         
         if(j-i <=1){
                return 0;
         }
         for(int k=i+1; k<j; k++){
            temp_ans = stickCutProblemMethod(cuts, i, k)+stickCutProblemMethod(cuts, k,j)+(cuts[j]-cuts[i]);
            System.out.println(temp_ans);
            ans = Math.min(ans, temp_ans);

         }

        System.out.println("the minimum cost will be "+ans);
        
        return ans;
    }
    public static void main(String[] args) {
        int length=8;
        int cut[]= {1,3,4,5};
        int n=cut.length;
        sortTheCuts(cut, n, length);
    }
}
