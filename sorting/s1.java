//package sorting;
// bubble sort
import java .util.*;
public class s1 
{
    public static void main(String[] args)
    {
     int[]arr={4,6,7,1};
     int n =arr.length;
     for(int i=0;i<n;i++)
     {
        for( int j=i+1;j<n;j++)
        {
            if(arr[i]>arr[j])
            {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }

        }
     }
     for(int k=0;k<n;k++)
     {

     
     System.out.print(arr[k]+" ");
    }
}
}