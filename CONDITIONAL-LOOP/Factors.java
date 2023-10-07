 //program 10.Input a number and print all the factors of that number (use loops).

import java.util.*;
public class Factors
 {
     public static void main(String[] args) 
       { 
            System.out.println("enter a number");
            Scanner input=new Scanner(System.in);
            int n= input.nextInt();
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    System.out.println("this is the factors of"+ i);
                }
                input.close();
            }
            
        }
}
    
