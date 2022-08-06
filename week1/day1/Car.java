package week1.day1;

public class Car {
	byte speed=20;
	short kilometersRun=20000;
	int year=2001;
	char modelSeries='K';
	long vehicleIdentificationNumber=98765477294990l;
	float weight= 1200.122f;
	double price=129999.99;
	String brand="Maruthi";
    boolean isOutOfStock=true;
    
    
    public static void main(String[] args) {
		Car cardetails=new Car();
		
		System.out.println("Speed:"+cardetails.speed);
		System.out.println("Kilometers:"+cardetails.kilometersRun);
		System.out.println("Year:"+cardetails.year);
		System.out.println("Series:"+cardetails.modelSeries);
		System.out.println("VehicleIdentificationNumber:"+cardetails.vehicleIdentificationNumber);
		System.out.println("Price:"+cardetails.price);
		System.out.println("Brand:"+cardetails.brand);
		System.out.println("Out of stock:"+cardetails.isOutOfStock);
		
		
	}    }
