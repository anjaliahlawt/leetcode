//program 17.Calculate CGPA Java Program
import java.util.*;

public class CalculateCgpa 
{
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        double english,hindi,math,science,gk,cgpa,result;
        hindi=6.7;
        english=8.9;
        math=9.5;
        science=9.7;
        gk=7.8;
        cgpa=(hindi+english+math+science+gk);
        result=9.5*cgpa;
        System.out.println(result);
       input.close();
    }
}

