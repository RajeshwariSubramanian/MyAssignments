package week3.day2;

import java.util.HashSet;

import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {

		// input
		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };

		// set 1 to store input
		Set<Integer> intSet = new HashSet<Integer>();

		// set 2 to store duplicates

		Set<Integer> dupSet = new HashSet<Integer>();

		// check for duplicates

		for (Integer numbers : data) {
			// returns true if the value is not added previously
			// return false in case the adding value is already present in the Set.
			if (!intSet.add(numbers)) {
				dupSet.add(numbers);
			}
		}
		System.out.println("Numbers in The Set:" + intSet);
		System.out.println("Duplicates in the Set:" + dupSet);

	}

}
