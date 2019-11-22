package com.app.array;


public class DisplayDuplicatesElements {

	public static void add(int[] a) {
		//1.create an array
		//2.use for loop to read the data based on the index starts from 0
		
		for(int i=0;i<a.length;i++) {
			//inside the array create one array where its starts from the order of i+1 
			for(int j=i+1;j<a.length;j++) {
				//it will check the first array a[0]={a[1],a[2]....}all
				if(a[i]==a[j]) {
					System.out.print(","+a[j]);
				}
			}
		}
		
	}
	
	public static void main(String[] k) {
		int[] a= {2,4,3,5,7,4,2,3,7,8};
		//Arrays.sort(a);
		DisplayDuplicatesElements.add(a);
		
	}
}
