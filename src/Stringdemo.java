import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "Monika";
		int n = 10;
		m = m.concat("Dinesh");
		System.out.println(m);
		String firstname = "Rahul";
		String lname = "Duggal";
		String fullname = String.join("", firstname, lname);
		System.out.println(fullname);
		String formattedString = String.format("Hello,%s %d", firstname, n);
		System.out.println(formattedString.toString());

		List<String> str = Arrays.asList("Monika", "Rahu;", "Seerat");
		//String result = str.stream().collect(Collectors.joining(","));
		//System.out.println(result.toString());
		 String text= new String("Hello, My name is Sachin");  
	        /* Splits the sentence by the delimeter passed as an argument */  
	        String[] sentences = text.split("\\."); 
	        
	        for(String s:sentences)
	        {
	        	System.out.println(s);
	        	System.out.println();
	        }
	}

}
