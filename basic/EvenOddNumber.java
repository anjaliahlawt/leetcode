//program 1.Write a program to print whether a number is even or odd, also take input from the user

import java.util.*;
  public class EvenOddNumber
{
    public static void main(String[] args) 
    {
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n%2==0)
        {
            System.out.println(n+"is an even number");
        }
        else
        {
            System.out.println( n+ "is odd number");
        }
        input.close();
    }
  }