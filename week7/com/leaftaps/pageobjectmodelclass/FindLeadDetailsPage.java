package com.leaftaps.pageobjectmodelclass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class FindLeadDetailsPage extends CommonLeafTap {

	public FindLeadDetailsPage(RemoteWebDriver driver) {
	this.driver=driver;
	} 
	
	
	public FindLeadDetailsPage clickPhone()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadDetailsPage enterPhoneNum(String num)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(num);
		return this;
	}
	public FindLeadDetailsPage clickFindLeadsButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		return this;
	}
	public ViewLeadEditDetailsPage clickLeadID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadEditDetailsPage(driver);
	}
}
	