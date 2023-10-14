public class Sear2 
{
 public static void main(String[] args) 
 {
    int n=1;
    int pick=1;
    int result=guess_number(n,pick);
    System.out.println(result);
    
 } 
 static int guess_number(int n,int pick)
 {
    int start=0;
    int end=n;
    int ans=0;
   while(start<=end)
   {
        
       int nums=(start+end)/2;
        if(nums==pick)
        {
            return nums;
        }
       if(nums<pick)
        {
            ans=nums;
            start=nums+1;
        }
        else
        {
            end=nums-1;
        }
   
 }  
 return ans;
}
}