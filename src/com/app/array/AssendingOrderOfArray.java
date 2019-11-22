package com.app.array;

public class AssendingOrderOfArray {
	
	public static void assendingOrder(int []a) {
		//create a temp variable for swapping 
		int temp=0;
		//read the data from the array index of 0
		for(int i=0;i<a.length;i++) {
			//read the data from the array index of i+1
			for(int j=i+1;j<a.length;j++) {
				//check the value if greater then or not
				if(a[i]>a[j]) {
					//if greater then it will store  the value in a[i]
					//assign the value to the temp
					temp=a[i];
					//assign the a[i] to the a[j]
					a[i]=a[j];
					//and assign the value to he temp value to the a[j]
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
public static void main(String[] args) {
	int[] a= {64,3,4,6,89,1,2};
	AssendingOrderOfArray.assendingOrder(a);
}
}
