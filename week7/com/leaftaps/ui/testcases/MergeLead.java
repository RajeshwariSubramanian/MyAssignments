package com.leaftaps.ui.testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pageobjectmodelclass.LoginPage;
import com.leaftaps.projectspecfic.CommonLeafTap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead extends CommonLeafTap{
	
	@BeforeTest
	public void setData()
	{
		excelFileName="Mergeexcel";
	}
	
@Test(dataProvider = "sendData")
	public void runMergeLead(String username,String password,String fname1,String fname2) throws InterruptedException {
	new LoginPage(driver)
	.enterUserName(username)
	.enterPassword(password)
	.clickLoginButton_Positive()
	.clickCRMSFA()
	.clickLeads()
	.clickMergeLeads()
	.clickFromLead()
	.enterFirstName(fname1)
	.clickFindLeads()
	.clickFirstLeadID()
	.parentWindow()
	.clickToLead()
	.enterFirstName(fname2)
	.clickFindLeads()
	.clickFirstLeadID()
	.parentWindow()
	.clickMergeLeadButton()
	.leadIDVerification();
		
		
	}
}






