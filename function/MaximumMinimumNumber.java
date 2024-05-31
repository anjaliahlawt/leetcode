/*program.Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.*/
import java.util.*;
public class MaximumMinimumNumber
{
    public static void main(String[] args) 
       {
            Scanner input= new Scanner(System.in);
            System.out.println("enter the first number");
            int first=input.nextInt();
            System.out.println("enter the second number");
            int second=input.nextInt();
            System.out.println("enter the third number");
            int third=input.nextInt();
            int largest=largest(first,second,third);
            int smallest=smallest(first,second,third);
            System.out.println("largst of three number"+largest);
            System.out.println("smallest of three number"+ smallest);
           input.close();
       }
    
    public static int largest(int first,int second,int third)
    {
        int max=first;
        if(second>max)
        {
            max=second;
        }
        if(third>max)
        {
            max=third;
        }
        return max;
    }
    public static int smallest(int first,int second,int third)
    {
        int min=first;
        if(second<min)
        {
            min=second;
        }
        if(third<min)
        {
            min=third;
        }
        return min;
    }
}
    

