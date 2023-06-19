package DSA.mandatoryHomeWork.week1.Day2;

import org.junit.Test;

public class LC_258_AddDigits {/*
						 * Question here !! https://leetcode.com/problems/add-digits/ Given an integer
						 * num, repeatedly add all its digits until the result has only one digit, and
						 * return it.
						 */

	@Test // +ve
	public void example1() {
		int num = 9;
		System.out.println(addDigit(num));
		//System.out.println(addDigits(num));

	}

	@Test // edge
	public void example2() {
		int num = 123456788;
		System.out.println(addDigit(num));
		//System.out.println(addDigits(num));

	}

	@Test // negative
	public void example3() {
		int num = 0;
		System.out.println(addDigit(num));
		//System.out.println(addDigits(num));

	}

	/*
	 * Brute force !! Psuedo code here:
	 * while num>9
	 * store nums %10 value in modulus
	 * store num/10 value in divide
	 * num=modulus+divide
	 * return num
	 * 
	 * TC: O(n)
	 * SC:O(1)
	 * 
	 */

	private int addDigit(int num) {

//		String str = String.valueOf(num);
//		//System.out.println(str.length());
//		int len = str.length();

		//for (int i = 0; i < len; i++) {
			while(num>9) {
			int modulus = num % 10;
			int divide = num / 10;
			//System.out.println(modulus+"->"+divide);

			num = modulus + divide;
			//System.out.println(num);

		}
		return num;
	}
	
	private int addDigits(int num) {
		if(num==0) {
			return 0;
		}
		if(num%9==0) {
			return 9;
		}else {
			return num%9;
		}
	}

}
