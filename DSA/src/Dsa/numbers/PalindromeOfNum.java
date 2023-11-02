package Dsa.numbers;

public class PalindromeOfNum {

	public static void main(String[] args) {
		int n=121;
		int res=0;
		int num=n;
		int temp;
		while(n>0) {
			temp= n%10;
			res=(res*10)+temp;
			n=n/10;
		}
		System.out.println(n);
		System.out.println(res);
		if(num==res) {
			System.out.println("trune");
		}else {
			System.out.println("false");
		}

	}

}
