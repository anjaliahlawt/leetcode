//1773. Count Items Matching a Rule

public class arr13
 {
    public static void main(String[] args) 
    {
        String [][]items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        
        String rulekey="type";
        String rulevalue="phone";
        int ans=find(items,rulekey,rulevalue);
        System.out.println(ans);
       }
          static int find(String[][]items,String rulekey,String rulevalue){
        int index,count;
        if(rulekey=="type")
        {
            index=0;
        }
        else if(rulekey=="colour")
        {
            index=1;
        }
        else
        {
            index=2;
        }
        count =0;
        for(int i=0;i<items.length;i++)
        {
          if(items[i][index]==rulevalue)
          {
            count++;
          }
        }
        return count;

    }
}
