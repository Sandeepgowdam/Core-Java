package com.strings;


public class Count {

	public static void main(String[] args) {
	String a="the sky is blue";
	System.out.println(a+"--->"+a.length());
	int count =0;
      for (int i = 0; i < a.length(); i++) {
		if(a.charAt(i)!=' ') {
			System.out.print(a.charAt(i));
			count++;
		}
	}
      System.out.println("---->"+count);
	}

}
