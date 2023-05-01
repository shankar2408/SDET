package week2;

import org.junit.Test;

public class SwapVowels {
	//op: Halle evoryeno! Welcemo te TEstloef"
	@Test
	public void test1() {
		String s="Hello Everyone! Welcome to Testleaf";
		System.out.println(swapVowel(s));
	}
	
	@Test
	public void test2() {
		String s="shankar";
		System.out.println(swapVowel(s));
	}
	
	@Test
	public void test3() {
		String s="aeiou";
		System.out.println(swapVowel(s));
	}
	
	/*pseudocode
	 * convert string to charArray
	 * stop the loop when left is greater than right
	 * declare left with 0 and right variable with s.length-1
	 * compare left value with right if both vowel then swap and then left increment and right decrement
	 * if left is vowel and right is not vowel then decrement the right
	 * else if right is vowel and left is not vowel then increment the left
	 * return the string or character
	 */

	private String swapVowel(String s) {
		int left=0; int right=s.length()-1;
		char[] c=s.toCharArray();
		
		while(left<right) {
			if(isVowel(c[left]) && isVowel(c[right])) {
				char temp=c[left];
				c[left]=c[right];
				c[right]=temp;
				left++;
				right--;
				
			}else if(!isVowel(c[left])) {
					left++;
				}else if(!isVowel(c[right])){
					right--;
				}
			
		}return new String(c);
		
		
	}
	
	private boolean isVowel(char c) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			return true;
		}
		return false;
	}

}
