import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        Arrays.sort(arr);
        int k=0,max=0,c=1;
        for(int i=1;i<N;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                if(arr[i]==arr[i-1]+1)
                c++;
                else
                {
                max=Math.max(max,c);
                c=1;
                }

            }
           
            
        }
        return Math.max(max,c);
    }
}
