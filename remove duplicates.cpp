public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int c=1;

        for (int i=1;i<n;i++) {

            if (!arr.get(i-1).equals(arr.get(i))) {

                c++;

            }

        }

    return c;

   }

}
