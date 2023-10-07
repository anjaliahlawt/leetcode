//program.Check Leap Year Or Not
 import java.util.*;
public class LeapYearOrNot
 {
    public static void main(String[] args) 
        {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the year");
            int y=input.nextInt();
            if(y%100==0&&y%400==0||y%100!=0&&y%4==0)
            {
              System.out.println("is a leap yera" + y);
            }
            else
            {
                System.out.println("is not a leap year" +y);
            }
            input.close();
        }
 }
    

