//program.4Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;
public class Operator 
{
    public static void main(String[] args) 
    {
         System.out.println("enetr the operator");
         int a = 12, b = 3;
         Scanner input = new Scanner(System.in);
         char operator = input.next().charAt(0);
         if (operator=='+')
            {
                 System.out.print(a+b);
              
            }
            if (operator == '-') 
            {
                System.out.print(a - b);
            }
            if (operator == '*')
             {
                System.out.print(a * b);
             }
            if (operator == '/') 
            {
                System.out.print(a / b);
            }
            input.close();
            
        }
    }
    
