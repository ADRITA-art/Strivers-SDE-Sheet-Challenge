import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int arr3[]=new int[m+n];
        int k=m;
        for(int i=0;i<m;i++)
        arr3[i]=arr1[i];
        for(int i=0;i<n;i++)
        {
        arr3[k]=arr2[i];
        k++;
        }
        Arrays.sort(arr3);
        return arr3;
    }
}
