package com.numbers;

public class GcdHcf {
	static public int min(int n, int m) {
		if (n < m) {
			return n;
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min(10, 5));
	}

}
