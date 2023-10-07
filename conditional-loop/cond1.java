//program.Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

import java.util.*;
public class cond1
 {
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the august month days");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum+1;
            }
        }
        System.out.println("it will go friend in " + sum +"days" );
        input.close();
    }
 }
    
