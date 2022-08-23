package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {

		// Input Random numbers from 1 to 10
		int[] numb = { 6, 2, 5, 3, 9, 8, 7, 10 };

		// Add into Set
		Set<Integer> missNumbSet = new TreeSet<Integer>();

		for (int i = 0; i < numb.length; i++) {
			missNumbSet.add(numb[i]);
		}
		System.out.println("Numbers in Set:" + missNumbSet);

		// Check for Missing Number

		for (int i = 0; i < missNumbSet.size(); i++) {
			if (!missNumbSet.contains(i + 1)) {
				System.out.println("The Missing Number:" + (i + 1));
			}
		}

	}
}
