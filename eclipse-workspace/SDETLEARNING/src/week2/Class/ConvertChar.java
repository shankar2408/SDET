package week2.Class;

import java.util.Arrays;

import org.junit.Test;

public class ConvertChar {
	
	//Output: "1[.]1[.]1[.]1"
	@Test
	public void example1() {
		
		String str="1.1.1.1";
		convert(str);
		System.out.println();
		System.out.println(conversion(str));
		

		
		
		
	}
	//pseudocode
	//convert string to chararray-> iterate the array-> if not equal to ., print or take 1 else if equal to ., print or take [.]
	
	
	public void convert(String str) {
    
		char[] s=str.toCharArray();
		
		//String[] split=str.split("\\.");
		for(int i=0; i<s.length; i++) {
			if(s[i]!='.') {
			System.out.print(s[i]);
			}
			else{
			System.out.print("[.]");
			}
		}
	}
	
	private String conversion(String str) {
		// TODO Auto-generated method stub
		String output = "";
		for(int i = 0 ; i<str.length();i++) {
			if(str.charAt(i) == '.') {
				output += "[.]";			
			}
			else output += "1";
		}
		return output;
	}
	

}
