package hackerrank.Algorithms.Implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {
	 static void  sockMerchant(int n, int[] ar) {
	        // find number of matching pairs of socks from the given array
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for(int i=0; i<n; i++)
		{
			if(!set.contains(ar[i]))
			{
				set.add(ar[i]);
			}			
			else
			{
				count=count+1;
				set.remove(ar[i]);
			}
		}
		System.out.println(count);
	 }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	       sockMerchant(n, ar);
	      in.close();
	    }
}
