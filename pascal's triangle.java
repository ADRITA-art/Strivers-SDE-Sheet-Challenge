import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                ArrayList <Long> list=new ArrayList <Long> ();
				 ArrayList<ArrayList <Long>> rep=new ArrayList<ArrayList <Long>> ();
				 long p;
				 int d1,d2;
				for(int i=0;i<n;i++)
				{
					list=new ArrayList<Long>();
					list.add(1L);
					for(int j=0;j<i;j++)
					{
						p=(long)list.get(j)*(i-j)/(j+1);
						list.add(p);
					}
					rep.add(list);
				}
				return (rep) ;
	}
	
}
