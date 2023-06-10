package week1.Day2;

import org.junit.Test;

public class PatternProblem {
	
	@Test
	public void testcase1() {
		int n=5;
		pyramidTriangle(n);
		diamondPattern(n);
		rightPascalTriangle(n);
		sandGlass(n);
		
		char ch = 'F';
		alphaDiamond(ch);

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
	
	public void sandGlass(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j<i; j++) {
				System.out.print(" ");		
			}
			for (int j = 1; j <=n-i+1; j++) {
				System.out.print("* ");		
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = n - i + 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void alphaDiamond(char ch) {

		int n = (ch - 'A');
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <=(n - i - 1); j++) {
				System.out.print(" ");
			}
			System.out.print((char) ('A' + i));
			for (int k = 1; k <2*i; k++) {
				System.out.print(" ");
			}
			if (i != 0) {
				System.out.print((char)('A' + i));
			}
			System.out.println();
		}
		
		for (int i = n-1; i >=0; i--) {
			for (int j = (n - i - 1); j >= 0; j--) {
				System.out.print(" ");
			}
		    System.out.print((char) ('A' + i));
			for (int k = 1; k <2*i; k++) {
				System.out.print(" ");
			}
			if (i != 0) {
				System.out.print((char)('A' + i));
			}
			System.out.println();
		}
		

	}


}
