//69. Sqrt(x)


public class SquareRoot{
    public static void main(String[] args) {
        int n=21;
        int result=square(n);
        System.out.println(result);

        
    }
    static int square(int n)
    {
        int start=1;
        int end=n;
         int ans=0;
        while(start<=end)
        {
             int mid=(start+end)/2;
             int square= mid*mid;
             if(square==n)
             {
                return mid;
             }
            if(square<n)
            {
                ans = mid;
                start=mid+1;
               
              
            }
            else
            {
                end=mid-1;
            }
             
        }
        return ans;
        
    }
    
}