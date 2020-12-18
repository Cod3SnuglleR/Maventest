package jCw1;
import java.util.Scanner;

public class BinaryGap {
	public static void main(String [] gg) {
		int num,count=0,a;
		String x="";
		Scanner noob=new Scanner(System.in);
		System.out.println("Enter a number");
		 {
		num=noob.nextInt();
		while(num>0) {
			a=num%2;
			if(a==0) {
				count++;
			}
			x=a+""+x;
			num=num/2;
		}
		System.out.println("Binary number:"+x);
		System.out.println("No of 0s "+count);
	}

}
}
/*1.take user no
 * convert to binary
 * find no of zeroes
 * use 1 as break and crate the next binary digits as another values,calcuate no of zeroes in both parts,and use count to calculate binary gap
 * display greater no
 * 
 */
 