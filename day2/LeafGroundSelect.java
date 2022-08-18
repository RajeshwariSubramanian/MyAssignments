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
		
		  WebElement elementCountrySelect=driver.findElement(By.xpath("//div[@id='j_idt87:country']/div[3]/span"));
		  elementCountrySelect.click();		 
		 WebElement elementInput=driver.findElement(By.xpath("//li[@id='j_idt87:country_3']"));
		 elementInput.click();
		 
		// Confirm Cities belongs to Country is loaded  
		  WebElement elementInputTextBox=driver.findElement(By.xpath("//input[@id='j_idt87:country_focus']"));
		  String CountryInput= elementInputTextBox.getAttribute("aria-activedescendant");
		  
		  WebElement elementCity=driver.findElement(By.xpath("//li[@id='j_idt87:country_3']"));
		  String CountryCheck=elementCity.getAttribute("id");
			
		  if(CountryInput.equals(CountryCheck))
		  {
			  WebElement elementCities = driver.findElement(By.xpath("//select[@id='j_idt87:city_input']"));
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
		  WebElement elementCourse = driver.findElement(By.xpath("//div[@id='j_idt87:auto-complete']/button"));
		  elementCourse.click();
		
		  WebElement elementCourseSelect = driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']/ul/li[3]"));
		  elementCourseSelect.click();
		  
		  Thread.sleep(2000);
		  
		 //Choose language
		 WebElement elementLanguage = driver.findElement(By.xpath("//div[@id='j_idt87:lang']/div[3]/span"));
		 elementLanguage.click();
		 
		 WebElement elementLanguageSelect = driver.findElement(By.xpath("//li[@id='j_idt87:lang_1']"));
		 elementLanguageSelect.click();
		 
		 Thread.sleep(2000);
		 
		 
		 //Select 'Two' irrespective of the language chosen		 
		 WebElement elementTwoSelect = driver.findElement(By.xpath("//div[@id='j_idt87:value']/div[3]/span"));
		 elementTwoSelect.click();
		 
		 WebElement elementTwo=driver.findElement(By.xpath("//li[@id='j_idt87:value_3']"));
		 elementTwo.click();
		 
		 Thread.sleep(2000);
		
		 driver.close();
	}

}
