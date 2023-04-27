package week1.daily.practice;

import org.junit.Test;

public class SandGlass {
	@Test
	public void TC1() {
		int n = 5;
		sandGlass(n);
		System.out.println();
	}
	
	public void sandGlass(int n) {
		
		if(n<1) {
		System.out.println("invalid input");
		return;}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j<i; j++) {
				System.out.print(" ");		
			}
			for (int j = 1; j <=n-i+1; j++) System.out.print("* ");		
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) System.out.print(" ");
			for (int j = n - i + 1; j <= n; j++) System.out.print("* ");
			System.out.println();
		}

	}

}