package com.app.array;

public class DessendingOrderOfArray {
	
	public static void desen(int[] a) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.printf(a[i]+" ");
		}
	}
public static void main(String[] args) {
	int[] a= {2,3,4,5,9,6,5,1};
	DessendingOrderOfArray.desen(a);
}
}
