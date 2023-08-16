import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
     int p1=prices.get(0),p2,max=0;
     int n=prices.size();
     for(int i=1;i<n;i++)
     {
         p2=prices.get(i);
             if(p2-p1>max)
             {
                 max=p2-p1;
             }
             p1=Math.min(p1,prices.get(i));
         }
     
     return max;
    }
}
