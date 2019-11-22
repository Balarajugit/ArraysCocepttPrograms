package com.app.array;

public class CopyOneArrayIntoOntodherArray {
	
	public static int[] conv(int[] a) {
		//take an empty array having the length of first array(a.length)
		int[] b=new int[a.length];
		//read the data from the first array one by one
		for(int i=0;i<a.length;i++) {
			//assign the first array data one by one to the 2nd array
			b[i]=a[i];
		}
		return b;
	}

	public static void main(String[] args){
		int[] b= {2,3,4,5};
		int[] c=CopyOneArrayIntoOntodherArray.conv(b);
		for(int h:c) {
			System.out.println(h);
		}
	}
}
