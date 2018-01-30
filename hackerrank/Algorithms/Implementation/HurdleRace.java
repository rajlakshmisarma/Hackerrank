package hackerrank.Algorithms.Implementation;

import java.util.Scanner;

public class HurdleRace {
	static int hurdleRace(int k, int[] height) {
        // Print number of drinks to jump the highest hurdle
		int n = height.length;
		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0; i<n; i++ )
		{
			if(height[i] > max)
			{
				max = height[i];
			}
		}
		if(max > k)
		{
			count = max-k;
		}
		else
		{
			count = 0;
		}
		return count;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
