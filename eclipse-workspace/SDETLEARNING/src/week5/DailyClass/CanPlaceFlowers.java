package week5.DailyClass;

import org.junit.Test;

public class CanPlaceFlowers {

	/*
	 * Question here !! https://leetcode.com/problems/can-place-flowers/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = { 1, 0, 0, 0, 1 };
		int n = 1;
		System.out.println(canPlaceFlowers(nums, n));
	}

	@Test // edge
	public void example2() {
		int[] nums = { 1, 0, 0, 0, 1 };
		int n = 2;
		System.out.println(canPlaceFlowers(nums, n));
	}
	
	@Test // -ve
	public void example3() {
		int[] nums = { 0};
		int n = 1;
		System.out.println(canPlaceFlowers(nums, n));
	}
	
	/*
	 * pseudocode
	 * declare count
	 * use for loop for iteration
	 * if current value is zero & index is zero or index-1 is zero & if last index is zero or index+1 is zero
	 * change current index value to 1 and increase the count
	 * return the boolean for if count greater than n
	 */

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int length = flowerbed.length;
		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
				flowerbed[i] = 1;
				count++;
			}
		}

		return count >= n;

	}

	public boolean canPlaceFlowers1(int[] flowerbed, int n) {
		if (n == 0) {
			return true;
		}
		boolean left;
		boolean right;

		for (int i = 0; i < flowerbed.length; i++) {
			left = false;
			right = false;
			if (flowerbed[i] == 0) {
				if (i == 0 || flowerbed[i - 1] == 0) {
					left = true;
				}
				if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
					right = true;
				}
				if (left && right) {
					flowerbed[i] = 1;
					n--;
					if (n == 0)
						break;
				}
			}
		}
		return (n == 0);

	}

}
