//1365. How Many Numbers Are Smaller Than the Current Number
import java.util.*;
public class arr8 
{
        public static void main(String[] args) 
        {
            System.out.println("enter the size of aaray");
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            int[]nums=new int[n];
            int[]ans=new int[n];
            System.out.println("enter the value of aaray");
            for(int i=0;i<n;i++)
            {
                nums[i]=input.nextInt();
            }
            System.out.println("the aaray is");
            for(int i=0;i<n;i++)
            {
               System.out.println(nums[i]);
            }
            for( int i=0;i<n;i++)
            {
               int count=0;
               for(int  j=0;j<n;j++)
               {
                  if(nums[j]<nums[i])
                  {
                     count++;
                   
                  }
                }
          ans[i]=count;
          System.out.println(count);
          input.close();
            }
            
        }
}
    
