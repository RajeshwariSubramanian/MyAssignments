package week5.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonLeafTap {
	 public ChromeDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

}
