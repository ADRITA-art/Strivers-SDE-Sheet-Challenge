import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		int f[]=new int[n];
		int x=0,l=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if((arr[i]==arr[j]))
				{
					x++;
					
				}
			}
			f[l]=x;
			l++;
			x=0;	
		}
		for(int i=0;i<l;i++)
		{
			if(f[i]>Math.floor(n/2))
			return arr[i];
		}
		return -1;
	}
}
