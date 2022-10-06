package com.leaftaps.pageobjectmodelclass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class HomePage extends CommonLeafTap {

	public HomePage(RemoteWebDriver driver) {
	this.driver=driver;
	}
public LeadsPage clickLeads()
{
	driver.findElement(By.linkText("Leads")).click();
	return new LeadsPage(driver);
}
}
