package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class OrderingMobile extends CommonServiceNow {

	@BeforeTest
	public void setData() {
		excelFileName = "orderMobile";
	}

	@Test(dataProvider = "sendData")
	public void runOrderingMobile(String username, String password, String Service) throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		
		// Click-All and Enter Service catalog in filter navigator and press enter 
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(15);
		WebElement elementAll = dom.findElementByXPath("//div[text()='All']");		
		elementAll.click();
		WebElement elementFilter = dom.findElementByXPath("//input[@id='filter']");
		elementFilter.sendKeys(Service);
		Thread.sleep(3000);
		elementAll.click();
		elementFilter.sendKeys(Keys.ENTER);
		
		//Click on  mobiles and Select Apple iphone6s
		WebElement elementFrame = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(elementFrame);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Catalog"));
		dom.findElementByXPath("//a[text()='Mobiles']").click();
		dom.findElementByXPath("//a[text()='Apple iPhone 6s']").click();
		
		//Update color field to rose gold and storage field to 128GB and click Order now
		WebElement listMobileColor = driver.findElement(By.xpath("(//select[contains(@class,'control cat_item')])[2]"));
		dom.scrollTo(listMobileColor);
		Select ddColor = new Select(listMobileColor);
		ddColor.selectByVisibleText("Rose Gold");
		WebElement listMobileStorage = driver.findElement(By.xpath("(//select[contains(@class,'control cat_item')])[3]"));
		Select ddStorage = new Select(listMobileStorage);
		ddStorage.selectByIndex(2);
		dom.findElementByXPath("//span[text()='Order Now']/parent::button").click();
		
		//Verify order is placed and copy the request number
		if (driver.getTitle().contains("Order")) {
			String requestNum = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
			System.out.println("Order is placed");
			System.out.println("The Request Number:" + requestNum);
		} else
			System.out.println("Order not placed");
	}

}
