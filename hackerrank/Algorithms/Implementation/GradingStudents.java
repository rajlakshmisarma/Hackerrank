package hackerrank.Algorithms.Implementation;

import java.util.Scanner;

public class GradingStudents {
	 static void solve(int[] grades){
	        // function top calculate grades based on conditions
		 for(int mark : grades)
		 {
			 if(mark<38)
			 {
				 System.out.println(mark);
			 }
			 else if(mark>=38)
			 {
				 int nextmultiple = mark + (5 - (mark % 5));
				 if((nextmultiple - mark)<3)
				 {
					 mark = nextmultiple;
					 System.out.println(mark);
				 }
				 else if((nextmultiple - mark) == 3)
				 {
					 System.out.println(mark);
				 }
				 else if((nextmultiple - mark) > 3)
				 {
					 System.out.println(mark);
				 }
	    }
	 }
	 }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] grades = new int[n];
	        for(int grades_i=0; grades_i < n; grades_i++){
	            grades[grades_i] = in.nextInt();
	        }
	       solve(grades);
	       in.close();
	        

	    }
	
}
