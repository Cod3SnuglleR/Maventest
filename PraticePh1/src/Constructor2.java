
public class Constructor2 {
	int modelYear;
	String modelName;
	public Constructor2(int year,String name) {
		modelYear=year;
		modelName=name;
		
	}
	public static void main(String[] args) {
		Constructor2 myObj=new Constructor2(1968,"Mustang");
		System.out.println("My car is a "+myObj.modelName+" from "+myObj.modelYear+".");
	}

}
