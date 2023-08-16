import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        long lm[]=new long[n];
        long rm[]=new long[n];
        long w=0;
        lm[0]=arr[0];
        rm[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
        lm[i]=Math.max(lm[i-1],arr[i]);
        for(int i=n-2;i>=0;i--)
        rm[i]=Math.max(rm[i+1],arr[i]);
        for(int i=0;i<n;i++)
        w=w+Math.min(rm[i],lm[i])-arr[i];
        return w;

    }
}
