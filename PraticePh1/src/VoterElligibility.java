import java.util.Scanner;

public class VoterElligibility {
	public static void main(String[] args) {
		int vage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age ");
		vage=sc.nextInt();
		if(vage>=19) {
			System.out.println("Your Elligible to vote");
			
		}
		else
			System.out.println("Inelligible to vote");
	}

}
