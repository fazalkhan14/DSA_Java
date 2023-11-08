import java.util.*;

public class ReverseString {
	
	public static String reverse(String str) {
		String reversed = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		
		return reversed;
	}
	
	public static String reverseWithReelJava(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static String recursiveReversal (String str) {
		if (str.length() == 0)  //breakpoint for recursion
			return "";
		return recursiveReversal(str.substring(1)) + str.charAt(0);
	}
	
}
