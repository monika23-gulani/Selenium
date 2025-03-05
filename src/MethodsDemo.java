
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getMyName();
		System.out.println(name);
		Methods2Demo d1 = new Methods2Demo();
		d1.getMyLocation4();
		System.out.println(getMyBirth());
	}
	
	public String getMyName()
	{
		System.out.println("I am in MethodsDemo Class");
		return "Monika";
	}
	
	public static String getMyBirth()
	{
		System.out.println("I am in MethodsDemo Class");
		return "Indore";
	}

}
