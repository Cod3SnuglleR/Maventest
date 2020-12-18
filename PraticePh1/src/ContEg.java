import java.util.Scanner;

public class ContEg {
	public static void main(String[] args) {
		int num1,num2,num3,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no 1");
	    num1 =sc.nextInt();
	    System.out.println("Enter no 2");
		num2 =sc.nextInt();
		System.out.println("Enter no 3");
		num3 =sc.nextInt();
		sum=num1+num2+num3;
		System.out.println("sum is " + sum);
	}

}
