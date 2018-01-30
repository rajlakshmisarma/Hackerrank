package hackerrank.Algorithms.Warmup;

import java.util.Scanner;

public class DiagonalDifference {
	static int diagonalDifference(int[][] a) {
        // Complete this function
        int sum1, sum2;
        sum1=sum2=0;
        int n = a.length;
       for(int i=0; i<n; i++)
       {
           for(int j=0; j<n; j++)
           {
               if(i==j)
               {
                   sum1 = sum1 + a[i][j];
               }
               if(i==n-1-j)
               {
                   sum2 = sum2 + a[i][j];
               }
           }
       }
       return Math.abs(sum1-sum2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
