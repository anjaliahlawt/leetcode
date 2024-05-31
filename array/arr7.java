// //1512. Number of Good Pairs

// import java.util.*;
// public class arr7 
// {
//         public static void main(String[] args) 
//         {
//             System.out.println("enter the size of aaray");
//             Scanner input=new Scanner(System.in);
//             int n=input.nextInt();
//             int[]nums=new int[n];
//             System.out.println("enter the value of aaray");
//             for(int i=0;i<n;i++)
//             {
//                 nums[i]=input.nextInt();
//             }
//             System.out.println("the aaray is");
//             for(int i=0;i<n;i++)
//             {
//                System.out.println(nums[i]);
//             }
//             int count=0;
//             for(int i=0;i<n;i++)
//             {
//                 for(int j=i+1;j<n;j++)
//                 {
//                     if(nums[i]==nums[j])
//                     {
//                       count++;
//                     }
                    
//                 }
               
//             }
//             input.close();
//             System.out.println("the output is"+" "+count);
//         }
//  }
    

public class arr7
{
    public static void main(String[] args) 
    {
        int[] nums = {1,1,1,1};
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count=count+1;
                }
            }
        }
        System.out.println(count);
    }
}