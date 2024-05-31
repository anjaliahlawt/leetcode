 //program 16.Power In Java
import java.util.*;
public class Power
 {
   public static void main(String[] args) 
   {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the digit");
        double d=input.nextInt();
        System.out.println("enter the powerof value");
        double p=input.nextInt();
        double result=Math.pow(d,p);
        System.out.println(d+"is raised to be the power"+p+"is"+result);
        input.close();
    }
 }
    
