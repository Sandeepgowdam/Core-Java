package com.strings;

public class Palindrome {

	public static void main(String[] args) {
		String st="malylam";
		StringBuilder br =new StringBuilder(st);
		br.reverse();
		String re=br.toString();
		if(st.equals(re)) {
			System.out.println("palin");
		}else {
			System.out.println("no");
		}
    
	}

}
