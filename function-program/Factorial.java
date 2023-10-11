// Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also, 
// 1! = 1 
// 0! = 1


import java.util.Scanner;
public class Factorial 
{
   public static void main(String[] args) 
   {
        Scanner input=new Scanner(System.in);
        System.out.println("enter trhe value");
        int n=input.nextInt();
        int factorial=factorial(n);
        input.close();
    }

 public static int factorial(int n)
 {
   int count=1;
   for(int i=1;i<=n;i++)
   {
      count=count*i;
   }
  System.out.println("the factorial of "+ n +"is" +count);
  return count;
 
 }
}
    

