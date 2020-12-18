import java.util.Scanner;
public class GreaterofTrio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if ((a>b)&&(a>c)) {
			System.out.println(a+ " is Greater");
		}
		else if(c>a&& c>b) {
			System.out.println(c + " is Greater");
		}
		else
		{
			System.out.println(b +" is Greater");
		}
	}

}
