package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		// Which is your favorite UI Automation tool?

		WebElement elementUIAutomationTool = driver.findElement(By.xpath("//form//select[@class='ui-selectonemenu']"));
		Select AutomationToolDD = new Select(elementUIAutomationTool);
		AutomationToolDD.selectByVisibleText("Selenium");

		// Choose your preferred country.
		Thread.sleep(2000);
		  WebElement elementCountrySelect=driver.findElement(By.xpath("(//div[contains(@class,'selectonemenu-trigger')])[1]"));
		  elementCountrySelect.click();		
		  Thread.sleep(2000);
		 WebElement elementInput=driver.findElement(By.xpath("//body/div[5]/div/ul/li[4]"));
		 elementInput.click();
		 
		 Thread.sleep(2000);
		// Confirm Cities belongs to Country is loaded  
				  
		  WebElement elementCity=driver.findElement(By.xpath("(//label[contains(@class,'selectonemenu-label')])[1]"));
		  String CountryCheck=elementCity.getText();
			System.out.println(CountryCheck);
			 Thread.sleep(2000);
			 
		  if(CountryCheck.equals("India"))
		  {
			  WebElement elementCities = driver.findElement(By.xpath("//div[1]/div[3]//div[2]/select"));
			  Select CitiesDD = new Select(elementCities);
			  List<WebElement> e = CitiesDD.getOptions();
			  Thread.sleep(3000);
			  int itemCount = e.size();
			 System.out.println("The Cities belongs to India");
				for (int l = 1; l < itemCount; l++) {
					WebElement j=e.get(l);
					String City = j.getAttribute("value");					
					System.out.println(City);
				}
			
		  }
			
		  //Choose the Course			
		  WebElement elementCourse = driver.findElement(By.xpath("//button[contains(@class,'autocomplete-dropdown')]/span[1]"));
		  elementCourse.click();
		  Thread.sleep(2000);
		  WebElement elementCourseSelect = driver.findElement(By.xpath("//span/ul/li[3]"));
		  elementCourseSelect.click();
		  
		  Thread.sleep(2000);
		  
		 //Choose language
		 WebElement elementLanguage = driver.findElement(By.xpath("(//div[contains(@class,'selectonemenu-trigger')])[3]/span"));
		 elementLanguage.click();
		 Thread.sleep(2000);
		WebElement elementLanguageSelect = driver.findElement(By.xpath("//div[6]/div/ul/li[2]"));
		 elementLanguageSelect.click();
		 
		 Thread.sleep(2000);
		 
		 
		 //Select 'Two' irrespective of the language chosen		 
		 WebElement elementTwoSelect = driver.findElement(By.xpath("(//div[contains(@class,'selectonemenu-trigger')])[4]/span"));
		 elementTwoSelect.click();
		 
		 WebElement elementTwo=driver.findElement(By.xpath("//div[8]/div/ul/li[4]"));
		 elementTwo.click();
		 
		 Thread.sleep(2000);
		
		 driver.close();
	}

}
