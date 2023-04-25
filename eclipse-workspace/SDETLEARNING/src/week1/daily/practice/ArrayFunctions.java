package week1.daily.practice;

import java.util.Arrays;

import org.junit.Test;

public class ArrayFunctions {

	/*
	 * Question here !! Implement below methods using array a. add to the specific
	 * index b. print the array value as string c. contains d. remove a value e.
	 * trim to the given length f.Remove the first and last occurrence of a given number in the input array
input = {1,2,3,4,5,1}, number = 1
output = {2,3,5}
	 */

	@Test // +ve
	public void example1() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int contains = 3;
		int trimLength=3;
		int remove=1;
		int add=6;
		int index=6;
		System.out.println(printArrayAsString(arr));
		System.out.println(containsArray(arr, contains));
		System.out.println(Arrays.toString(trimLengthOfArray(arr,trimLength)));
		System.out.println(Arrays.toString(removeValueInArray(arr,remove)));
		System.out.println(Arrays.toString(addNumberAtIndexOfArray(arr,add,index)));
		System.out.println(Arrays.toString(removefirstlastOccurrenceinArray(arr)));

	}

	@Test // edge
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Brute force !! Psuedo code here:
	 * 
	 * 
	 */

	private int[] addNumberAtIndexOfArray(int[] arr, int add, int index) {
		int[] output=new int[arr.length+1];
		int i=0;
		for (; i < arr.length; i++) {
			if(arr[i]<index) {
				output[i]=arr[i];	
			}else {
				break;
			}		
		}
		output[i]=add;
		for (; i < arr.length; i++) {
			output[i+1]=arr[i];	
		}
		return output;

	}

	private String printArrayAsString(int[] arr) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str = str + arr[i];
		}
        return str;
	}

	private boolean containsArray(int[] arr, int contains) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == contains) {
				return true;
			}
		}
		return false;

	}

	private int[] removeValueInArray(int[] arr, int remove) {
		int[] removedArray=new int[arr.length-1];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=remove) {
				removedArray[j++]=arr[i];
			}
				
		}return removedArray;

	}

	private int[] trimLengthOfArray(int[] arr, int trimLength) {
		int[] trimArray=new int[trimLength];
		for(int i=0; i<trimLength; i++) {
			trimArray[i]=arr[i];
		}
		return trimArray;
	}
	
	private int[] removefirstlastOccurrenceinArray(int[] arr) {
		int[] remFLOccurence=new int[arr.length-2];
		int j = 0;
		for(int i=1; i<arr.length-1; i++) {
			remFLOccurence[j++]=arr[i];
			}
		return remFLOccurence;
		
	}

}
