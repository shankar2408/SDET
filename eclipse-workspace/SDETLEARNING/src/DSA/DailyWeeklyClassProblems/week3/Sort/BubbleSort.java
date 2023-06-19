package DSA.DailyWeeklyClassProblems.week3.Sort;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {11,4,17,18,2,22,1,8};
		System.out.println(Arrays.toString(bruteForce(nums)));
		//merge(nums);
	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * high value last
	 * 
	 */

	private int[] bruteForce(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			boolean swap=false;
			for(int j=0; j<arr.length-i-1; j++) {
				System.out.println(j);
				System.out.println(arr.length-i-1);
				if(arr[j]>arr[j+1]) {
					//arr[j]=(arr[j]+arr[j+1])-(arr[j+1]=arr[j]);
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
		return arr;

	}
	
	private void merge(int[] arr) {

		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			int swap = 0 ;
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					swap++;
				}
			
			}
			if(swap == 0 ) break;
			System.out.println(Arrays.toString(arr));

		}

		System.out.println(Arrays.toString(arr));
	}

	

}