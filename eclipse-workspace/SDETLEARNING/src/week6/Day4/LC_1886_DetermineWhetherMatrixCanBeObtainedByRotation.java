package week6.Day4;

import java.util.Arrays;

import org.junit.Test;

public class LC_1886_DetermineWhetherMatrixCanBeObtainedByRotation {
	/*
	 * https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-
	 * rotation/
	 */

	@Test
	public void example() {
		int[][] mat = { { 0, 1 }, { 1, 0 } };
		int[][] target = { { 1, 0 }, { 0, 1 } };
		System.out.println(findRotation(mat, target));
	}

	@Test
	public void example2() {
		int[][] mat = { { 0, 1 }, { 1, 1 } };
		int[][] target = { { 1, 0 }, { 0, 1 } };
		System.out.println(findRotation(mat, target));
	}

	@Test
	public void example3() {
		int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		int[][] target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println(findRotation(mat, target));
	}

	public boolean findRotation(int[][] mat, int[][] target) {
		int[][] op = new int[mat.length][mat.length];
		int n = mat.length-1;
		for (int i = n; i>=0; i--) {
			for (int j = 0; j <= n; j++) {
				op[n-i][j]=mat[i][j];
//				System.out.println((n-i)+"->"+j);
//				System.out.println(op[n-i][j]);
			}
		}
		
		if(Arrays.deepEquals(target, op)) {
			return true;
		}else
		return false;
	}
	
 	public boolean findRotation1(int[][] mat, int[][] target) {

	 if (mat == target)  return true;
     int n = mat.length;
     int[] res[] = new int[n][n];
     for (int i = 0; i < n; i++) { //clockwise 90
         for (int j = 0; j < n; j++) {
             res[i][j] = mat[n - 1 - j][i];
         }
     }
     

     int[] res2[] = new int[n][n];
     for (int i = 0; i < n; i++) { //clockwise 180
         for (int j = 0; j < n; j++) {
             res2[i][j] = res[n - 1 - j][i];
         }
     }
    
     int[] res3[] = new int[n][n];
     for (int i = 0; i < n; i++) { //clockwise 270
         for (int j = 0; j < n; j++) {
             res3[i][j] = res2[n - 1 - j][i];
         }
     }
     
		//compare to 90,180,270 and itself
     if(Arrays.deepEquals(target, res) || Arrays.deepEquals(target, res2) || Arrays.deepEquals(target, res3) || Arrays.deepEquals(target, mat) ){ 
         return true;
     }
     return false;
	}

}

