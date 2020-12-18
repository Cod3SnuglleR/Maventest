package jCw1;
import java.util.Scanner;

public class lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,result =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Number");
		n=sc.nextInt();
		while(n>0)
		{
			n=n/10;
			//System.out.println("n"+n);
			result++;
			//System.out.println("result"+result);
		}
				System.out.println("number of digits are "+ result);
	}

}
