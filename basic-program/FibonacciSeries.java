import java.util.*;
public class FibonacciSeries
{
    public static void main(String[] args) 
    {
        System.out.println("enter the value of n");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<=n;i++)
        {
           c=a+b;
           System.out.print(c);
           a=b;
           b=c;
        
        }
        input.close();
    }
   
}