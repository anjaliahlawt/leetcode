//Build Array from Permutation
import java.util.*;
public class arr1
 {
        public static void main(String[] args) 
        {
           Scanner input=new Scanner(System.in);
           System.out.println("entrevthe aaray value to store");
           int n=input.nextInt();
           int[] nums = new int[n]; 
           int[] ans = new int[n]; 
           System.out.println("entrevthe aaray value of aaray");
           for(int i=0;i<n;i++)
           {
            nums[i]=input.nextInt();  
           }
          System.out.println("Array elements are: "); 
          for (int i=0; i<n; i++)   
           {  
             System.out.println(nums[i]);  
            } 
          System.out.println("the array is "); 
            for (int i=0; i<n; i++)   
           {  
            ans[i]=nums[nums[i]];
           
             System.out.println(ans[i]);  
            }  
            input.close();
    }
 }
