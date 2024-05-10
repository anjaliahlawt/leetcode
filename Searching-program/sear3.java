//278. First Bad Version
public class sear3 
{
    public static void main(String[] args)
    {
        int n=10;
        int bad=3;
        int result=search(n,bad);
        System.out.println(result);
    }
    static int search(int n,int bad)
 {
    int start=1;
    int end=n;
    int ans=0;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(mid==bad)
        {
            return mid;
        }
         if(mid<bad)
        {
            ans=mid;
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return ans;
  }
}