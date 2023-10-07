//area of traingle
import java.util.*;
public class AraeOfTraingle 
{
    public static void main(String[] args)
        {   
            Scanner input=new Scanner(System.in);
            System.out.println("enter the value of base");
            int b =input.nextInt();
            System.out.println("enter the valuer of heighjt");
            int h=input.nextInt();
            int area_of_traingle;
            area_of_traingle=(b*h)/2;
            System.out.println( "THE AREA OF TRAINGLE IS" +" "+ area_of_traingle );
    
        }
        
    
}
