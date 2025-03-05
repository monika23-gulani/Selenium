
public class CoreJavaBasics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object
		String s ="Rahul Duggal Punjab";
		String s1 ="Rahul Duggal Punjab";
		
		String s3 = new String("Welcome world");
		String s4 = new String("Welcome world");

		String[] splittedString = s.split("Duggal");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[0].trim());
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}


	}

}
