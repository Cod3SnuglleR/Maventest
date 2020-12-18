import java.util.Scanner;

public class Test01 {
	static String myMethod(String loli) {
		return loli +" is a bitch" ;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ename;
		System.out.println("Enter your Enemies name ");
		ename=sc.nextLine();
				
		System.out.println(myMethod(ename));
	}
}
