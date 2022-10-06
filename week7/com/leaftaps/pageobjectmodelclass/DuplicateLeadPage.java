package com.leaftaps.pageobjectmodelclass;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.projectspecfic.CommonLeafTap;

public class DuplicateLeadPage extends CommonLeafTap {

			public DuplicateLeadPage(RemoteWebDriver driver) {
			this.driver=driver;
		
	}
	
	public ViewLeadPage clickCreatutton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}

}
