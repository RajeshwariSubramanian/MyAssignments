package com.leaftaps.pageobjectmodelclass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class CreateLeadsPage extends CommonLeafTap {

	public CreateLeadsPage(RemoteWebDriver driver) {
	this.driver=driver;
	}
public CreateLeadsPage enterCName(String cname)
{
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	return this;
	
}
public CreateLeadsPage enterFirstName(String fname)
{
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	return this;
	
}
public CreateLeadsPage enterLastName(String lname)
{
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	return this;
}
public ViewLeadPage clickCreateLeadButton()
{
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}
	
}
