//program 5.Take 2 numbers as input and print the largest number.

 import java.util.*;
 public class LargestNumber
   {
       public static void main(String[] args) 
       {
            System.out.println("enetr trhe two number");
            Scanner input=new Scanner(System.in);
            int num1=input.nextInt();
            int num2=input.nextInt();
            if(num1>num2)
            {
                System.out.println(num1);
            }
            else
            {
                System.out.println(num2);
            }
            input.close();
        }
    }
    

