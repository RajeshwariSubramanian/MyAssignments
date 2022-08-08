
package week1.day2;

public class Calculator {
	public static void main(String[] args) {

		Mycalculator cal1 = new Mycalculator();
		System.out.println("Sum of Numbers:" + cal1.addNumbers);
		System.out.println("Difference of Numbers:" + cal1.subNumbers);
		System.out.println("Product :" + cal1.mulNumbers);
		System.out.println("Quotient :" + cal1.divNumber);

	}

	public int addThreeNumbers(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	public int subTwoNumbers(int num1, int num2) {
		int diff = num1 - num2;
		return diff;
	}

	public double multiplyNumbers(int num1, int num2) {
		double prod = num1 * num2;
		return prod;
	}

	public float divideNumbers(int num1, int num2) {
		float quotient = num1 / num2;
		return quotient;
	}
}

class Mycalculator {
	Calculator cal = new Calculator();
	int addNumbers = cal.addThreeNumbers(5, 6, 2);
	int subNumbers = cal.subTwoNumbers(65, 34);
	double mulNumbers = cal.multiplyNumbers(5, 6);
	float divNumber = cal.divideNumbers(65, 5);

}

		


	

