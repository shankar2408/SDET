package DSA.week5.Day3;

import org.junit.Test;
import java.util.*;

public class LC_2103_RingsAndRods {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/rings-and-rods/description/
	 */

	@Test // +ve
	public void example1() {
		String rings = "B0B6G0R6R0R6G9";
		System.out.println(countPoints(rings));
	}

	@Test // edge
	public void example2() {
		String rings = "B0R0G0R9R0B0G0";
		System.out.println(countPoints(rings));
	}

	@Test // negative
	public void example3() {
		String rings = "G4";
		System.out.println(countPoints(rings));
	}

	

	public int countPoints(String rings) {
	    int r[] = new int[10];
	    int g[] = new int[10];
	    int b[] = new int[10];
	    
	    int n = rings.length();
	    
	    for(int i=0; i<n; i+=2){
	        
	        //convert char to integer
	        int a = rings.charAt(i+1)-'0';
	        
	        //System.out.println(rings.charAt(i) + " " + rings.charAt(i+1));
	        
	        //wherever rings are present add it in that colour array
	        if(rings.charAt(i) == 'R'){
	            r[a]++;
	        }
	        else if(rings.charAt(i) == 'G'){
	            g[a]++;
	        }
	        else if(rings.charAt(i) == 'B'){
	            b[a]++;
	        }
	    }
	    
	    //if all three rings are present increase count
	    int count=0;
	    for(int j=0; j<10; j++){
	        if(r[j] > 0 && g[j] > 0 && b[j] > 0)
	            count++;
	    }
	    
	    return count;
	}
	
	 public int countPointsUsingMap(String rings) {
	        Map<Integer,Set<Character>> m=new HashMap<>();
	        for(int i=0;i<rings.length();i=i+2){
	            char c=rings.charAt(i);
	            int index=(int)rings.charAt(i+1);
	            if(m.containsKey(index)){
	                Set<Character> x=m.get(index);
	                x.add(c);
	                m.put(index,x);
	            }else{
	                Set<Character> x=new HashSet<>();
	                x.add(c);
	                m.put(index,x);
	            }
	        }
	        int count=0;
	        for(Set<Character> k : m.values()){
	            if(k.size()==3) count++;
	        }
	        return count;
	    }
	
}