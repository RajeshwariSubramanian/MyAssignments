package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// LAUNCH THE URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//form//a[contains(text(),'Create New')]")).click();
		
		//Enter FirstName
		driver.findElement(By.xpath("//form//input[@name='firstname']")).sendKeys("RAJE");
		
		//Enter Lastname
		driver.findElement(By.xpath("//form//input[@name='lastname']")).sendKeys("RAJESH");
		
		//Enter Mobile NUmber
		driver.findElement(By.xpath("//form//input[@name='reg_email__']")).sendKeys("8965438234");
		
		//Enter Password
		driver.findElement(By.xpath("//form//input[@id='password_step_input']")).sendKeys("RajeRajesh@123");
		
		//Select Date Dropdown
		WebElement elementDateOfBirth = driver.findElement(By.xpath("//form//div[@id='birthday_wrapper']//select[@id='day']"));
		Select DateOfBirthDD = new Select(elementDateOfBirth);
		DateOfBirthDD.selectByVisibleText("17");
		
		//Select Month Dropdown
		WebElement elementBirthdayMonth = driver.findElement(By.xpath("//form//div[@id='birthday_wrapper']//select[@id='month']"));
		Select MonthDD = new Select(elementBirthdayMonth);
		MonthDD.selectByVisibleText("Apr");
		
		//Select Year Dropdown
		WebElement elementBirthdayYear = driver.findElement(By.xpath("//form//div[@id='birthday_wrapper']//select[@id='year']"));
		Select BirthdayYearDD = new Select(elementBirthdayYear);
		BirthdayYearDD.selectByVisibleText("1990");
		
		//Click on Female Radio Button
		driver.findElement(By.xpath("//form//span/span[1]/input")).click();

	}

}
