package com.leaftaps.pageobjectmodelclass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class ViewLeadEditDetailsPage extends CommonLeafTap {

	public ViewLeadEditDetailsPage(RemoteWebDriver driver) {
	this.driver=driver;
	}  
	
	public EditLeadPage clickEdit()
	{
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public  HomePage clickDelete()
	{
		driver.findElement(By.linkText("Delete")).click();
		return new HomePage(driver);
	}
	
	public DuplicateLeadPage clickDuplicate()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
	
}
