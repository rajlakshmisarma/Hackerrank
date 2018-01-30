package hackerrank.Algorithms.Warmup;
import java.util.*;
public class BirthdayCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
      //find the number of tallest birthday candles from an array of numbers representing heights
        long max = Integer.MIN_VALUE;
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(ar[i]>max){
                max = ar[i];
            }
        }
        for(int i=0; i<n; i++)
        {
            if(ar[i]==max)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
        in.close();
    }
}

