package hackerrank.Algorithms.Warmup;

import java.util.Scanner;

public class Staircase {

    static void staircase(int n) {
       
        for(int i=1;i<=n;i++)
        {
             for(int k=n;k>i;k--)
             {
                 System.out.print(" ");
             }    
             for(int j=1;j<=i;j++)
             {
                 System.out.print("#");
             }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}