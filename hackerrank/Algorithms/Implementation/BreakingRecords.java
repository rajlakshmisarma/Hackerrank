package hackerrank.Algorithms.Implementation;

import java.util.Scanner;

public class BreakingRecords {
	static void breakingRecords(int[] score) {
        // Find the count of the highest scores and lowest scores
		int highcount =0;
		int lowcount =0;
		int len = score.length;
		int high = score[0];
		int low = score[0];
		for( int i = 0; i<len ; i++)
		{		
			if(score[i]>high)
			{
				high = score[i];
				highcount = highcount+1;
			}
		}
		for (int j = 0; j<len ; j++)
		{
			if(score[j]<low)
			{
				low = score[j];
				lowcount = lowcount + 1;
			}
		}
		System.out.print(highcount + " " + lowcount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        breakingRecords(score);
        in.close();
    }
}

