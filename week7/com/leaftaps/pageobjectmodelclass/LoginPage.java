package com.leaftaps.pageobjectmodelclass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class LoginPage extends CommonLeafTap {

	public LoginPage(RemoteWebDriver driver) {
	this.driver=driver;
	}

	public LoginPage enterUserName(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	public LoginPage enterPassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public WelcomePage clickLoginButton_Positive()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	public LoginPage clickLoginPage_negative()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
}
