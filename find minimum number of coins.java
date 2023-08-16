import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        int c=0,r=0;
           if(amount>=1000)
           {
               c=c+(amount/1000);
               amount=amount%1000;
           }
           if(amount>=500)
           {
               c=c+(amount/500);
               amount=amount%500;
           }
           if(amount>=100)
           {
               c=c+(amount/100);
               amount=amount%100;
           }
           if(amount>=50)
           {
               c=c+(amount/50);
               amount=amount%50;
           }
           if(amount>=20)
           {
               c=c+(amount/20);
               amount=amount%20;
           }
           if(amount>=10)
           {
               c=c+(amount/10);
               amount=amount%10;
           }
           if(amount>=5)
           {
               c=c+(amount/5);
               amount=amount%5;
           }
           if(amount>=2)
           {
               c=c+(amount/2);
               amount=amount%2;
           }
           if(amount>=1)
           {
               c=c+(amount/1);
               amount=amount%1;
           }
           return c;
       
    }
}
