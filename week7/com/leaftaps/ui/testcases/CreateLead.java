package com.leaftaps.ui.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.leaftaps.pageobjectmodelclass.LoginPage;
import com.leaftaps.projectspecfic.CommonLeafTap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends CommonLeafTap{
	@BeforeTest
	public void setData()
	{
		excelFileName="testExcel";
		testName="CreateLead";
		testDescription="Create Lead with Mandatory fields";
		testCategory="functional";
		testAuthor="Raji";
		
	}
	
	
@Test(dataProvider = "sendData")
	public void runCreateLead(String username,String password,String cname,String fname,String lname) {

	
	new LoginPage(driver)
	.enterUserName(username)
	.enterPassword(password)
	.clickLoginButton_Positive()
	.clickCRMSFA()
	.clickLeads()
	.clickCreateLead()
	.enterCName(cname)
	.enterFirstName(fname)
	.enterLastName(lname)
	.clickCreateLeadButton()
	.leadIDVerification();
	
		

}
	
	
	}
	
	
	
	




