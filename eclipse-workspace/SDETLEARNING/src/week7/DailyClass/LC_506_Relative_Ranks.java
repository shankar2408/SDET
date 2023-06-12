package week7.DailyClass;

import java.util.Arrays;

import org.junit.Test;

public class LC_506_Relative_Ranks {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/relative-ranks/description/
	 */

//	@Test // +ve
//	public void example1() {
//		int[] score = {5,4,3,2,1};
//		System.out.println(findRelativeRanks(score));
//	}

	@Test // edge
	public void example2() {
		int[] score ={ 10,3,8,9,4};
		System.out.println(Arrays.toString(findRelativeRanks(score)));
	}


	public String[] findRelativeRanks(int[] score) {
       // int[] score=score;
        System.out.println("score[]:"+Arrays.toString(score));
         String[] result = new String[score.length];
        int max = 0;
        for (int i : score) {
            if (i > max) 
            	max = i;
        }
        System.out.println("Max:"+max);
        int[] hash = new int[max + 1];
        for (int i = 0; i < score.length; i++) {
            hash[score[i]] = i + 1;
        }
        System.out.println("hash[]:"+Arrays.toString(hash));
        int place = 1;
        for (int i = hash.length - 1; i >= 0; i--) {
            if (hash[i] != 0) {
                if (place == 1) {
                    result[hash[i] - 1] = "Gold Medal";
                } else if (place == 2) {
                    result[hash[i] - 1] = "Silver Medal";
                } else if (place == 3) {
                    result[hash[i] - 1] = "Bronze Medal";
                } else {
                    result[hash[i] - 1] = String.valueOf(place);
                }
                System.out.println(Arrays.toString(result));
                place++;
            }
        }
        return result;
    }
}