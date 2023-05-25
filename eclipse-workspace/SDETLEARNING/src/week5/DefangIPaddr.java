package week5;

import org.junit.Test;

public class DefangIPaddr {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/defanging-an-ip-address/description/
	 */

	@Test // +ve
	public void example1() {
		String address = "1.1.1.1";
		System.out.println(defangIPaddr(address));
	}

	@Test // edge
	public void example2() {
		String address = "255.100.50.0";
		System.out.println(defangIPaddr(address));
	}

	
	public String defangIPaddr(String address) {
        String op="";
       for(int i=0; i<address.length(); i++){
           
          if(address.charAt(i) == '.'){
              op=op+"[.]";
          }else{
              op=op+address.charAt(i);
          }
       } 
       return op;
    }
}