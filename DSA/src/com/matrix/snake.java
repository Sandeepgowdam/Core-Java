package com.matrix;



public class snake {
	public static void main(String[] args) {
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++) {
	    	for(int j=0;j<a[0].length;j++) {
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }
		//even row ---> L->r
		//odd row ---->r->L
		int r=a.length;
		int c=a[0].length;
		System.out.println("<-------snake pattern----->");
		for(int i=0;i<r;i++) {
			if(i%2==0) {
				for(int j=0;j<c;j++) {
					System.out.print(a[i][j]+" ");
				}
			}else {
				for(int j=c-1;j>=0;j--) {
					System.out.print(a[i][j]+" ");
				}
			}
		}
	}

}
