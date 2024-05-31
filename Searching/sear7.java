public class sear7
{
    public static void main(String[] args) 
    {
         char [] letter={'x','x','y'};
         char target='z';
         char ans=next(letter,target);
         System.out.println(ans);
        }

         static char next(char[]letter,char target){
         for(int i=0;i<letter.length;i++)
         {
            
           if(letter[i]>target)
           {
             return letter[i];
           }
         }
         return letter[0];
         
    }
}