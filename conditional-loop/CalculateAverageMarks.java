//program 19.Calculate Average Marks
import java.util.*;
public class CalculateAverageMarks
 {
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the all values");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int avg=(a+b+c+d)/4;
        System.out.println(avg);
        input.close();
    }
}
    
