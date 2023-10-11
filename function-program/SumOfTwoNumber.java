 //program.Write a program to print the sum of two numbers entered by user by defining your own method.

import java .util.Scanner;
public class SumOfTwoNumber
 {
     public static void main(String[] args) 
     {
         Scanner input=new Scanner(System.in);
         System.out.println("enter the first number");
         int num1=input.nextInt();
         System.out.println("enter the second number");
         int num2=input.nextInt();
         int sum_of_two_number=sum_of_two_number(num1,num2);
         input.close();
    
      }
    
    public static int sum_of_two_number(int num1,int num2)
    {
         int result=num1+num2;
         System.out.println("sum of two number" +result);
         return result;
        
    }
    }
    

