package com.sortingAlgorithms;
import java.util.Scanner;
public class LinearSearch {
   
	static int search(int [] arr, int key) {
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]==key) {
				return 1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr= {1,4,9,5,8,2,77};
		System.out.println("enter the key to be searched");
		int key = sc.nextInt();
        System.out.println(search(arr,key));
        sc.close();
	}

}
