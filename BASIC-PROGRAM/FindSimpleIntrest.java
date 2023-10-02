// program.3 Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class FindSimpleIntrest
 {
    
        public static void main(String[] args) 
        {
            System.out.println("enter the value P and R ,T");
            Scanner input=new Scanner(System.in);
            int p=input.nextInt();
            int r=input.nextInt();
            int t=input.nextInt();
            int SI=(p*r*t)/100;
            System.out.println(SI);
            input.close();
        }
    }
    