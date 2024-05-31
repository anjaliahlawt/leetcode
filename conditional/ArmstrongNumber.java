 //program 20.Armstrong Number In Java
import java.util.*;
public class ArmstrongNumber 
{
     public static void main(String[] args) 
     {
         Scanner input=new Scanner(System.in);
         System.out.println("eneter the number");
         int n =input.nextInt();
         int digits=0,temp;
         int sum=0;
         temp=n;
         while(temp>0)
         {
            temp=temp/10;
            digits++;
         }
        System.out.println("numbrr of digit"+digits);
        temp=n;
         while(temp>0)
         {
            int rem=temp%10;
            sum=(int)Math.pow(rem,digits)+sum;
            temp=temp/10;
         }
         if(sum==n)
         {
             System.out.println("is an armstrong number"+sum);
         }
         else
         {
             System.out.println("is nnot an armstrong number"+sum);
         }
         input.close();
    
     }
     
 }
    

