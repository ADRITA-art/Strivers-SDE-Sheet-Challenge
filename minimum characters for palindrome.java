
public class Solution {

    public static int minCharsforPalindrome(String str) {
        String s1="",s2=str;
        char c1=' ',c2=' ';
        int k=0,n=str.length();
        for(int i=n-1;i>=0;i--)
        {

            if(rev(s2)==true)
            return k;
            else
            {
                s2=str.substring(0,i);
                k++;
            }
        }
        return k;
    }
        
        public static boolean rev(String str)
        {
            char ch=' ';
            String s1="";
            int m=0,n=str.length()-1;
            while(m<n)
            {
                if((str.charAt(m))!=(str.charAt(n)))
                return false;
                m++;
                n--;
            }
            return true;

            
        }
}
