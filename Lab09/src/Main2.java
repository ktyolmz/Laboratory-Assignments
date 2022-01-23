import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word = keyboard.nextLine();
		System.out.print(vowelCount(word));
		keyboard.close();
	}

	public static int vowelCount(String str) {
	
		if (str.length() < 1)
			return 0;
		else {
			if ( str.charAt(0) == 'a' ||  str.charAt(0) == 'e' ||  str.charAt(0) == 'i' ||  str.charAt(0) == 'o' ||  str.charAt(0) == 'u') {
				
				
				return 1 + vowelCount(str.substring(1));
				
			}
			
			
			return 0 + vowelCount(str.substring(1));
		}

	}
}
