//1470. Shuffle the Array
// import java.util.*;
// public class arr5 
// {
//         public static void main(String[] args) 
//         {
//             Scanner input=new Scanner(System.in);
//             System.out.println("enter the size of aaray");
//             int n=input.nextInt();
//             int[]nums=new int[2*n];
//              int[]ans=new int[2*n];
//             System.out.println("enter the value of aaray");
//             for(int i=0;i<2*n;i++)
//             {
//                 nums[i]=input.nextInt();
//             }
//             System.out.println("the array is");
//             for(int i=0;i<2*n;i++)
//             {
//                 System.out.print(nums[i] + " ");
//             }
//             System.out.println();
//             int j=0;
           
//              for( int i=0;i<2*n;i=i+2)
//              {
//                 ans[i]=nums[j];
//                  ans[i+1]=nums[j+n];
//                  j++;
//              }
//               for(int i=0;i<2*n;i++)
//               {
//                 System.out.print(ans[i] + " ");
//               }
//               input.close();
//         }
// }
    
import java.util.*;
public class arr5
{
    public static void main(String[] args) 
    {
        int []arr={2,5,1,3,4,7};
        int n =3;
        int []ans=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i=i+2)
        {
            ans[i]=arr[j];
             ans[i+1]=arr[j+n];
             j++;
        }
         System.out.println(Arrays.toString(ans));  
     }
}