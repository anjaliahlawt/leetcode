//sort numbrer input=7,5,7,5,6,7,5,6,7
public class arr10 
{
   public static void main(String[] args) 
   {
     int[]arr={7,5,7,5,6,7,5,6,7};
     int n=arr.length;
     
     
     for(int i=0;i<n-1;i++)
     { int min=arr[i];
       for(int j=i+1;j<n;j++) 
       {
         if(arr[j]<=arr[min])
         {
            min=i;
           // int temp=0;
           int temp=arr[min];
            arr[min]=arr[j];
            arr[j]=temp;
         }
       }
       
     }
  for(int k=0;k<n;k++)
  {
    System.out.print(arr[k]);
  }
     
     
    
    
   } 
}
