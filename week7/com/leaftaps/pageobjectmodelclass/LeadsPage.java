package com.leaftaps.pageobjectmodelclass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class LeadsPage extends CommonLeafTap {

	public LeadsPage(RemoteWebDriver driver) {
	this.driver=driver;
	}
public CreateLeadsPage clickCreateLead()
{
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadsPage(driver);
}

public FindLeadDetailsPage clickFindLeads()  {
	driver.findElement(By.linkText("Find Leads")).click();
	return new FindLeadDetailsPage(driver);
	
}

public MergeLeadPage clickMergeLeads()  {
	driver.findElement(By.linkText("Merge Leads")).click();
	return new MergeLeadPage(driver);
}
}
