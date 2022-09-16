package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonServiceNow {

	public RemoteWebDriver driver;
	public String excelFileName;

	@Parameters({ "url", "browser" })
	@BeforeMethod
	public void beforeMethod(String url, String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
 @AfterMethod 
 public void afterMethod() {
	 driver.close();
	 }
	 

	@DataProvider
	public String[][] sendData() throws IOException {

		String[][] data = ReadData.getExcelData(excelFileName);
		return data;

	}
}