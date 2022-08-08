package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);

		int length = arr.length;
		// System.out.println(length);

		int count = 0;

		for (int i = 1; i < length; i++) {
			if (arr[count] != i) {
				System.out.println("Missing number:" + i);
			} else
				count++;

		}
	}

}
