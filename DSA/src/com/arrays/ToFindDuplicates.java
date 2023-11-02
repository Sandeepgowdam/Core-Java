package com.arrays;

public class ToFindDuplicates {

	 
	 static int[] a= {1,2,3,4,4};
	static boolean duplicate(){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]==a[j])
					return true;
			}
		}

		return false;	
	}
	public static void main(String[] args) {
		System.out.println(duplicate());;
	}

}
