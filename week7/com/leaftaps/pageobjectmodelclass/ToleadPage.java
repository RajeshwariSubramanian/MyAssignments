package com.leaftaps.pageobjectmodelclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class ToleadPage extends CommonLeafTap
{

	public ToleadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public ToleadPage enterFirstName(String fname) throws InterruptedException
	{
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		Thread.sleep(1000);
		return this;
	}
		 
	public ToleadPage clickFindLeads() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);	
		return this;
	}
	public MergeLeadPage clickFirstLeadID() throws InterruptedException
	{	
		//String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(1000);
		return new MergeLeadPage(driver);
			
	}
}
