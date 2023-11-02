package com.numbers;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num :");
		int n = sc.nextInt();
		int sum=0;
		for (int i = 0; i <= n; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		sc.close();
	}
}
