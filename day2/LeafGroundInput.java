package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInput {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		// Type name
		driver.findElement(By.xpath("//form/div[1]/div/input[@id='j_idt88:name']")).clear();
		driver.findElement(By.xpath("//form/div[1]/div/input[@id='j_idt88:name']")).sendKeys("Rajeshwari");
		Thread.sleep(2000);

		// Append Country to the City
		String elementAppendCountry = driver.findElement(By.xpath("//form//input[@value='Chennai']")).getText();
		String elementNew = elementAppendCountry.concat("India");
		driver.findElement(By.xpath("//form//input[@value='Chennai']")).sendKeys(elementNew);
		

		// Verify if textbox is disabled
		WebElement elementVerifyTextBox = driver.findElement(By.xpath("//form//input[@placeholder='Disabled']"));
		if (elementVerifyTextBox.isEnabled()) {
			System.out.println("Textbox is enabled");
		} else
			System.out.println("Textbox is Disabled");
		Thread.sleep(2000);

		// Clear the Typed text
		driver.findElement(By.xpath("//form//input[contains(@value,'Can you clear')]")).clear();
		Thread.sleep(2000);

		// Retrieve the typed text
		WebElement elementRetrieveText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String elementText = elementRetrieveText.getAttribute("value");
		System.out.println(elementText);
		Thread.sleep(2000);

		// Type email and Tab. Confirm control moved to next element.

		WebElement elementEmail = driver.findElement(By.xpath("//form//input[contains(@placeholder,'Your email ')]"));
		elementEmail.sendKeys("rajiit39@gmail.com", Keys.TAB);

		WebElement elementConfirmControl = driver.findElement(By.xpath("//form//textarea[@id='j_idt88:j_idt101']"));
		boolean isControlMoved = elementConfirmControl.equals(driver.switchTo().activeElement());
		System.out.println("Control moved to next Element:" + isControlMoved);
		Thread.sleep(2000);
		
		//Type about yourself
		elementConfirmControl.sendKeys("Hi I am Rajeshwari.\n I am on a career break.\n Wish to return to job.");

		// Text editor
		Thread.sleep(2000);
		WebElement elementTextEditor = driver
				.findElement(By.xpath("//div[@id='j_idt88:j_idt103_toolbar']/span[2]/button[2]"));
		elementTextEditor.click();
		WebElement elementTextEditorInput = driver.findElement(By.xpath("//form/div[8]/div/div//p[1]"));
		elementTextEditorInput.sendKeys("Hi ! I am Rajee");
		Thread.sleep(2000);

		// Just Press Enter and confirm error message
		WebElement elementEnter = driver.findElement(By.id("j_idt106:thisform:age"));
		elementEnter.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement elementConfirmErrorMessage=driver.findElement(By.xpath("//span[@id='j_idt106:thisform:j_idt110_error-detail']"));
		System.out.println(elementConfirmErrorMessage.getText());
		
		// Click and Confirm Label Position Changes	
		WebElement elementConfirmLabel = driver.findElement(By.xpath("//label[text()='Username']"));
		Point XYposition1 = elementConfirmLabel.getLocation();
		System.out.println("The Label Position 1:"+XYposition1);

		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();

		Point XYposition2 = elementConfirmLabel.getLocation();
		System.out.println("The Label Position 2:"+XYposition2);
		if (XYposition1.equals(XYposition2)) {
			System.out.println("Label Position has not Changed ");
		} else
			System.out.println("Label Position is Changed ");

		
		Thread.sleep(2000);
		
		// Type your name and choose the third option
		WebElement elementName = driver.findElement(By.xpath(" //input[@id='j_idt106:auto-complete_input']"));
		elementName.sendKeys("Raje");
		Thread.sleep(2000);
		WebElement elementNewName = driver.findElement(By.xpath(" //*[@id='j_idt106:auto-complete_panel']/ul/li[3]"));
		elementNewName.click();

		WebElement elementList = driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete']/ul/li[1]"));
		elementList.click();
		Thread.sleep(2000);

		// Type your DOB (mm/dd/yyyy) and confirm date chosen
		driver.findElement(By.xpath("//span/input[@id='j_idt106:j_idt116_input']")).sendKeys("11/10/1990");
		Thread.sleep(2000);

		
		// Type number and spin to confirm value changed
		WebElement elementNumber = driver.findElement(By.xpath("//span/input[@id='j_idt106:j_idt118_input']"));
		elementNumber.sendKeys("20");

		WebElement elementSpinUp = driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a[1]/span/span"));
		elementSpinUp.click();

		WebElement elementNewNumber = driver.findElement(By.xpath("//span/input[@id='j_idt106:j_idt118_input']"));
		String text1 = elementNewNumber.getAttribute("aria-valuenow");

		if (text1.equals("20")) {
			System.out.println("The value of spin not changed");
		} else
			System.out.println("The value changed after spin to:" +text1);
		Thread.sleep(2000);
		
		WebElement elementSpindown = driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a[2]/span/span"));
		elementSpindown.click();
		Thread.sleep(2000);
		elementSpindown.click();
		
		WebElement elementNewNumber2 = driver.findElement(By.xpath("//span/input[@id='j_idt106:j_idt118_input']"));
		String text2 = elementNewNumber2.getAttribute("aria-valuenow");
		if (text2.equals("20")) {
			System.out.println("The value of spin not changed");
		} else
			System.out.println("The value changed after spin to:" +text2);
		Thread.sleep(2000);

		// Type random number (1-100) and confirm slider moves correctly
		WebElement elementSliderFirst=driver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']/span"));
		Point position1=elementSliderFirst.getLocation();
		WebElement elementInputRandom = driver.findElement(By.xpath("//input[@id='j_idt106:slider']"));
		elementInputRandom.sendKeys("50");

		
		WebElement elementSliderAfter=driver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']/span"));
		Point position2=elementSliderAfter.getLocation();
		if(position1.equals(position2))
				{
			System.out.println("The Slider not Changed");
				}
		else
			System.out.println("The Slider moves correctly");
		
		Thread.sleep(2000);
		
		// Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();

		WebElement elementKeyboard = driver.findElement(By.xpath("/html/body/div[4]"));
		if (elementKeyboard.isDisplayed()) {
			System.out.println("The keyboard appears");
		} else
			System.out.println("The keyboard doesn't appears");
		Thread.sleep(2000);

		// Custom Toolbar
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt124_editor\"]/div[1]/p")).sendKeys("Hello!Welcome");
		Thread.sleep(2000);
		
		driver.close();
	}
}
