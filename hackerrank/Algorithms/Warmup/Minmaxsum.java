package hackerrank.Algorithms.Warmup;

import java.util.Scanner;

public class Minmaxsum {
	 static void miniMaxSum(int[] arr) {
	        // Complete this function
	        long  minsum, maxsum;
	        int min=Integer.MAX_VALUE;
	        int max=Integer.MIN_VALUE;
	        minsum = maxsum = 0;
	        for(int i=0; i<5; i++)
	        {
	            if(arr[i]<min)
	            {
	            	min = arr[i];
	            }
	            if(arr[i]>max)
	            {
	            	max = arr[i];
	            }
	        }
	        for(int i=0; i<5; i++)
	        {
	        	if(arr[i]!=min)
	        	{
	        		maxsum = maxsum + arr[i];
	        	}
	        	if(arr[i]!=max)
	        	{
	        		minsum = minsum + arr[i];
	        	}
	        }
	        System.out.println(minsum + " " + maxsum);
	    }
	 static int birthdayCakeCandles(int n, int[] ar) {
	        // Complete this function
	        long max = Integer.MIN_VALUE;
	        int count=0;
	        for(int i : ar)
	        {
	            if(max<ar[i])
	            {
	                max = ar[i];
	                count++;
	            }
	            if(max==ar[i])
	            {
	                count = count+1;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        for(int arr_i = 0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	       // miniMaxSum(arr);
	        int[] arr1 = {44, 53, 31, 27, 77, 60, 66, 77, 26, 36};
	        System.out.println(birthdayCakeCandles(10, arr1));
	        in.close();
	    }
}
