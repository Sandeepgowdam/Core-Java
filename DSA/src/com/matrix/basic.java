package com.matrix;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int[][] a = new int[3][3];
    System.out.println("enter the elements");
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[0].length;j++) {
    		a[i][j]= sc.nextInt();
    	}
    }
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[0].length;j++) {
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
    }
    System.out.println("transpose matrix========>");
    int[][] b = new int[3][3];
    for(int i=0;i<b.length;i++) {
    	for(int j=0;j<b[0].length;j++) {
    		b[i][j]= a[j][i];
    	}
    }
    for(int i=0;i<b.length;i++) {
    	for(int j=0;j<b[0].length;j++) {
    		System.out.print(b[i][j]+" ");
    	}
    	System.out.println();
    
	}
	}
	

}
