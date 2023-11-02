package com.strings;

public class ReverseOfStrings {

	public static void main(String[] args) {
		String str ="sandeep";
		StringBuilder br =new StringBuilder(str);
		System.out.println(br.reverse());
		//method 2
		System.out.println(str.charAt(6));
		System.out.println(str.length());
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
