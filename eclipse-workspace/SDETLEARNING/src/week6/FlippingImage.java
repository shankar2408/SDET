package week6;

import java.util.Arrays;

import org.junit.Test;

public class FlippingImage {
	/*
	 * https://leetcode.com/problems/flipping-an-image/
	 */

	@Test
	public void example1() {
		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		int[][] mat = flipAndInvertImage(image);

		for (int[] row : mat)

			// converting each row as string
			// and then printing in a separate line
			System.out.println(Arrays.toString(row));
	}

	@Test
	public void example2() {
		int[][] mat = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
		System.out.println(Arrays.deepToString(flipAndInvertImage(mat)));
	}

	public int[][] flipAndInvertImage(int[][] image) {
		int n = image.length;
		int[][] op = new int[image.length][image.length];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				op[i][j] = image[i][n - j - 1];
				//System.out.println(op[i][j]);

			}
			//System.out.println();

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (op[i][j] == 0) {
					op[i][j] = 1;
				} else {
					op[i][j] = 0;
				}
				//System.out.println(op[i][j]);

			}

		}

		return op;

	}
}
