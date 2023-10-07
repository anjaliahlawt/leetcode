//program 11.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
public class SumOfAllNumber 
{
    public static void main(String[] args)
    {  
     Scanner input=new Scanner(System.in);
     System.out.println("enter the number");
     int n=input.nextInt();
     int count=0;
     for(int i=1;i<=n;i++)
     {
        count=count+i;
     }
     System.out.println(count);        
   }
}
