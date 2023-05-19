package week4;

import java.util.Arrays;

import org.junit.Test;

public class BiggestAsciiChar {
	/*
	 * Question here !!
	 * Given a string S with both lowercase and uppercase letters, return the biggest ASCII letter that appears both in lowercase and uppercase. The returned letter must be in uppercase. If there is no such letter, return 'NO'. Examples: 
1. 'aaabcAbCdD', return 'D' 
2. 'aA', return 'A' 
3. 'abcdE', return 'NO' 
4. 'a', return 'NO'
	 */

	@Test // +ve
	public void example1() {
		String s = "aaabcAbCdD";
		System.out.println(bruteForce(s));
	}

	@Test // edge
	public void example2() {
		String s = "aA";
		System.out.println(bruteForce(s));
	}

	@Test // negative
	public void example3() {
		String s = "abcdE";
		System.out.println(bruteForce(s));
	}
	
	@Test // negative
	public void example4() {
		String s = "a";
		System.out.println(bruteForce(s));
	}


	private String bruteForce(String s) {
		int[] arr1=new int[26];
		int[] arr2=new int[26];
	
		for(int i=0; i<s.length(); i++) {
			if(Character.isLowerCase(s.charAt(i))){
				arr1[s.charAt(i)-'a']++;
			}else if(Character.isUpperCase(s.charAt(i))){
				arr2[s.charAt(i)-'A']++;
			}
		}
		
		for(int i=arr1.length-1; i>=0; i--) {
			if(arr1[i]>0 && arr2[i]>0){
				//char ch=(char)(i+'A');
		        String str = Character.toString( (char) (i+'A'));

				return str;
						}
		}

		
		return "NO";
	}
	
	
}
