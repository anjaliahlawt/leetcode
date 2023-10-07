//program 13.Factorial Program In Java
import java.util.*;
public class Factorail 
{
    public static void main(String[] args) 
    {
         System.out.println("enter the number");
         Scanner input=new Scanner(System.in);
         int n=input.nextInt();
         int count=1;
         for(int i=1;i<=n;i++)
        {
          count=count*i;
        }
        System.out.println(count);
        input.close();
    }
 }
       
    
