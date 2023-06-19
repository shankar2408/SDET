package DSA.mandatoryHomeWork.week3.Day3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LC_2418_SortThePeople {
	/*
	 * 2418. Sort the People
	 * https://leetcode.com/problems/sort-the-people/
	 */
	@Test
	public void example() {
		String[] names =  {"Mary","John","Emma"};
		int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortThePeopleByHeights(names, heights)));
	}
	
	@Test
	public void example1() {
		String[] names =  {"Alice","Bob","Bob"};
		int[] heights = {155,185,150};
        System.out.println(Arrays.toString(sortThePeopleByHeights(names, heights)));
	}
	
	private String[] sortThePeopleByHeights(String[] names, int[] heights) {
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(heights[i], names[i]);
		}
		Arrays.sort(heights);
		int index =0;
		String[] result = new String[names.length];
		for (int i = heights.length-1; i >=0; i--) {
			result[index] = map.get(heights[i]);
			index++;
		}
		
		return result;
	}

}