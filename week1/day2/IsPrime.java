package week1.day2;

public class IsPrime {
	
	public static boolean checkPrime(int num) 
	{
		num =13;
		int count = 0;

		for (int i = 2; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) {
		return true;
		} else
			return false;
	 
	}

	public static void main(String[] args) {

		boolean isPrime=IsPrime.checkPrime(13);
	   System.out.println(isPrime);

	}

	

}
