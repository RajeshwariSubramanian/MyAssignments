package week1.day2;

public class Calculator {

	public int addThreeNumbers(int num1, int num2, int num3) {
		int number = num1 + num2 + num3;
		return number;
	}

	public int subTwoNumbers(int num1, int num2) {
		int number = num1 - num2;
		return number;
	}

	public double multiplyNumbers(double num1, double num2) {
		double number = num1 * num2;
		return number;
	}

	public float divideNumbers(float num1, float num2) {
		float number = num1 / num2;
		return number;
	}

	
	
		public static void main(String[] args) {
			
			Calculator cal = new Calculator();
			int addNumbers = cal.addThreeNumbers(5, 6, 2);
			System.out.println("Sum of Numbers:" + addNumbers);
			int subNumbers = cal.subTwoNumbers(65, 34);
			System.out.println("Difference of Numbers:" + subNumbers);
			double mulNumbers = cal.multiplyNumbers(5, 6);
			System.out.println("Product :" + mulNumbers);
			float divNumber = cal.divideNumbers(65, 5);
			System.out.println("Quotient :" + divNumber);

		}
		
		
		}


	

