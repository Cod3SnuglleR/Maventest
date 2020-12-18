import java.util.Scanner;

public class AvgSum {
	public static void main(String[] args) {
		int sub1,sub2,sub3,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject 1 marks");
		sub1=sc.nextInt();
		System.out.println("Enter Subject 2 marks");
		sub2=sc.nextInt();
		System.out.println("Enter Subject 3 marks");
		sub3=sc.nextInt();
		avg =(sub1+sub2+sub3)/3;
		System.out.println("Your Average Marks are " +avg);
	}

}
