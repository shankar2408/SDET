package week1.daily.practice;

import java.util.Arrays;

import org.junit.Test;

public class RemoveFirstLastOccurence {

	@Test
	public void TC1() {
		int[] arr = { 2, 3, 4, 2 };
		int num = 1;
		System.out.println(Arrays.toString(removeOccurence(arr, num)));
	}

	@Test
	public void TC2() {
		int[] arr = { 2, 3, 4, 2 };
		int num = 2;
		System.out.println(Arrays.toString(removeOccurence(arr, num)));
	}

	@Test
	public void TC3() {
		int[] arr = { 2, 3, 2, 4, 2 };
		int num = 2;
		System.out.println(Arrays.toString(removeOccurence(arr, num)));
	}

	@Test
	public void TC4() {
		int[] arr = { 2, 3, 4 };
		int num = 2;
		System.out.println(Arrays.toString(removeOccurence(arr, num)));
	}

	private int[] removeOccurence(int[] arr, int num) {

		int reduceSize = checkIfExists(arr, num);
		if (reduceSize == 0)
			return arr;

		int[] output;

		if (reduceSize < 2)
			output = new int[arr.length - reduceSize];
		else
			output = new int[arr.length - 2];

		int min = arr.length - 1;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				min = Math.min(i, min);
				max = Math.max(i, max);
			}
		}

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != min && i != max) {
				output[index++] = arr[i];
			}
		}

		return output;

	}

	public int checkIfExists(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				count++;
		}

		return count;
	}

}