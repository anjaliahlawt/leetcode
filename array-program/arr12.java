//1832. Check if the Sentence Is Pangram means that every leeter in alphabet

public class arr12 
{
    public static void main(String[] args) 
    {
        String str= "thequickbrownfoxjumpso";
        int []arr=new int[26];
         boolean ans=pangram(str,arr);
         System.out.println(ans);
    }
    static boolean pangram(String str,int[]arr)
    {
        for(int i=0;i<str.length();i++)
        {
          arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]<1)
            {
                return false;
            }
        }
        return true;
    }
}
