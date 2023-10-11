//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

    // Marks        Grade 
    // 91-100         AA 
    // 81-90          AB 
    // 71-80          BB 
    // 61-70          BC 
    // 51-60          CD 
    // 41-50          DD 
    // <=40          Fail 



import java .util.*;
public class fun4 
{
    public static void main(String[] args) 
    {
            Scanner input=new Scanner(System.in);
            System.out.println("enter the marks");
            int marks=input.nextInt();
            System.out.println("enter the subject");
            int subject=input.nextInt();
            float precentage =(marks*100)/subject;
            System.out.println(precentage );
    
            if(precentage>91)
            {
                System.out.println("AA garde");
            }
           else if(precentage>81&&precentage<90)
            {
                System.out.println("AB grade");
    
            }
          else if(precentage>71&&precentage<80)
          {
            System.out.println("BB grade");
          }
    
         else if(precentage>61&&precentage<70)
         {
            System.out.println("BC grade");
         }
       input.close();
    }
 }
    

