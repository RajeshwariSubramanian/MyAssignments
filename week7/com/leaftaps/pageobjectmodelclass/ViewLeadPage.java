package com.leaftaps.pageobjectmodelclass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class ViewLeadPage extends CommonLeafTap {

	public ViewLeadPage(RemoteWebDriver driver) {
	this.driver=driver;
	}
public void leadIDVerification()
{
	System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
}
	
}
