//1389. Create Target Array in the Given Order

// import java.util.*;
// public class arr9 
// {
//         public static void main(String[] args)
//          {
//             Scanner input=new Scanner(System.in);
//             System.out.println("enter the size of array");
//             int n=input.nextInt();
//             int nums[]=new int[5];
//             int index[]=new int[5];
//             int target[]=new int[n];
//             System.out.println("enter the value of nums array ");
//             for(int i=0;i<n;i++)
//             {
//                 nums[i]=input.nextInt();
//             }
//             System.out.println(Arrays.toString(nums));
//             System.out.println("enter teh value of array");
//              for(int i=0;i<n;i++)
//             {
//                 index[i]=input.nextInt();
//             }
           
//            System.out.println(Arrays.toString(index));
            
//            for(int i=0;i<n;i++)
//            {
//              target[index[i]]=nums[i];
//             System.out.println(target[i]);
//            }
//            input.close();
          
          
    
//         }
//   }

public class arr9
{
    public static void main(String[] args) 
    {
        int arr[]={0,1,2,3,4};
        int[]index={0,1,2,2,3};
        int []target=new int[5];
        int n =index.length;
        
            for(int i=0;i<n;i++)
            {
              target[index[i]]=arr[i];
              System.out.print(target[i]);

            }
        
}}