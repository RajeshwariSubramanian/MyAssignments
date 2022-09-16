package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class KnowledgeArticle extends CommonServiceNow {

		@BeforeTest
		public void setData() {
			excelFileName = "newKnowledgeDetails";
		}

		@Test(dataProvider = "sendData")
		public void createKnowledgeArticle(String username, String password, String knowledge,String desc) throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
						
			
			Shadow dom = new Shadow(driver);
			dom.setImplicitWait(15);
			WebElement elementAll = dom.findElementByXPath("//div[text()='All']");
			elementAll.click();

			WebElement elementFilter = dom.findElementByXPath("//input[@id='filter']");
			elementFilter.sendKeys(knowledge);
			Thread.sleep(3000);
			elementAll.click();
		
			elementFilter.sendKeys(Keys.ENTER);
			

			WebElement elementFrame = dom.findElementByXPath("//iframe[@title='Main Content']");
			driver.switchTo().frame(elementFrame);
			driver.findElement(By.xpath("//span[text()='Create an Article']/parent::button")).click();
			driver.findElement(By.xpath("(//button[contains(@id,'lookup.kb_knowledge')])[1]")).click();
			Set<String> windowHandles=driver.getWindowHandles();
			List<String> listWindows=new ArrayList<String>(windowHandles);		
			driver.switchTo().window(listWindows.get(1));
			
			driver.findElement(By.xpath("//a[text()='IT']")).click();
			driver.switchTo().window(listWindows.get(0));
			
			WebElement elementFrame1 = dom.findElementByXPath("//iframe[@title='Main Content']");
			driver.switchTo().frame(elementFrame1);
			driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_category']/span")).click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='kb_categories_dialog']")));
					
			WebElement eleDialog=driver.findElement(By.xpath("//div[@id='kb_categories_dialog']"));
			eleDialog.findElement(By.xpath("//span[text()='IT']/parent::div")).click();
			eleDialog.findElement(By.xpath("//span[text()='Java']/parent::div")).click();
			
			eleDialog.findElement(By.xpath("//button[@id='ok_button']")).click();
			
			
			
			 WebElement eleDesc=driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']"));
			 eleDesc.sendKeys(desc);
			
			 driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
			
		}
	
}
