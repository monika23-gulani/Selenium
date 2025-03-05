import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no = {1,2,4,5,6,7,8,9,10,122};
		
		for(int i=0;i<no.length;i++)
		{
			if(no[i]%2==0)
			{
				System.out.println(no[i]);
			}
			else
			{
				System.out.println(no[i]+" is not a multiple of 2");
			}
		}
		
		for(int i=0;i<no.length;i++)
		{
			if(no[i]==122)
			{
				System.out.println(no[i]+" is found");
				break;
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Duggal");
		a.add("love surfing");
		a.add("introvert");
		a.remove(2);
		System.out.println(a.get(2));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("******************************");
		
		for(String val: a)
		{
			System.out.println(val);
		}
		
		//item is present in ArrayList
		System.out.println(a.contains("Duggal"));
		
		// How to convert array into arraylist
		String[] testArray = {"Hello","baby","sweet"};
		List<String> arraylistsample = Arrays.asList(testArray);
		System.out.println(arraylistsample.contains("baby"));
		
		
	}

}
