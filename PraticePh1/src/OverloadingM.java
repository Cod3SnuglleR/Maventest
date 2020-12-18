
public class OverloadingM {
	static int plusmyMethod(int x,int y) {
    return x+y;
}
	
	static double plusmyMethod(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		int myNum1=plusmyMethod(4,8);
		double myNum2=plusmyMethod(1.5,6.9);
		System.out.println("int: "+ myNum1);
		System.out.println("Double: "+ myNum2);
		
	}
	
}	