package jCw1;

public class JC1w1d {
	public static void main(String [] args) {
		int number=1;
		for (int i=5;i<=10;i++) {
			number=number*i;
			System.out.println(number);
		}
	}

}
/*i i=5 fact=fact*1
*1 1<=5 1*1=1
*2 2<=5 1*2=2
*3 3<=5 3*2=6
*4 4<=5 6*4=24
*5 5=5 24*5=120
*6<=5 false hence stops
**/