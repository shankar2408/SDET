package week3;

import org.junit.Test;
import java.util.*;

public class KeyboardRows {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/keyboard-row/description/
	 */

	@Test // +ve
	public void example1() {
		String[] words = {"Hello","Alaska","Dad","Peace"};
		System.out.println(Arrays.toString(bruteForce(words)));
	}

	@Test // edge
	public void example2() {
		String[] words = {"omk"};
		System.out.println(Arrays.toString(bruteForce(words)));
	}

	@Test // negative
	public void example3() {
		String[] words = {"adsdf","sfd"};
		System.out.println(Arrays.toString(bruteForce(words)));
	}

	
	private String[] bruteForce1(String[] words) {
		int[] rows = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        List<String> list = new ArrayList<>();
        for(String a: words){
           String s = a.toLowerCase();
            boolean isValid = true;
            int row = rows[s.charAt(0)-'a'];
            for(int i=1; i<s.length();i++){
               if(rows[s.charAt(i)-'a']!=row){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                list.add(a);
            }
            
        }
        return list.toArray(new String[0]);

	}

	private String[] bruteForce2(String[] words) {
		 char[] topRow = new char[]{'q','w','e','r','t','y','u','i','o','p'};
	        char[] midRow = new char[]{'a','s','d','f','g','h','j','k','l'};
	        char[] bottomRow = new char[]{'z','x','c','v','b','n','m'};
	        List<String> ans = new ArrayList<String>();

	        for (int i = 0; i < words.length; i++) {
	            char[] singleWord = words[i].toCharArray();
	            int singleWordLength = singleWord.length;
	            int checkTop = 0;
	            int checkMid = 0;
	            int checkBottom = 0;
	            for (int j = 0; j < singleWordLength; j++) {
	                if(contains(topRow,Character.toLowerCase(singleWord[j]))){checkTop++;}
	                if(contains(midRow,Character.toLowerCase(singleWord[j]))){checkMid++;}
	                if(contains(bottomRow,Character.toLowerCase(singleWord[j]))){checkBottom++;}
	            }
	            if(checkTop == singleWordLength){ans.add(words[i]);}
	            if(checkMid == singleWordLength){ans.add(words[i]);}
	            if(checkBottom == singleWordLength){ans.add(words[i]);}
	        }
	        String[] finalAns = new String[ans.size()];
	        for (int i = 0; i < ans.size(); i++) {
	            finalAns[i] = ans.get(i);
	        }
	        return finalAns;
	    }

	    public boolean contains(char[] arr, char target){
	        for (int i = 0; i < arr.length; i++) {
	            if(arr[i] == target) return true;
	        }
	        return false;
	    }
	    
	    public String[] bruteForce(String[] words) {
	        String s1 = "qwertyuiopQWERTYUIOP";
	        String s2 = "asdfghjklASDFGHJKL";
	        String s3 = "zxcvbnmZXCVBNM"; 
	        ArrayList<String> list = new ArrayList<>();
	        for(int i=0;i<words.length;i++){
	            int count1=0,count2=0,count3=0,len=words[i].length();
	            for(int j=0;j<len;j++){
	                if(s1.contains(Character.toString(words[i].charAt(j))))
	                    count1++;
	                else if(s2.contains(Character.toString(words[i].charAt(j))))
	                    count2++;
	                else if(s3.contains(Character.toString(words[i].charAt(j))))
	                    count3++;
	                if(count1==len || count2==len || count3==len)
	                    list.add(words[i]);
	            }
	        }
	        String ans[] = new String[list.size()];
	        list.toArray(ans);
	        return ans;
	    }
	

}
