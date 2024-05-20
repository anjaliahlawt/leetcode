//167. Two Sum II - Input Array Is Sorted
import java.util.Arrays;

public class sear
{
    public static void main(String[] args) 
    {
        int []arr={-1,0};
        
        int n =arr.length;
        int target=-1;
      int[]ans= sum(arr,target,n);
      System.out.println(Arrays.toString(ans));
    
    }
        static int[] sum(int[]arr,int target, int n )
        {
            int[] ans = new int[2];
          for(int i=0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
        
    }
}









