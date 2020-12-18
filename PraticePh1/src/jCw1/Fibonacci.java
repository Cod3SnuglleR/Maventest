package jCw1;

public class Fibonacci {
	public static void main(String[] args) {
		int n=6,a=0,b=1;
		System.out.println("First "+ n  + " Terms");
		for(int i = 1;i<=n;i++) {
			System.out.print(a+"+");
			int sum=a+b;
			a=b;
			b=sum;
		}
	}

}
