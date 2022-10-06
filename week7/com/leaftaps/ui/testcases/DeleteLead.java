package com.leaftaps.ui.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pageobjectmodelclass.LoginPage;
import com.leaftaps.projectspecfic.CommonLeafTap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends CommonLeafTap{
	@BeforeTest
	public void setData()
	{
		excelFileName="deleteexcel";
	}
	
	@Test(dataProvider = "sendData")
	public void runDeleteLead(String username,String password,String phone) throws InterruptedException {
		
	new LoginPage(driver)
	.enterUserName(username)
	.enterPassword(password)
	.clickLoginButton_Positive()
	.clickCRMSFA()
	.clickLeads()
	.clickFindLeads() 
	.clickPhone()
	.enterPhoneNum(phone)
	.clickFindLeadsButton()
	.clickLeadID()
	.clickDelete();
}
}






