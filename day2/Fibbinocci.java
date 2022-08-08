package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {

		int firstnum = 0, secondNum = 1, sum = 0;
		System.out.print(firstnum + " " + secondNum);
		for (int i = 2; i < 11; i++) {
			sum = firstnum + secondNum;
			System.out.print(" " + sum);
			firstnum = secondNum;
			secondNum = sum;

		}

	}

}
