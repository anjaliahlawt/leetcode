//program 18.Compound Interest Java Program
import java.util.*;
public class CompoundIntrest
{
    public static void main(String[] args)
     {
         Scanner input=new Scanner(System.in);
         System.out.println("enter thevalue of every digit");
         double p=input.nextDouble();
         double r=input.nextDouble();
         double n=input.nextDouble();
         double a=p*(Math.pow((1+r/100),n));
         System.out.println(a);
         input.close();
    }
}
    

