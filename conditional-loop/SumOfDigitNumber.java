
//program.Sum Of A Digits Of Number
import java.util.*;

public class SumOfDigitNumber
{
    public static void main(String[] args)
    {
             Scanner input=new Scanner(System.in);
             System.out.println("enter the number");
             int n=input.nextInt();
             int rem,sum=0;
             while(n>0)
             {
                 rem =n%10;
                 sum=sum+rem;
                 n=n/10;
             }
             System.out.println(sum);
             input.close();
     }
}

