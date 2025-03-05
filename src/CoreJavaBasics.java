
public class CoreJavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum =5; // non primitive data types
		String website = "Rahul Shetty"; //primitive data types
		char letter = 'r';
		float a = 5.6f;
		double b = 9.5;
		boolean isflag = true;
		
		System.out.println(myNum+" is the value stored");
		
		System.out.println(website);
		
		//Arrays in Java
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,4,5,6};
		System.out.println(arr2[2]);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] names = {"Seerat","Rahul","Monika"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		for(String s : names)
		{
			System.out.println(s);
		}
		
	}
}
