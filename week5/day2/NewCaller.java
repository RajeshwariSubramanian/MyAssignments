package week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewCaller extends CommonServiceNow {

	@BeforeTest
	public void setData() {
		excelFileName = "newCallerDetails";
	}

	@Test(dataProvider = "sendData")
	public void createNewCaller(String username, String password, String caller, String fname, String lname,
			String title, String email, String businessNum, String MobNum) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		// Click-All and Enter Callers in filter navigator and press enter
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(15);
		WebElement elementAll = dom.findElementByXPath("//div[text()='All']");
		elementAll.click();

		WebElement elementFilter = dom.findElementByXPath("//input[@id='filter']");
		elementFilter.sendKeys(caller);
		Thread.sleep(3000);
		elementAll.click();

		elementFilter.sendKeys(Keys.ENTER);

		WebElement elementFrame1 = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(elementFrame1);
		driver.findElement(By.xpath("//button[text()='New']")).click();

		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys(title);
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys(businessNum);
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys(MobNum);

		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();

		Thread.sleep(3000);
		List<WebElement> elementRows = driver.findElements(By.xpath("//table[@id='sys_user_table']/tbody/tr"));
		//List<WebElement> elementColumns = driver.findElements(By.xpath("//table[@id='sys_user_table']/tbody/tr/td"));
		
		String rowValue="";
		
		for (WebElement ele:elementRows) {
			 
				if (ele.getText().contains(fname)) {
					rowValue=ele.getText();
					
					}
		}
		System.out.println("New Created Caller Details:"+rowValue);
	}
}