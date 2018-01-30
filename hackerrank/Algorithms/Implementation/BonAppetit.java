package hackerrank.Algorithms.Implementation;

import java.util.Scanner;

public class BonAppetit {
	static void bonAppetit(int n, int k, int b, int[] ar) {
        // print 'bon appetit' if bill is fairly split and charged
		int sum = 0;
		if(k>0)
		{
			int exclude = ar[k];
			for(int i=0; i < n ; i++)
			{
				sum = sum+ar[i];			
			}
		int totalshared = (sum-exclude)/2;
		if(b == totalshared )
		{
			System.out.println("Bon Appetit");
		}
		else 
		{
			int diff = b - totalshared;
			System.out.println(diff);
		}
		}
		else if (k==0)
		{
			for(int i=0; i< n; i++)
			{
				sum = sum+ar[i];
			}
			int totalshared = sum/2;
			if(b == totalshared )
			{
				System.out.println("Bon Appetit");
			}
			else 
			{
				int diff = b - totalshared;
				System.out.println(diff);
			}
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
       bonAppetit(n, k, b, ar);
       in.close();
    }
}
