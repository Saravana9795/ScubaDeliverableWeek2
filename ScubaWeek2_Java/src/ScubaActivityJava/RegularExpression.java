package ScubaActivityJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Saravana";
        String str1 = "Kumar";
        
        Pattern pt = Pattern.compile(str);
        Matcher mt = pt.matcher(str);
        
        boolean result = mt.matches();
        System.out.println(result);
        
        		
        		
	}

}
