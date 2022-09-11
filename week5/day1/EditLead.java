package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends CommonLeafTap{
@Test
	public void runEditLead() throws InterruptedException {
		

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

		// Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Rajeshwari");

		// Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);

		// Click on first resulting lead
		driver.findElement(By.xpath("(//table)[21]/tbody/tr[1]/td[1]//a")).click();

		String verifyTitle = driver.getTitle();

		// Verify title of the page
		if (verifyTitle.contains("View Lead")) {
			System.out.println("Title Matched");
		} else
			System.out.println("Title not Matched");

		// Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		// Change the Company name
		driver.findElement(By.xpath("//table//input[@id='updateLeadForm_companyName']")).clear();
		WebElement elementNewCompanyName=driver.findElement(By.xpath("//table//input[@id='updateLeadForm_companyName']"));
		elementNewCompanyName.sendKeys("SCB");
	
			
		//Click Update
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		//Confirm the Changed name
		
		String elementConfirmChange=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/span")).getText();
				
		if(elementConfirmChange.contains("SCB"))
		{
			driver.close();
		}		else 
			System.out.println("Not matched");	
		}
		
}
