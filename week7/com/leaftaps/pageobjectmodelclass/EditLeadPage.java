package com.leaftaps.pageobjectmodelclass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class EditLeadPage extends CommonLeafTap {

	public EditLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public EditLeadPage enterCName(String cname)
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public ViewLeadPage clickUpdate()
	{
		
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
}
