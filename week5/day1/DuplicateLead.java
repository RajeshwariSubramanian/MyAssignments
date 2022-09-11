package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends CommonLeafTap {
@Test
	public void runDuplicateLead() {
	

		// Enter UserName and Password Using Id Locator
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");

		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");

		// Click on Login Button using Class Locator
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();

		// Click on CRM/SFA Link
		WebElement elementCrmSfa = driver.findElement(By.linkText("CRM/SFA"));
		elementCrmSfa.click();

		// Click on Leads Button
		WebElement elementLead = driver.findElement(By.linkText("Leads"));
		elementLead.click();

		// Click on Create Lead
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();

		// Enter CompanyName Field Using id Locator
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("INFOSYS");

		// Enter FirstName Field Using id Locator 
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("RAJESHWARI");

		// Enter LastName Field Using id Locator
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("SUBRAMANIAN");

		// Enter FirstName(Local) Field Using id Locator
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("RAJI");

		// Enter Department Field Using any Locator 
		WebElement elementDepartment = driver.findElement(By.name("departmentName"));
		elementDepartment.sendKeys("PAYMENTS");

		// Enter Description Field Using any Locator 
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Create Lead for Rajeshwari Subramanian");

		// Enter  email in the E-mail address Field 
		WebElement elementEmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmailAddress.sendKeys("rajirajesh13@gmail.com");

		// Select State/Province as NewYork Using Visible Text
		WebElement elementStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select StateProvinceDD = new Select(elementStateProvince);
		StateProvinceDD.selectByVisibleText("New York");

		// Click on Create Button
		WebElement elementCreateButton = driver.findElement(By.className("smallSubmit"));
		elementCreateButton.click();

		// Get the Title of Resulting Page
		System.out.println("Title of Resulting Page 1:" + driver.getTitle());

		// Click on Duplicate button
		WebElement elementDuplicateButton = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicateButton.click();

		// Clear the CompanyName Field using .clear() And Enter new CompanyName
		WebElement elementClearAndNewCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementClearAndNewCompanyName.clear();
		elementClearAndNewCompanyName.sendKeys("CTS");

		// Clear the FirstName Field using .clear() And Enter new FirstName

		WebElement elementClearAndNewFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementClearAndNewFirstName.clear();
		elementClearAndNewFirstName.sendKeys("AKSHARA");

		// Click on Create Lead Button
		WebElement elementCreateButton1 = driver.findElement(By.className("smallSubmit"));
		elementCreateButton1.click();

		// Get the Title of Resulting Page using driver.getTitle()
		System.out.println("Title of Resulting Page 2:" + driver.getTitle());

	}

}
