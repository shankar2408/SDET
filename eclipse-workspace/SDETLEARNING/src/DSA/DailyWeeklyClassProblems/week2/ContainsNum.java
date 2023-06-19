package DSA.DailyWeeklyClassProblems.week2;

import org.junit.Test;

public class ContainsNum {

//		Question: Write a program to find if 2 numbers are present in an array
//		Ex1: [1,2,3,4,5], 2, 4      Output: true
//		Ex2: [1,2,3,4,5], 2, 6      Output: false
		
	@Test
	public void test1() {
		int[] num= {1,2,3,4,5};
		int x=2;
		int y=4;
		System.out.println(findNos(num,x,y));
		
	}
	
	@Test
	public void test2() {
		int[] num= {1,2,3,4,5};
		int x=2;
		int y=6;
		System.out.println(findNos(num,x,y));
	
	}
	
	public boolean findNos (int []arr, int x, int y) {
		boolean first=false;
		boolean second=false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				first=true;
			}
			if (arr[i] == y) {
				second=true;
			}
		
		}
		if(first && second) {
			return true;
		}else {
		return false;}
	}
	}


