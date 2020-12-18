
public class MyClass2 {
	static void myStaticMethod() {
		System.out.println("can be called without objects");
	}
	public void myPublicMethod() {
		System.out.println("cannot be called without objects");
	}
	public static void main(String[] args) {
	myStaticMethod();
	MyClass2 myObj=new MyClass2();
	myObj.myPublicMethod();

}
}