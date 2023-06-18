package DSA.week7.DailyClass;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.*;

import org.junit.Test;

public class LC_1346_CheckDoubleExist {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {10,2,5,3};
		System.out.println(checkIfExist(nums));
	}

	@Test // edge
	public void example2() {
		int[] nums = { 3,1,7,11 };
		System.out.println(checkIfExist(nums));
	}



	public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            }
            set.add(i);
        }

        return false;
    }
	
	 public boolean checkIfExist1(int[] arr) {
	        Map<Integer, Integer> map = new HashMap<>();
	        int n = arr.length;
	        for (int i = 0; i < n; i++){
	            map.put(arr[i], i);
	        }
	        for (int i = 0; i < n; i++) {
	            if (map.containsKey(2 * arr[i]) &&
	                map.get(2 * arr[i]) != i) {
	                return true;
	            }
	        }

	        return false;
	    }
	 
	 public boolean checkIfExist2(int[] arr) {
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length; i++) {
	            int target = 2 * arr[i];
	            int lo = 0, hi = arr.length - 1;
	            while (lo <= hi) {
	                int mid = lo + (hi - lo) / 2;
	                if (arr[mid] == target && mid != i) 
	                    return true;
	                if (arr[mid] < target) 
	                    lo = mid + 1;
	                else 
	                    hi = mid - 1;
	            }
	        }

	        return false;
	    }
}


