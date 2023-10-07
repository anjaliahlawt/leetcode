//program.HCF Of Two Numbers Program
import java.util.*;
public class HcfOfTwoNumber
{
        public static void main(String[] args)
         {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the first number");
            int a=input.nextInt();
            System.out.println("enter the seconfd number");
            int b=input.nextInt();
            int hcf=0;
            for(int i=1;i<a||i<b;i++)
            {
                if(a%i==0&& b%i==0)
                 hcf=i;
            }
            System.out.println(hcf);
            input.close();
        }
    }
    

