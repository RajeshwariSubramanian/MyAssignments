package week1.day2;

public class IsPrime {

	public static void main(String[] args) {

		int n = 6;
		int count = 0;

		for (int i = 2; i <= n; i++) {

			if (n % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("It's a prime number");
		} else
			System.out.println(" It's not a prime number");
	}

}
