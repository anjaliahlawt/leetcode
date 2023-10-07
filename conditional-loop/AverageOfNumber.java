 //program 14.Calculate Average Of N Numbers
import java.util.*;
public class AverageOfNumber 
{
   public static void main(String[] args) 
   {
        System.out.println("enter the number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0,avg;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        avg=sum/n;
        System.out.println(avg);
        input.close();
    }
}

