//1431. Kids With the Greatest Number of Candies
import java .util.*;
public class arr6
{
 public static void main(String[] args)
  {
    int []candies={12,1,12};
  
    boolean [] arr = new boolean[candies.length];
  
  
    boolean[] k=kids(candies,arr);
    
      System.out.println(Arrays.toString(k));
    
   
    
  }
    static boolean[] kids(int[] candies,boolean[] arr)
    {
        int max=0;
        int extra=10;
        int n =candies.length;
       
      for(int i=0;i<n;i++)
      {
        if(candies[i]>max)
        {
            max=candies[i];
        }
      }
      
      for(int i=0;i<n;i++)
      {
        if(candies[i]+extra>max)
        {
            arr[i]= true;
           
        }
        else
        {
            arr[i]=false;
        }
        
      
      }
      return arr;
      
    }
    
    
   
 }

 


