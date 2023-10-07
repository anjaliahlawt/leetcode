//program.Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.*;
public class cond2 
{
    public static void main(String[] args) 
     {
        Scanner input=new Scanner(System.in);
        System.out.println("enter trhe number");
        int n =input.nextInt();
        int sum_of_negative_number=0;
        int sum_of_even_number=0;
        int sum_of_odd_number=0;
        if(n<0)
        {
          for( int i=0;i>=n;i--)
          {
            sum_of_negative_number=sum_of_negative_number+i;
          }
        System.out.println(sum_of_negative_number);
        }
        else
        {
        for(int j=1;j<=n;j++)
          {
            if(j%2==0)
            {
               sum_of_even_number=sum_of_even_number+j;
            }
            else
            {
               sum_of_odd_number=sum_of_odd_number+j;
            }
          }
        System.out.println(sum_of_even_number);
        System.out.println(sum_of_odd_number);
       }
       input.close();
               
     }
}
    
