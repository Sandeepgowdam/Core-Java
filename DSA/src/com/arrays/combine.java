package com.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class combine {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList <Integer> a= new  ArrayList<Integer>();
		System.out.println("enter");
       for(int i=0;i<10;i++) {
    	   a.add(s.nextInt());
       }
//        ArrayList <Integer> b= new  ArrayList<Integer>();
//        b.add(11);
//        b.add(21);
//        b.add(31);
//        b.add(41);
//        b.add(51);
//        a.addAll( b);
    Iterator<Integer> i = a.iterator();
    while(i.hasNext()) {

    	Integer integer = (Integer) i.next();
		System.out.print(integer + " ");
   
	}
	}
}
