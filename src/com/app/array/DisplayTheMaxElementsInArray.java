package com.app.array;

public class DisplayTheMaxElementsInArray {
	
	public static int max(int[] a) {
		//create an emty number having some adress
		int b=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>b) {
				b=a[i];
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int a[]= {45,6,7,8,999};
		int b=DisplayTheMaxElementsInArray.max(a);
		System.out.println(b);
	}
}
