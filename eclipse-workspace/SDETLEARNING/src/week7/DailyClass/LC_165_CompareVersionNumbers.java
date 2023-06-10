package week7.DailyClass;

import org.junit.Test;

public class LC_165_CompareVersionNumbers {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/compare-version-numbers/description/
	 */

	@Test // +ve
	public void example1() {
		String version1 = "1.01", version2 = "1.001";
		System.out.println(compareVersion(version1,version2));
	}

	@Test // edge
	public void example2() {
		String version1 = "1.1", version2 = "0.1";
		System.out.println(compareVersion(version1,version2));
	}

	@Test // negative
	public void example3() {
		String version1 = "0.1", version2 = "1.1";
		System.out.println(compareVersion(version1,version2));
	}

	public int compareVersion(String version1, String version2) {
		 String[] str1 = version1.split("\\.");
	        String[] str2 = version2.split("\\.");
	        int max = Math.max(str1.length,str2.length);
	        for(int i=0;i<max;i++){
	            int num1 = i >= str1.length ? 0 : Integer.parseInt(str1[i]);
	            int num2 = i >= str2.length ? 0 : Integer.parseInt(str2[i]);
	            if(num1 < num2) 
	            	return -1;
	            if(num1 > num2) 
	            	return 1;
	        }

	        return 0;
	    }
	
	public int compareVersion1(String v1, String v2) {
	{
	     String s1[]=v1.split("\\.");
	     String s2[]=v2.split("\\.");
	        int len=Math.max(s1.length,s2.length);
	     int val1[]=new int[len];
	        int val2[]=new int[len];
	        for(int i=0;i<s1.length;i++)
	            val1[i]=Integer.parseInt(s1[i]);
	        for(int i=0;i<s2.length;i++)
	            val2[i]=Integer.parseInt(s2[i]);
	        for(int i=0;i<len;i++)
	        {
	            if(val1[i]>val2[i])
	                return 1;
	            if(val1[i]<val2[i])
	                return -1;
	        }
	        return 0;
	    }
	
}
}
