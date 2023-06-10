package practice;

import org.junit.Test;

public class RevString {
	
	@Test // +ve
	public void example1() {
		String str="testing";
		System.out.println(twoSum_TwoPointer(str));

	}

	@Test // edge
	public void example2() {
		String str="123";
		System.out.println(twoSum_TwoPointer(str));


	}

	@Test // negative
	public void example3() {
		String str="";
		System.out.println(twoSum_TwoPointer(str));


	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * declare a string str="test";
	 * we should iterate one by one from reverse using for loop i--
	 * using charAt method print the character
	 * 
	 * 
	 */

	private void twoSum_BruteForce(String str) {
		
		if(str.length()<=0)
			throw new RuntimeException("Invalid target");
		for(int i=str.length()-1; i>=0; i--) { //O(N)
			
			System.out.print(str.charAt(i));
		}
		

	}
	
	/* 
	 * 2 pointer !!
	 * Psuedo code here:
	 * declare a string str="test";
	 * we should convert string to chararray
	 * declare left=0 and right=str.length-1 variables
	 * By using while loop swap the left and right char post that left++ and right--
	 * pass char array to new string
	 * 
	 */

	private String twoSum_TwoPointer(String str) {
		
		char[] c=str.toCharArray();
		int left=0; int right=str.length()-1;
		
		while(left<right) { //O(n/2)
			char temp=c[left];
			c[left]=c[right];
			c[right]=temp;
			left++;
			right--;
		}
		return new String(c);

	}

}



