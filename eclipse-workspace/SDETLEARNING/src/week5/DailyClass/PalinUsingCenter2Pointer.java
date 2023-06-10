package week5.DailyClass;

import org.junit.Test;

public class PalinUsingCenter2Pointer {
	@Test // +ve
	public void example1() {
		String str="malayalam";
		twoPointer(str);	
		}
	
	@Test // +ve
	public void example2() {
		String str="pqrrqpt";
		twoPointer(str);	
	}

	
	 /***
    *
    * To Find the palindrome
    *
    * 1. Find the left and right pointer index
    *      finding mid and left as mid-1, if odd right will be mid+1 or right = mid
    * 2. loop left till greater than or equal to zero
    * 3.return false if any character is mismatch comparing left and right
    * 4. end of the loop return true
    *
    *
    */
   /*
Odd:
  	finding mid
	mid+1 and mid-1

Even:
	finding mid
	mid-1

Common operation	:
   finding mid
	left = mid -1

if odd	right = mid+1


    */

	

	private void twoPointer(String s) {
		int mid=0;
		int left=0;
		int right=0;
		boolean flag=false;
		if(s.length()%2!=0) {
		
		mid=s.length()/2;
		
		left=mid;
		right=mid;
		}else {
			mid=s.length()/2;
			
			left=mid-1;
			right=mid;
		}
		

		char[] c=s.toCharArray();
		while(left>=0 && right<=s.length()-1) {
			if(c[left]==c[right]) {

				left--;
				right++;
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("palin");
		}else {
			System.out.println("not palin");
		}
		
	}
	
	//optimised
	private boolean isPalindrome(String input){
        int right = input.length()/2, left = right-1;
        if(input.length()%2 ==1)
            right++;


        while(left >= 0){
            if(input.charAt(left--) != input.charAt(right++))
                return false;
        }

        return true;
    }

}

