//Build Array from Permutation
// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]
// Explanation: The array ans is built as follows: 
// ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//     = [0,1,2,4,5,3]

/* 
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
 */

public class arr1
{
    public static void main(String[] args) 
    {
        int[]nums={0,2,1,5,3,4};
        int n=nums.length;
        int []ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[nums[i]];
            System.out.println(ans[i]);
        }
    }
}