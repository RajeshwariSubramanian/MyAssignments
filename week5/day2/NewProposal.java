package week5.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewProposal extends CommonServiceNow {

	@BeforeTest
	public void setData() {
		excelFileName = "newProposal";
	}

	@Test(dataProvider = "sendData")
	public void runNewProposal(String username, String password, String proposal, String description, String shortDesc,
			String DetailDesc) throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(15);
		WebElement elementAll = dom.findElementByXPath("//div[text()='All']");
		elementAll.click();
		WebElement elementChange = dom.findElementByXPath("//input[@id='filter']");
		elementChange.sendKeys(proposal);
        Thread.sleep(3000);
		elementAll.click();
		elementChange.sendKeys(Keys.ENTER);

		WebElement elementFrame = dom.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(elementFrame);
		driver.findElement(By.xpath("//button[text()='New']")).click();

		WebElement eleDescription = driver
				.findElement(By.xpath("//div[@id='element.std_change_proposal.short_description']//input[3]"));

		eleDescription.sendKeys(description);

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[text()='Change Request values'])[1]")).click();
		WebElement eleInputShortDes = driver.findElement(By.xpath(
				"//table[contains(@id,'template_valuefilters_table')]//tr[3]/td//input[@class='filerTableInput form-control']"));
		eleInputShortDes.clear();
		eleInputShortDes.sendKeys(shortDesc);

		WebElement eleInputDetailedDes = driver
				.findElement(By.xpath("//table[contains(@id,'template_valuefilters_table')]//tr[4]/td//textarea"));
		eleInputDetailedDes.clear();
		eleInputDetailedDes.sendKeys(DetailDesc);

		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();

		List<WebElement> elementColumns = driver
				.findElements(By.xpath("//table[@id='std_change_proposal_table']/tbody/tr[1]/td"));

		System.out.println("New Proposal Created");
		for (int j = 1; j <= elementColumns.size(); j++) {
			String text = driver
					.findElement(By.xpath("//table[@id='std_change_proposal_table']/tbody/tr[1]/td[" + j + "]"))
					.getText();
			System.out.println(text);
		}

	}

}
