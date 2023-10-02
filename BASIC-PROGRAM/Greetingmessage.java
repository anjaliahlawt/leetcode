//program 2.Take name as input and print a greeting message for that particular name.

import java.util.*;
public class Greetingmessage
 {
     public static void main(String[] args)
   {
        System.out.println("enter your name");
        Scanner input=new Scanner(System.in);
        String n=input.next();
        System.out.println("hello!"+ n);
         input.close();
    }
}
    

