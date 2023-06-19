package DSA.mandatoryHomeWork.week1.Day5;

import org.junit.Test;

public class LC_1323_Maximum69Number {
	
	//https://leetcode.com/problems/maximum-69-number/
	
	@Test
	public void TC1() {
		int num = 9669;
		System.out.println(maximum69Number(num));
		System.out.println(max69Number(num));

	}
	
	@Test
	public void TC2() {
		int num = 9996;
		System.out.println(maximum69Number(num));
		System.out.println(max69Number(num));	}

	@Test
	public void TC3() {
		int num = 9999;
		System.out.println(maximum69Number(num));
		System.out.println(max69Number(num));	}
	
	@Test
	public void TC4() {
		int num = 6669;
		System.out.println(maximum69Number(num));
		System.out.println(max69Number(num));	}

	/*
	 * Pseudocode
	 * convert num to string
	 * convert it to char array
	 * use for loop for iteration from 0 to length
	 * if ch[i]=='6', change it to 9 and break
	 * return in int datate
	 * 
	 * TC-O(n)
	 * SC-O(1)
	 */
	
	public int maximum69Number (int num) {

        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        
        for(int i = 0 ; i<ch.length;i++) {
        	if(ch[i]=='6') {
        		ch[i]='9';
        		break;
        	}
        }
        
       return Integer.parseInt(String.valueOf(ch));
       
       
    }
	
public int max69Number (int num) {
		
		int max = num ;
		int prevTotal = 0;
		int mul = 1;
		
		while(num>9) {
			int digits = num%10;
			int quotient = num/10;
			prevTotal += digits*mul;
			if(digits == 6) {
				int temp = (quotient*10*mul) + (prevTotal+ (3*mul));
				max = Math.max(max, temp);
			}
			num = quotient;
			mul = mul*10;
		}
		
		if(num == 6) {
			int temp = (9*mul) + (prevTotal);
			max = Math.max(max, temp);
		}
			
		return max;
       
       
    }
}
