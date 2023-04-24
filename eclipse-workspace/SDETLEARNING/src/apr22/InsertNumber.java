package apr22;

import java.util.Arrays;

import org.junit.Test;

public class InsertNumber {/*
	 * Question here !!
	 * Find distinct number
	 */

	@Test // +ve
	public void example1() {
		int arr[]= {1,2,3,5,6,7};
		int n=4;
		bruteForce(arr,n);
		

	}

	@Test // edge
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	private void bruteForce(int[] num, int n) {
		int[] output=new int[num.length+1];
		int i=0;
		for(; i<num.length; i++) {
			if(num[i]<n) {
			output[i]=num[i];
			}else {
				break;
			}
		}
		output[i]=n;
		for(; i<num.length;i++) {
			output[i+1]=num[i];
		}
		System.out.println(Arrays.toString(output));
		

		
	}

	private void twoPointer() {

	}

}



