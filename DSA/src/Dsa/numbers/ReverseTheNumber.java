package Dsa.numbers;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int n=987;
		int res=0;
		int temp;
		while(n>0) {
			temp= n%10;
			res=(res*10)+temp;
			n=n/10;
		}
System.out.println(res);
System.out.println(n);
	}

}
