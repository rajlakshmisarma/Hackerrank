package hackerrank.Algorithms.Implementation;

import java.util.Scanner;

public class DivisibleSumPairs {
	static int divisibleSumPairs(int n, int k, int[] ar) {
        // Find count of pairs (i, j) where i<j and ar[i]+ar[j] is divisible by k
		int count = 0;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n ; j++)
			{
				if((ar[i] + ar[j])%k ==0)
				{
					count = count+1;
				}
			}				
			}
			return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
        in.close();
       
        in.close();
    }
}
