package week2.day2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();

		// Click and Confirm title.
		driver.findElement(By.xpath("//span[text()='Click']//parent::button")).click();
		System.out.println("The title of the Page:" + driver.getTitle());

		if (driver.getTitle().contains("board")) {
			System.out.println("The title matches the current page");
		} else
			System.out.println("The title doesn't matches");
		Thread.sleep(2000);
		driver.navigate().back();

		// Confirm if the button is disabled.
		WebElement elementButtonDisabled = driver.findElement(By.xpath("//span[text()='Disabled']//parent::button"));
		if (elementButtonDisabled.isEnabled()) {
			System.out.println("Button is enabled");
		} else
			System.out.println("Button is Disabled");

		// Find the position of the Submit button
		WebElement elementButtonPosition = driver.findElement(By.xpath("(//span[text()='Submit']//parent::button)[1]"));
		System.out.println("The Position of Submit Button:" + elementButtonPosition.getLocation());

		// Find the Save button color
		WebElement elementGetColor = driver.findElement(By.xpath("//span[text()='Save']//parent::button"));
		System.out.println("The color of Button:" + elementGetColor.getCssValue("background-color"));

		// Find the height and width of the button
		WebElement elementGetSize = driver.findElement(By.xpath("(//span[text()='Submit']//parent::button)[2]"));
		System.out.println("The height and width of Button:" + elementGetSize.getSize());
		Thread.sleep(2000);
		
		// Mouse over and confirm the color changed
		WebElement elementMouseOver = driver.findElement(By.xpath("(//span[text()='Success']//parent::button)[1]"));
		String colorBeforeMouseOver = elementMouseOver.getCssValue("background-color");
		Actions actions = new Actions(driver);
		actions.moveToElement(elementMouseOver).perform();
		String colorAfterMouseOver = elementMouseOver.getCssValue("background-color");

		if (colorBeforeMouseOver.equals(colorAfterMouseOver)) {
			System.out.println("The Color not Changed on mouseover");
		} else
			System.out.println("The Color changes on mouseover");

		Thread.sleep(2000);

		// Click Image Button and Click on any hidden button
		WebElement elementImageClick = driver.findElement(By.xpath("//span[text()='Image']//parent::button"));
		elementImageClick.click();

		
		WebElement elementImageClick1 = driver.findElement(By.xpath("//div[contains(@class,'overlaypanel')]/img"));
		Thread.sleep(2000);

		 //Take the screenshot
		        File source =  elementImageClick1.getScreenshotAs(OutputType.FILE);
		    
		  //Copy the file to a location 
		        File dest=new File("./snaps/TestLogo.png");
		        
		        FileUtils.copyFile(source, dest);
		Thread.sleep(2000);

		// How many rounded buttons are there?
		List<WebElement> elementCountButtons = driver.findElements(By.xpath("//button[contains(@class,'rounded')]"));
		int count = elementCountButtons.size();
		System.out.println("Number of rounded buttons:" + count);

		Thread.sleep(2000);
		driver.close();
	}
}
