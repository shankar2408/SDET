package week1.daily.practice;

import org.junit.Test;

public class Maximum69Number {
	
	@Test
	public void TC1() {
		int num = 9669;
		System.out.println(maximum69Number(num));
	}
	
	@Test
	public void TC2() {
		int num = 9996;
		System.out.println(maximum69Number(num));
	}

	@Test
	public void TC3() {
		int num = 9999;
		System.out.println(maximum69Number(num));
	}
	
	@Test
	public void TC4() {
		int num = 6669;
		System.out.println(maximum69Number(num));
	}

	//Time complexity - O(n)
	public int maximum69Number (int num) {

        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        
        for(int i = 0 ; i<ch.length;i++) {
        	if(ch[i]=='6') {
        		ch[i]='9';
        		break;
        	}
        }
        
       return Integer.parseInt(String.valueOf(ch));
       
       
    }
}
