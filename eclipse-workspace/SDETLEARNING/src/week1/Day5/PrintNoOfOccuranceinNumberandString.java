package week1.Day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

import org.junit.Test;

public class PrintNoOfOccuranceinNumberandString {
	
	/*
	 * Question here !!
	 * PrintNoOfOccuranceinNumberandString
	 */

	@Test // number
	public void example1() {
		int arr[]= {1,2,3,3,3,4,9,9};
		findOccurrenceInNum(arr);
		
	}
	
	@Test // string
	public void example2() {
		String str= "google";
		findOccurrenceInString(str);
		
	}

	private void findOccurrenceInNum(int[] num) {
		HashMap<Integer,Integer> map=new HashMap<>();
		

		for(int i=0; i<num.length; i++) {
			if(map.containsKey(num[i])) {
				int count=map.get(num[i]);
			map.put(num[i], ++count);
			}else {
				map.put(num[i], 1);
			}
		}
		
		System.out.println(map);
		
	}
	
	private void findOccurrenceInString(String str) {
    Map<Character,Integer> map=new LinkedHashMap<>();
		

		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				int count=map.get(str.charAt(i));
			map.put(str.charAt(i), ++count);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(map);
	}

}