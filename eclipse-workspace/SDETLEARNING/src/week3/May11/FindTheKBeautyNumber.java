package week3.May11;
import org.junit.Test;

public class FindTheKBeautyNumber {
	/*
	 * 2269. Find the K-Beauty of a Number
	 * https://leetcode.com/problems/find-the-k-beauty-of-a-number/
	 */

	@Test
	public void example() {
		int num = 240;
		int k =2;
		System.out.println(findBeauty(num, k));

	}
	
	@Test
	public void example1() {
		int num = 430043;
		int k =2;
		System.out.println(findBeauty(num, k));

	}

	private int findBeauty(int num, int k) {
		
		String numStr = Integer.toString(num);
		int count =0;
		
		
		for (int i = 0; i <=numStr.length()-k; i++) {
			String subStr = numStr.substring(i, i+k);
			int subNum = Integer.parseInt(subStr);
			if(subNum!=0 && num% subNum ==0) {
				count++;
			}
			
		}
		return count;
	}
}