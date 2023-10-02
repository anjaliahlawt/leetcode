//program 6.Input currency in rupees and output in USD.

import java.util.*;
public class RuppessToUSD 
{
    public static void main(String[] args) 
    {
        System.out.println("enetr the rupees");
        Scanner input=new Scanner(System.in);
        double rup=input.nextInt();
        rup=rup*0.012;
        System.out.println(rup);
        input.close();
       
    }
}

