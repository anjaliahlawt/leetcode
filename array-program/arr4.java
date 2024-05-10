//Richest Customer Wealth
// import java.util.*;
// public class arr4 
// {
     
//        public static void main(String[] args)
//         {
//             Scanner input = new Scanner(System.in);
//             int rows = input.nextInt();
//             System.out.println("enter the rows");
//             System.out.println("entre the column");
//             int columns = input.nextInt();
//             int[][] accounts = new int[rows][columns];
//             System.out.println("enter the elements of aaray");
//             for (int i = 0; i < rows; i++)
//              {
//                for (int j = 0; j < columns; j++)
//                 {
//                     accounts[i][j] = input.nextInt();
//                 }
//              }
//             System.out.println("elements of array are");
//             for (int i = 0; i < rows; i++) 
//             {
//                 for (int j = 0; j < columns; j++)
//                 {
//                   System.out.print(accounts[i][j] + " ");
    
//                 }
//                  System.out.println();
//              }
//            System.out.println("the sum of rows");
//            int greater = 0;
//             for (int i = 0; i < rows; i++) 
//             {
//             int sum = 0;
//                 for (int j = 0; j < columns; j++)
//                  {
//                     sum = sum + accounts[i][j];
                   
//                  }
//               System.out.println(sum);
//                if (greater < sum)
//                 {
    
//                      greater = sum;
//                  }
//             }
//            System.out.println("the greater  sum of rows" + greater);
//            input.close();
//      }
//  }
    
public class arr4
{
  public static void main(String[] args) 
  {
    int[][]arr={{1,2,3},{3,2,1}};
    //int n =arr.length;
   int greater=0;
    for(int i=0;i<arr.length;i++)
    {
      int sum=0;
      for(int j=0;j<arr[i].length;j++)
      {
         sum=sum+arr[i][j];
      }
      if(greater<sum)
      {
         greater=sum;
      }
    }
    System.out.println(greater);
  }
}