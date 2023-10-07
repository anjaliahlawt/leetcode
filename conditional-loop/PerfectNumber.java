
//program.Perfect Number In Java
import java.util.*;

public class PerfectNumber 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("entre the value");
        int n = input.nextInt();
        int rem = 0;
        for (int i = 1; i <= n / 2; i++)
         {
            if (n % i == 0) 
            {
                rem = rem + i;
            }
        }
        if (rem == n)
         {
            System.out.println("is an perfect number" + rem);
        }
         else 
        {
            System.out.println("is not a perfect number" + rem);
        }
        input.close();
    }
}
