package com.leaftaps.pageobjectmodelclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class MergeLeadPage extends CommonLeafTap {

	public MergeLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

public FromLeadPage clickFromLead()
{
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	return new FromLeadPage(driver);
}
public ToleadPage clickToLead()
{
	
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	return new ToleadPage(driver);
}
public MergeLeadPage parentWindow()
{
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(0));
	return this;
}
	
public ViewLeadPage clickMergeLeadButton() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	driver.switchTo().alert().accept();
	return new ViewLeadPage(driver);
}

}
