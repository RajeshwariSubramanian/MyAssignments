package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {
	int number = -982;

	public static void main(String[] args) {
		ConvertANegativeNumberToPositiveNumber negativetopositive = new ConvertANegativeNumberToPositiveNumber();

		if (negativetopositive.number < 0) {
			negativetopositive.number = negativetopositive.number * -1;
			System.out.println("Converted Positive Number:" + negativetopositive.number);
		}

	}

}
