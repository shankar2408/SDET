package DSA.DailyWeeklyClassProblems.week8.DailyClass;

import org.junit.Test;
import java.util.*;

public class LC_3_LongestSubstringWithoutRepeatingCharacters {
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	@Test // edge
	public void example2() {
		String s = "bbbbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	@Test // negative
	public void example3() {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}


	public int lengthOfLongestSubstring(String s) {
        int n = s.length();// length of a string
		int i = 0, j = 0, maxSubStringCount = 0; //counter 
		Set<Character> set = new HashSet<>();
		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));// add vlaues in to set
				maxSubStringCount = Math.max(maxSubStringCount, j - i);//Math.max to give you the max val and drop the left 
			} 
				  else { set.remove(s.charAt(i++)); }
				 
		}
		return maxSubStringCount;
    }
	
	/* Pseudocode
    declare hashmap
    declare count=0
    use for loop for iteration
    if map !contains add and increase the count
    once if contains reset the count to 0 and remove the value in map
    return the max count
    */
    
    public int lengthOfLongestSubstring1(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int max=Integer.MIN_VALUE;

        if(s.length()==0){
            return 0;
        }

        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),count++);
                max=Math.max(max,count);
            }else{
                count=0;
                map.clear();
                map.put(s.charAt(i),count++);

            }

        }
        return max;
    }

}