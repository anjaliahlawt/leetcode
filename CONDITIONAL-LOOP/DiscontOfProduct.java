 //program 15.Calculate Discount Of Product
import java.util.*;
public class DiscontOfProduct 
{
     public static void main(String[] args) 
        {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the origuinal price of the product");
            float n=input.nextFloat();
            System.out.println("enter the discount precntsge");
            float d=input.nextFloat();
            float discountamount=(d/100)*n;
            float finalprice=n-discountamount;
            System.out.println("discount amount is"+discountamount);
            System.out.println("final price is "+finalprice );
            
        }
    }
    

