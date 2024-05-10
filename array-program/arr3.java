// Running Sum of 1d Array

// import java.util.*;
// public class arr3 
// {
//         public static void main(String[] args)
//          {
//             Scanner input=new Scanner(System.in);
//             System.out.println("enter the size of array");
//             int n=input.nextInt();
//             int []nums=new int[n];
//             int sums=0;
//             System.out.println("enter the value of aaray");
//             for(int i=0;i<n;i++)
//             {
//              nums[i]=input.nextInt();
//             }
//             System.out.println("the array is");
//              for(int i=0;i<n;i++)
//              {
//                 System.out.println(" "+nums[i]);
//              }
//              System.out.println("the aaray after the sum of value");
//              for(int i=0;i<n;i++)
//              {
//                 sums=sums+nums[i];
//                 nums[i] = sums;
//                 System.out.print(" "+sums);
//                }
//                input.close();
//         } 
// }


import java.util.Arrays;
public class arr3
{
    public static void main(String[] args) 
    {
        int[]arr={1,2,3,4};
        int n =arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
           sum=sum+arr[i];
           arr[i]=sum;
           
        }
        System.out.print(Arrays.toString(arr));;
    }
}