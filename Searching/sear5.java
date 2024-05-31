//367. Valid Perfect Square

//using linear search
/* 
public class sear5 
{
    public static void main(String[] args)
    {
        int nums=14;
        boolean result= perfect(nums);
        System.out.println(result);
    }
    static boolean perfect(int nums){
        for(int i=1;i<=nums;i++)
        {
          int square=i*i;
          if(square==nums)
          {
            return true;
          }
        }
        return false;
        
    }
}
*/

public class sear5
{
    public static void main(String[] args) 
    {
        int nums=1;
       boolean ans= perfect(nums);
       System.out.println(ans);
        
    }
    static boolean perfect(int nums)
    {
      long start=1;
      long end =nums;
      while(start<=end)
      {
        long mid=(start+end)/2;
        if(mid*mid==nums)
        {
            return true;
        }
        if(mid*mid>nums)
        {
            end=mid-1;
        }
        if(mid*mid<nums)
        {
            start=mid+1;
        }
      }
      return false;
      
    }
}