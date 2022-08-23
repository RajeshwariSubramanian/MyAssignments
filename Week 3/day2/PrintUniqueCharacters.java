package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		// input your name
		String name = "rajeshwari";
		// convert to character array
		char[] nameChar = name.toCharArray();
		// Create hash set
		Set<Character> setChar = new HashSet<Character>();
		// Printing unique character
		for (Character uniqChar : nameChar) {
			//if the character repeats remove.
			if (!setChar.add(uniqChar)) {				
				setChar.remove(uniqChar);
			}
		}
		System.out.println(setChar);

	}

}
