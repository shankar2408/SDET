package week1.daily.practice;

import org.junit.Test;

public class CountOfMatches {
	
	/*https://leetcode.com/problems/count-of-matches-in-tournament/ */
	@Test
	public void testcase1(){
	    int n=7;
	    System.out.println(numberOfMatches(n));
	}

	@Test
	public void testcase2(){
	    int n=14;
	    System.out.println(numberOfMatches(n));
	}

	/*
	* 
	Pseudocode:
	declare int in testdata and pass to method
	if int n is even should divide n by 2 and store the value in variable sum for matches played and again divide by 2 for teams advance store it in n variable
	if int n is odd should divide n-1 by 2 and store the value in variable n for matches played and again divide (n-1)/2 +1 for teams advance store it in sum variable
	based on teams advances should make the matches and store the result until matches comes to 1 while(num<1)

	then return sum of the matches
	*
	*
	*/
	
	//Time complexity= O(n)
	public int numberOfMatches(int n) {
	int sum=0;

	while(n>1){
	   sum=sum+(n/2); 
	   n=(n/2)+(n%2);
	}
	return sum;
	        
	    }
	}


