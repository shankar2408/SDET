package DSA.DailyWeeklyClassProblems.week5.DailyClass;

import org.junit.Test;

public class MinNoStepsForAnagram {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/
	 */

	@Test
	public void TC1() {
		String s1 = "leetcode";
		String s2 = "practice";
		System.out.println(minSteps(s1, s2));
	}
	
	@Test
	public void TC2() {
		String s1 = "anagram";
		String s2 = "mangaar";
		System.out.println(minSteps(s1, s2));
	}

	public int minSteps(String s, String t) {
        int min=0;

        int[] arr1=new int[26];
        int[] arr2=new int[26];

        for(int i=0; i<s.length(); i++){
            arr1[s.charAt(i)-'a']++;
            arr2[t.charAt(i)-'a']++;
        }

        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>arr2[i]){
                min+=arr1[i]-arr2[i];
            }
        }
        return min;
    }
	
	public int minSteps1(String s, String t) {
        
		int[] alpha = new int[26];
		int steps = 0;
    
		for(int i = 0; i < s.length(); i++){
        
			alpha[s.charAt(i) - 'a']++;
			alpha[t.charAt(i) - 'a']--;
		}
    
		for(int n: alpha)
			if(n > 0) steps += n;
    
		return steps;
    
	}
}