//program .Reverse A String In Java

public class ReverseString 
{
    public static void main(String[] args) 
    {
          String name  ="anjali";
          String  rev=" ";
          char ch;
          System.out.println("original string is " + name);
          for(int i=0;i<name.length();i++)
          {
            ch=name.charAt(i);
            rev=ch+rev  ;
          }
          System.out.println("reverse string is " + rev);
    
    }
    
}
