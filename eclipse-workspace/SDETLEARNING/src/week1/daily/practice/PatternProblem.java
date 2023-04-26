package week1.daily.practice;

import org.junit.Test;

public class PatternProblem {
	
	@Test
	public void testcase1() {
		int n=5;
		pyramidTriangle(n);
		diamondPattern(n);
		rightPascalTriangle(n);

	}
	
	public void pyramidTriangle(int n) {
		for(int i=0; i<n; i++) {
			 for(int j=n-i; j>1; j--) {
				 System.out.print(" ");
			 
			 }
			 for(int j=0; j<=i; j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		
	}
	
	public void diamondPattern(int n) {
		for(int i=0; i<n; i++) {
			 for(int j=n-i; j>1; j--) {
				 System.out.print(" ");
			 
			 }
			 for(int j=0; j<=i; j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 
		 for(int i=n; i>1; i--) {
			 for(int j=n-i; j>=0; j--) {
				 System.out.print(" ");
			 
			 }
			 for(int j=0; j<i-1; j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}
	
	public void rightPascalTriangle(int n) {
		for(int i=0; i<n; i++) {
			 for(int j=n-i; j>1; j--) {
				 System.out.print("");
			 
			 }
			 for(int j=0; j<=i; j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 
		 for(int i=n; i>1; i--) {
			 for(int j=n-i; j>=0; j--) {
				 System.out.print("");
			 
			 }
			 for(int j=0; j<i-1; j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}


}
