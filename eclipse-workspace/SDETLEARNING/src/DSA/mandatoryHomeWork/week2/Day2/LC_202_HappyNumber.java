package DSA.mandatoryHomeWork.week2.Day2;

import org.junit.Test;

public class LC_202_HappyNumber {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/happy-number/
	 */

	@Test // +ve
	public void example1() {
		int n = 19;
		System.out.println(isHappy(n));
	}

	@Test // edge
	public void example2() {
		int n = 2;
		System.out.println(isHappy(n));
	}

	/*
	 * Bruteforce
	 * if n become 1 or 7 return true else
	 * if n>10 return false
	 * decalre int sum
	 * while n>0, sum=sum+(n%10*n%10)
	 * n=n/10
	 * return using recusrsive method  approach ishappy(sum) until condition satisfies
	 * 
	 *TC-O(logn) SC-O(1)
	 */

	public boolean isHappy(int n) {
	       if(n == 1 || n == 7){
	           return true;
	       }
	       if(n < 10){
	           return false;
	       }
	       int sum = 0;

	       while(n > 0){
	           sum += (n % 10) * (n % 10);
	           System.out.println(sum+"<-sum");
	           n /= 10;
	       }
	       System.out.println();
	       return isHappy(sum);
	    }
	}
