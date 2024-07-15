package assignment;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class stringusingregrex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Computer Science Engineering";
		
		Pattern p = Pattern.compile("\\b[a-zA-Z]");
		
		Matcher m1 = p.matcher(s1);
		
		System.out.println("First letter of each word from string:  \"" + s1 + "\"  ");
		while (m1.find())
			System.out.print(m1.group());
		
		System.out.println();
		
	
	}

}
