package DSA.mandatoryHomeWork.week6.Day3;

import org.junit.Test;

public class LC_2319_CheckIfMatrixIs_X_Matrix {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/check-if-matrix-is-x-matrix/solutions/2198175/check-if-matrix-is-x-matrix-java-solution/
	 */

	@Test // +ve
	public void example1() {
		int[][] nums = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
		System.out.println(checkXMatrix(nums));
	}

	@Test // edge
	public void example2() {
		int[][] nums = {{5,7,0},{0,3,1},{0,5,0}};
		System.out.println(checkXMatrix(nums));
	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * use 2 for loop for i and j iteration
	 * if i==j or i+j==grid.length-1, if grid[i][j]==0, return false
	 * else grid[i][j]!=0 return false
	 * 
	 */

    public boolean checkXMatrix(int[][] grid) {
    	int n=grid.length;
    	
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			if(i==j || i+j==n-1) {
    				if(grid[i][j]==0) {
    					return false;
    				}
    			}else {
    				if(grid[i][j]!=0) {
    					return false;
    				}
    			}
    		}
    	}
    	
		return true;

	}

}
