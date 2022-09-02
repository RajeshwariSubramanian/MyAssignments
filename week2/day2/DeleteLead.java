package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		// Launch URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// MAXIMIZE THE WINDOW
		driver.manage().window().maximize();

		// Enter UserName and Password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// Click on Login Button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();

		// Click on Leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//click phone number and enter the phone number
		driver.findElement(By.xpath("//span[text()='Phone']")).click();        
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8939439034");
		
		
		// Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);

		// Capture lead ID of First Resulting lead
		String elementLeadID = driver.findElement(By.xpath("//div/div[1]/table/tbody/tr[1]/td[1]/div/a")).getText();
		System.out.println(elementLeadID);
		
		Thread.sleep(2000);
		// Click First Resulting lead
		driver.findElement(By.xpath("//div/div[1]/table/tbody/tr[1]/td[1]/div/a")).click();
		
		Thread.sleep(2000);
		// Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		Thread.sleep(2000);
        //Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		// Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(elementLeadID);
		
		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		// Verify message "No records to display" in the Lead List
		String elementCapturedID = driver.findElement(By.xpath("//div[1]/div/div/div[2]//div[contains(text(),'No records')]")).getText();
		Thread.sleep(2000);
        //Close the browser 
		if (elementCapturedID.contains("No records to display")) {
			driver.close();
		}else
			System.out.println("Record found");

	}

}
