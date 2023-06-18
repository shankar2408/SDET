package DSA.week5.Day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LC_2011_FinalValueOfVariableAfterPerformingOperations {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
	 */

	@Test // +ve
	public void example1() {
		String[] operations = {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations(operations));
	}

	@Test // edge
	public void example2() {
		String[] operations = {"++X","++X","X++"};
		System.out.println(finalValueAfterOperations(operations));
	}

	@Test // negative
	public void example3() {
		String[] operations = {"X++","++X","--X","X--"};
		System.out.println(finalValueAfterOperations(operations));
	}

	

	public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                x++;
            }
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                x--;
            }
        }
        return x;
    }
	
	public int finalValueAfterOperations1(String[] operations) {
        int x = 0;
        for(String s : operations)
            if(s.charAt(1) == '-') x--;
            else x++;
        return x;
    }
}