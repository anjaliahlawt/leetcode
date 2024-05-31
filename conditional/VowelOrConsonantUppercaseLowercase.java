//program .vowel or constant for uppercase and lowecase both
import java.util.*;
public class VowelOrConsonantUppercaseLowercase 
{
     public static void main(String[] args) 
     {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);  
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
        {
            switch (Character.toLowerCase(ch))
             {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                System.out.println(ch + " is a vowel.");
                break;
                default:
                System.out.println(ch + " is a consonant.");
            }
        } 
        else
        {
            System.out.println("Input is not a letter.");
        }
        scanner.close();
     }
 }
    
