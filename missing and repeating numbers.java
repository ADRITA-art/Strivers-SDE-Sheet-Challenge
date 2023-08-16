import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        Collections.sort(arr);
        int lol[]=new int[2];
        int k=0,l=0,s=0,c=0;
        for(int i=0;i<n;i++)
        c=c+arr.get(i);
        for(int i=0;i<n-1;i++)
        {
            if(arr.get(i).equals(arr.get(i+1)))
            {
            k=arr.get(i);
            break;
            }
        }
        
        s=(n*(n+1))/2;
        l=s+k-c;
        lol[1]=k;
        lol[0]=l;
        return lol;
    }
}
