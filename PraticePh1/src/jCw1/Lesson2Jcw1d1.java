package jCw1;

public class Lesson2Jcw1d1 {
	public static void main(String[] args) {
		int rows=5;
		
		for(int i =1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
/*	i<=4 j<=i output
 * i=1:<=4 j<=i *
 * i=2: 2<=4 j<=i **
 * i=3 3<=4 j<=i ***
 * i=4 4<=4 j<=i ****
 * i=5 5>4 False hence loop completed
 * */
/*i    j     output
 * i=1 1<=5   j=1   1
 * i=2 2<=5   j=2   12
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 