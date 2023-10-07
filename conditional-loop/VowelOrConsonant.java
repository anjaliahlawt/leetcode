//program.Java Program Vowel Or Consonant
import java.util.*;
public class VowelOrConsonant 
{
     public static void main(String[] args) 
     {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the character");
        char ch =input.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
             System.out.println("is vowels" +ch);
        }
        else
        {
            System.out.println("is consonont" +ch);
        }
         input.close();   
    
     }
 }
    
