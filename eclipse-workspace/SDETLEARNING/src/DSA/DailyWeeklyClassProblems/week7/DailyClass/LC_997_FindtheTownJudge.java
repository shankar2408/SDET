package DSA.DailyWeeklyClassProblems.week7.DailyClass;

import org.junit.Test;

public class LC_997_FindtheTownJudge {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/find-the-town-judge/description/
	 */

	@Test // +ve
	public void example1() {
		int[][] trust = {{1,2}};
		int n=2;
		System.out.println(findJudge(n,trust));
	}

	@Test // edge
	public void example2() {
		int[][] trust = {{1,3},{2,3}};
		int n=3;
		System.out.println(findJudge(n,trust));
	}

	@Test // negative
	public void example3() {
		int[][] trust = {{1,3},{2,3},{3,1}};
		int n=3;
		System.out.println(findJudge(n,trust));
	}


	/* pseudocode:
	use 2 for loop for iteration
	initialize new array 
	0th index should be -1 and 1st index +1
	finally if any index value is less than 1 n return n
	else -1

	*/

	    public int findJudge(int n, int[][] trust) {
	        int k=trust.length;
	        if(n==1){
	            return n;
	        }
	        int[] arr=new int[n+1];
	        for(int i=0; i<k; i++ ){
	                arr[trust[i][0]]--;
	                arr[trust[i][1]]++;
	                }
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]==n-1){
	                return i;
	            }
	        }
	        return -1;
	    }
	}