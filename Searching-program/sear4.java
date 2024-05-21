//167. Two Sum II - Input Array Is Sorted

// using linear search

/* 
import java.util.Arrays;

public class sear4
{
    public static void main(String[] args) 
    {
        int []arr={2,3,4};
        
        int n =arr.length;
        int target=6;
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
                    ans[0]=i+1;
                    ans[1]=j+1;
                }
            }
        }
        return ans ;
        
    }
}

 */
import java .util.*;

public class sear4
{
    public static void main(String[] args) 
    {
        int[]arr={2,7,11,15};
        int target=9;
     int []ans=sum(arr,target);
        System.out.println(Arrays.toString(ans));
        
    }
    static int [] sum(int[]arr,int target){
        int[] ans = new int[2];
        
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
          int sum=arr[start]+arr[end];
          if(sum==target)
          {
            ans[0]=start+1;
            ans[1]=end+1;
            return ans;
            
          }
          if(target>sum)
          {
            start++;
          }
          if(target<sum)
          {
            end--;
          }
        }
        return ans;
      

        
    }
}








