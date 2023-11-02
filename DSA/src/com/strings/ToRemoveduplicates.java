package com.strings;

import java.util.Arrays;

public class ToRemoveduplicates {

	static void duplicate(char[] str) {
		int index =0;
		int i;
		for( i=0;i<str.length;i++) {
			int j;
			for( j=0;j<i;j++) {
				if(str[i]==str[j]) {
				    break;
				}
			}
			if(j==i) {
				str[index++]=str[i];
			}
		}
	System.out.println(String.valueOf(Arrays.copyOf(str, index)));	
		
	}
	
	
	public static void main(String[] args) {
		String a= "sandeep";
	char[] str = a.toCharArray();
	
		duplicate(str);
	}
}
