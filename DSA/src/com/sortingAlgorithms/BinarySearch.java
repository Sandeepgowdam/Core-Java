package com.sortingAlgorithms;

import java.util.Scanner;

public class BinarySearch {

	static int search(int arr[],int key,int low,int high) {
		while(low<=high) {
		int	mid = (low + high) / 2;
			if(key==arr[mid]) {
				return 1;
			}
			else if(key>arr[mid]) {
				low=mid+1;
				
			}else {
				high=mid-1;
				
			}
		}return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int high,low;
		low = 0;
		high = arr.length - 1;
		
		System.out.println("enter the key");
		int key = sc.nextInt();
		System.out.println(search(arr,key,low,high));
	}
}
