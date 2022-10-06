package com.leaftaps.ui.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pageobjectmodelclass.LoginPage;
import com.leaftaps.projectspecfic.CommonLeafTap;

public class EditLead extends CommonLeafTap{
	@BeforeTest
	public void setData()
	{
		excelFileName="editleadexcel";
	}
	
	
@Test(dataProvider = "sendData")

	public void runEditLead(String username,String password,String phone,String cname) throws InterruptedException {
		

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
	.clickEdit()
	.enterCName(cname)
	.clickUpdate()
	.leadIDVerification();
	

}
	
}






