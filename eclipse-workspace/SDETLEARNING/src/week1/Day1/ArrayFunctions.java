package week1.Day1;

import java.util.Arrays;

import org.junit.Test;

public class ArrayFunctions {

	/*
	 * Question here !! Implement below methods using array a. add to the specific
	 * index b. print the array value as string c. contains d. remove a value e.
	 * trim to the given length f.Remove the first and last occurrence of a given number in the input array
input = {1,2,3,4,5,1}, number = 1
output = {2,3,5}
g.Remove all occurrence of a number which is present in the given index number
input = {1,2,3,4,5,1}, indexToRemove = 5
output = {2,3,4,5}
	 */

	@Test // +ve
	public void example1() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] occuranceArray= {6,1,2,3,6,1,6,4,5,1,6};
		int contains = 3;
		int trimLength=3;
		int remove=1;
		int add=6;
		int index=6;
		int[] nums = {11,8,9,6,4,2,3,5,7,0,1};
		System.out.println(Arrays.toString(addNumberAtIndexOfArray(arr,add,index)));
		System.out.println(printArrayAsString(arr));
		System.out.println(findmissingNumber(nums));
		System.out.println(containsArray(arr, contains));
		System.out.println(Arrays.toString(trimLengthOfArray(arr,trimLength)));
		System.out.println(Arrays.toString(removeValueInArray(arr,remove)));
		System.out.println(Arrays.toString(removefirstlastOccurrenceinArray(occuranceArray,remove)));
		System.out.println(Arrays.toString(removeGivenIndexAllOccurrenceinArray(occuranceArray,index)));

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
	
	private int[] removefirstlastOccurrenceinArray(int[] occuranceArray, int remove) {
		int[] remFLOccurence=new int[occuranceArray.length-2];
		int j = 0;
		int first=occuranceArray.length;
		int last=0;
		for(int i=0; i<occuranceArray.length; i++) {
			if(occuranceArray[i]==remove) {
				first=Math.min(i, first);
				last=Math.max(i, last);	
			}
			}
		//System.out.println(first+":"+last);
		for(int i=0; i<occuranceArray.length; i++) {
			if(i!=first && i!=last ) {
				//System.out.println(i);
				remFLOccurence[j++]=occuranceArray[i];
			}	
		}
		return remFLOccurence;	
	}
	
	private int[] removeGivenIndexAllOccurrenceinArray(int[] occuranceArray, int index) {
		int[] output=new int[occuranceArray.length];
		int j=0;
		int k=0;
		int value=0;
		int count=0;
		for(int i=0; i<occuranceArray.length; i++) {
			if(i==index) {
				value=occuranceArray[i];
				break;
			}
		}
		
		for(int i=0; i<occuranceArray.length; i++) {
			if(occuranceArray[i]!=value) {
				output[j++]=occuranceArray[i];
				count++;
			}
		}
		

		int[] op=new int[count];
		for(int i=0; i<count; i++) {
				op[k++]=output[i];
			}

		return op;
	}
	
	 public int findmissingNumber(int[] nums) {
			
		 int[] op=new int[nums.length+1];
		 
		 for(int i=0; i<nums.length; i++) {
			 op[nums[i]]=1;
		 }
		 
		 for(int i=0; i<op.length; i++){
			if(op[i]==0) {
				return i;
			} 
		 }
		 return 0;
		  
	 }


}
