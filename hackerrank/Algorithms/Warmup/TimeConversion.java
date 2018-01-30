package hackerrank.Algorithms.Warmup;
import java.util.*;

public class TimeConversion {

	static void timeConversion(String s) {
        // function to convert a time in hh:mm:ssAM/PM to 24-hour time
    	String[] arr = s.split(":");
    	int hour =  Integer.parseInt(arr[0]);
    	int min = Integer.parseInt(arr[1]);
    	int secs = Integer.parseInt(arr[2].substring(0, 2));
    	String ampm = arr[2].substring(2);
    	
    	if(ampm.equals("PM") && hour<12)
    	{
    		hour = hour+12;
    	}
    	if(ampm.equals("AM") && hour==12)
    	{
    		hour = 0;
    	} 	   	
       System.out.printf("%02d:%02d:%02d",hour,min,secs);  	
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        timeConversion(s);
       in.close();
    }
}