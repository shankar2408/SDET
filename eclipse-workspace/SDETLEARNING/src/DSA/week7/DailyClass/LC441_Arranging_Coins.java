package DSA.week7.DailyClass;

import org.junit.Test;

public class LC441_Arranging_Coins {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/arranging-coins/description/
	 */

	@Test // +ve
	public void example1() {
		int n=5;
		System.out.println(arrangeCoins(n));
	}

	@Test // edge
	public void example2() {
		int n=8;
		System.out.println(arrangeCoins(n));
	}


	

		public int arrangeCoins(int n) {
		    //     if(n==1){
		    //         return n;
		    //     }
		    //     int count=0;
		    //     int sum=0;
		    //     for(int i=1; i<=n; i++){
		    //         sum=sum+i;
		    //         if(sum>n){
		    //             return count;
		    //         }
		    //         count++;
		    //     }
		    //    return -1; 
		    int i=1;
				for(; i<=n; i++){
					n = n-i; 
				}
				return i-1; 
		            
		        }
		}