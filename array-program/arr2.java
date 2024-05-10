// Concatenation of Array
/* 
import java.util.*;
public class arr2 
{
    
        public static void main(String[] args) 
        {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the size of array");
            int n = input.nextInt();
            int[] nums = new int[n];
            int[] ans = new int[2 * n];
            System.out.println("enter the value of array");
            for (int i = 0; i < n; i++) 
            {
                nums[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) 
            {
                 System.out.println(nums[i]);
                ans[i] = nums[i];
                 System.out.println(nums[i]);
            }
            System.out.println("the array afetr concente");
            for (int i = 0; i < n; i++) 
            {
                ans[i + n] = nums[i];
            }
            for (int i = 0; i < 2 * n; i++) 
            {
                System.out.println(ans[i]);
            } input.close();
    
        }
    }
    */
    public class arr2
    {
        public static void main(String[] args) 
        {
            int[]arr={1,2,1};
            int n =arr.length;
            int []ans=new int[2*n];
            for(int i=0;i<n;i++)
            {
                ans[i]=arr[i];
                ans[i+n]=arr[i];
                //System.out.println(ans[i]);
            }
            for(int i=0;i<2*n;i++)
            {
                System.out.print(ans[i]);
            }

        }
    }

