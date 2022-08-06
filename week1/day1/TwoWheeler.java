package week1.day1;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 23456798L;
	boolean isPunctured = true;
	String bikeName = "HONDA";
	double runningKM = 2568.95;

	public static void main(String[] args) {

		TwoWheeler twowheeler = new TwoWheeler();
		System.out.println("Wheels:" + twowheeler.noOfWheels);
		System.out.println("Mirrors:" + twowheeler.noOfMirrors);
		System.out.println("Chassis Number:" + twowheeler.chassisNumber);
		System.out.println("Punctured:" + twowheeler.isPunctured);
		System.out.println("Bike Name:" + twowheeler.bikeName);
		System.out.println("Kilometers Run:" + twowheeler.runningKM);
	}
}
