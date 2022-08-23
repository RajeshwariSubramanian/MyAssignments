package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		// input
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		// Create two lists
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		// Add array numbers to lists
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			list2.add(arr2[i]);
		}
		System.out.println("List1:"+list1);
		System.out.println("List2:" +list2);
		System.out.println("======Intersection of two lists======");
		// Check for intersection
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i).equals(list2.get(j))) {
					System.out.println(list1.get(i));
				}
			}
		}

	}

}
