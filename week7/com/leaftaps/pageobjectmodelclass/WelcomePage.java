package com.leaftaps.pageobjectmodelclass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class WelcomePage extends CommonLeafTap {

	public WelcomePage(RemoteWebDriver driver) {
	this.driver=driver;
	}

	public HomePage clickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}
	public LoginPage clickLogout()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
}
