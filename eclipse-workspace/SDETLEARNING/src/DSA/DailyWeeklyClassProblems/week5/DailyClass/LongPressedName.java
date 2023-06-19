package DSA.DailyWeeklyClassProblems.week5.DailyClass;

import java.util.Arrays;

import org.junit.Test;

public class LongPressedName {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/long-pressed-name/description/
	 */

//	@Test // +ve
//	public void example1() {
//		String s1="alex";
//		String s2="aaleex";
//		System.out.println(twopointer(s1,s2));
//	}
//
//	@Test // edge
//	public void example2() {
//		String s1="saeed";
//		String s2="ssaaedd";
//		System.out.println(twopointer(s1,s2));
//	}
	
	@Test // edge
	public void example3() {
		String s1="rick";
		String s2="kric";
		System.out.println(twopointer(s1,s2));
	}

	

    public boolean isLongPressedName(String name, String typed) {
		int[] arr1=new int[26];
		int[] arr2=new int[26];
		boolean flag=false;
		for(int i=0; i<name.length(); i++) {
			arr1[name.charAt(i)-'a']++;
		}
		
		for(int i=0; i<typed.length(); i++) {
			arr2[typed.charAt(i)-'a']++;
		}
	
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] <= arr2[i]) {
				flag=true;
			}else {
				return false;
			}
		}
    	return flag;
	}
    

	/* 
	 * 2 pointer !!
	 * Psuedo code here:
	 * i=0 pointing to "name" string and j=0 pointing to "typed" string.

If char at index 0 in both name and typed is not equal:
return false; Example: name: "rick" | typed: "kric"

if length of name is greater than typed:
return false;

main logic goes in step 3:
Run a loop while i<n && j<m:
if char at i and char at j is equal increment both i++ and j++

else{
check if char at j is equal to the char at i-1: if "yes": j++;
By doing this we are checking that whether the char at j index is long pressed of previous char of "name" string.
}
else{
return false;
}

suppose you completely traversed string name and there are still characters remaing in string "typed" to traverse.

check if char at last index of "name" is getting repeated in string "typed".
Example: name: "alex" | types: "aaleexa"

if j is completely traversed but i is still have some char to check: return false
if(i<n){
return false;
}
Example: name: "pyplrz" | typed: "ppyypllr"
	 * 
	 */
    
    public boolean twopointer(String name, String typed) {
        int n = name.length();
          int m = typed.length();
          int i=0;
          int j=0;
          if(name.charAt(0) != typed.charAt(0)) //step 1
              return false;
          if(n>m){            // step 2
              return false;
          }
          while(i<n && j<m){    //step 3
              if(name.charAt(i) == typed.charAt(j)){
                  i++;
                  j++;
              }
              else if(name.charAt(i-1) == typed.charAt(j)){
                  j++;
              }
              else{
                  return false;
              }
          }
          while(j<m){       //Step 4 & 5
              if(name.charAt(i-1) == typed.charAt(j)){
                  j++;
              }
              else{
                  return false;
              }
          }
          if(i<n){      // step 6
              return false;
          }
          return true;       
      }
  }
