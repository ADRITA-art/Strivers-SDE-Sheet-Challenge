import java.util.*;
public class Solution {
    public static int search(int arr[], int key) {
        int l=0,h=arr.length-1,m=0;
        Arrays.sort(arr);
        int p=-1,n=arr.length;
        while(l<=h)
        {
            m=(l+h)/2;
            if(arr[m]>key)
            h=m-1;
            else if(arr[m]<key)
            l=m+1;
            else if(arr[m]==key)
            {
            p=m;
            break;
            }
        }
        if(p>-1)
        {
        if(p<n-2)
        p=p+2;
        else
        p=n-(p-0)-2;
        }
        return p;
    }
}
