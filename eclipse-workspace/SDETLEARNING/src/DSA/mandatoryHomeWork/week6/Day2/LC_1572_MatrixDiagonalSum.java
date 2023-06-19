package DSA.mandatoryHomeWork.week6.Day2;

import org.junit.Test;

public class LC_1572_MatrixDiagonalSum {
	/*
	 * https://leetcode.com/problems/matrix-diagonal-sum/
	 */

	@Test
	public void example() {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(diagonalSum(mat));
	}
	
	@Test
	public void example2() {
		int[][] mat = { { 1, 1,1,1 }, { 1, 1,1,1 }, { 1, 1,1,1 },{ 1, 1,1,1 } };
		System.out.println(diagonalSum(mat));
	}
	
	@Test
	public void example3() {
		int[][] mat = {{5}};
		System.out.println(diagonalSum(mat));
	}

	public int diagonalSum(int[][] mat) {
		int sum = 0;
		int k = mat.length;
		for (int i = 0; i < mat.length; i++) {// first loop
			for (int j = 0; j < mat.length; j++) {// 2nd loop
				if (i == j || i + j == mat.length - 1) {// same as printing "X" pattern
					sum += (mat[i][j]);// getting sum
				}

			}
		}
		return sum;// return sum
	}

	private int diagonalSum1(int[][] mat) {
		int n = mat.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += mat[i][i]; // Add elements from primary diagonal
			sum += mat[i][n - i - 1]; // Add elements from secondary diagonal
		}

		// Subtract the duplicate element in the center (if the matrix size is odd)
		if (n % 2 == 1) {
			int center = n / 2;
			sum -= mat[center][center];
		}

		return sum;
	}

	 

	public int diagonalSum2(int[][] mat) {
		int n = mat.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += mat[i][i];
			if (i != n - i - 1) {
				sum += mat[i][n - i - 1];
			}
		}
		return sum;
	}
}