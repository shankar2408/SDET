package week3.Sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int arr[]= {11,2,17,18,2,22,1,8};
		
		for(int i=1; i<arr.length;i++) {
			//safeguarding the pivot
			int j=i;
			//find the swaps
			while(j>=1 && arr[j]<arr[j-1]) {
				//swap
				//arr[j]=arr[j]+arr[j-1]-(arr[j-1]=arr[j]);
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				//decrement j
				j--;
			}
			System.out.println(Arrays.toString(arr));

		}
		//System.out.println(Arrays.toString(arr));
	}

}
