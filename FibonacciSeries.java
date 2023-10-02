//program 7.To calculate Fibonacci Series up to n numbers.

import java.util.*;
public class FibonacciSeries
    {
        public static void main(String[] args)
         {
             System.out.println("enter the numeber");
             Scanner input=new Scanner(System.in);
             int a=0,b=1,c;
             int n=input.nextInt();
             for(int i=0;i<=n;i++)
             {
                System.out.print(a);
                c=a+b;
                a=b;
                b=c;
             }
            input.close();
        }
    }
    
    
