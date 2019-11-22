package com.app.array;

public class SumOfTheElementsInArray {
	
	public static int add(int[] a) {
		//create a new integer with value 0
		int b=0;
		//read the data from the array form index 0
		for(int i=0;i<a.length;i++) {
			//add the data one by one to the integer b
			b=b+a[i];
		}
		return b;
	}
public static void main(String[] args) {
	int[] a= {1,2,3,4};
	int b=SumOfTheElementsInArray.add(a);
	//read the data from the vaue of b
	System.out.println(b);
}
}
