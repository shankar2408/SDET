package DSA.DailyWeeklyClassProblems.week8.DailyClass;

import org.junit.Test;
import java.util.*;

public class LC_290_WordPattern {
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		String pattern = "abba", s = "dog cat cat dog";
		System.out.println(wordPattern(pattern,s));
	}

	@Test // edge
	public void example2() {
		String pattern = "abba", s = "dog cat cat fish";
		System.out.println(wordPattern(pattern,s));
	}

	@Test // negative
	public void example3() {
		String pattern = "aaaa", s = "dog cat cat dog";
		System.out.println(wordPattern(pattern,s));
	}

	/*
    Pseudocode:
    create hashmap with character and string
    String[] split=s.split(" ");
    String op="";
    use for loop for iteration
    if(!map.containskey(pattern.charAt(i) && !map.containsValue(splir[i]))){
    map.put(pattern.charAt(i),split[i])
    }
    create string array
    use for loop for iterating pattern
    store the value in string array
    op=String.join(" ",stringArray);
    if(op.equals(s)){
        return true;
    }
    return false;
    */
    public boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> map=new HashMap<>();    
    String[] split=s.split(" ");
    String op="";
    if(pattern.length() != split.length){
        return false;
    }
   
    for(int i=0; i<pattern.length(); i++){
    if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(split[i])){
    map.put(pattern.charAt(i),split[i]);
    }
    }
    String[] str=new String[pattern.length()];
    for(int i=0; i<pattern.length(); i++){
    str[i]=map.get(pattern.charAt(i));
    }
    op=String.join(" ",str);

    if(op.equals(s)){
        return true;
    }
    return false;
    }

}
