package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		//Basic Checkbox
		
		 WebElement elementBasicCheckBox=driver.findElement(By.xpath("//input[@aria-label='Basic']"));		
		 System.out.println("Is Basic checkbox selected:" +elementBasicCheckBox.isSelected());
		  	 Thread.sleep(2000);

	      
		 //Notification 
		 for(int i=0;i<2;i++)
		 {
		 WebElement elementNotification=driver.findElement(By.xpath("//div[1]/div[2]/div/div/div/div[2]"));
		 elementNotification.click();
		 Thread.sleep(2000);
		 WebElement elementNotificationMessage=driver.findElement(By.xpath("//div[5]/div/div/div[2]/span"));
		 System.out.println("The Notification Checkbox is:" +elementNotificationMessage.getText());
		 }
		   
		 Thread.sleep(2000);	 
		 //Choose your favorite language(s)
		 WebElement elementFavLanguage=driver.findElement(By.xpath("//table[contains(@class,'selectmanycheckbox')]/tbody//td[1]/div[1]/div[2]"));
		 elementFavLanguage.click();
		 WebElement elementFavLanguage1=driver.findElement(By.xpath("//table[contains(@class,'selectmanycheckbox')]/tbody//td[2]/div[1]/div[2]"));
		 elementFavLanguage1.click();
		 Thread.sleep(2000);
		 
		 //Tri State Checkbox
		 for(int i=0;i<3;i++)
		 {
		 WebElement elementTriState=driver.findElement(By.xpath("//form/div/div[1]/div[4]/div//div[2]"));
		 elementTriState.click();
		 Thread.sleep(2000);
		 WebElement elementTriState1=driver.findElement(By.xpath("//div[6]/div/div/div[2]/span"));
		 WebElement elementTriState1Text=driver.findElement(By.xpath("//div/div/div[2]/p"));
		 System.out.println(elementTriState1.getText() + ":"+ elementTriState1Text.getText());
		 }
		 Thread.sleep(3000);
		 
		 //Toggle Switch
		 for(int i=0;i<2;i++){
		 WebElement elementToggleSwitchCheck=driver.findElement(By.xpath("//form/div/div[2]/div[1]/div/div[2]"));
		 elementToggleSwitchCheck.click();
		 Thread.sleep(2000);
		 WebElement elementToggleMessage1=driver.findElement(By.xpath("//div[5]/div/div/div[2]/span"));
		 System.out.println("The Toggle Switch is:" +elementToggleMessage1.getText());
		 }
		 Thread.sleep(2000);
			
		 //Verify if check box is disabled
		 WebElement elementVerifyCheckBox=driver.findElement(By.xpath("//form/div/div[2]/div[2]/div/div/div"));
		 boolean elementCheckBoxDisabled=elementVerifyCheckBox.isSelected();
		 System.out.println("Is CheckBox Selected :" +elementCheckBoxDisabled);
		 
		//Select Multiple Checkboxes
		 WebElement elementClickCheckBox=driver.findElement(By.xpath("//form/div/div[2]/div[3]/div/div[3]"));
		 elementClickCheckBox.click();
		 Thread.sleep(2000);
		 WebElement elementClickCheckbox1=driver.findElement(By.xpath("//div[7]/div[1]/div[1]/div[2]"));
		 elementClickCheckbox1.click();
		 Thread.sleep(2000);
		 WebElement elementClickClose=driver.findElement(By.xpath("//div[7]/div[1]/a"));
		 elementClickClose.click();
		 Thread.sleep(2000);
		
		 driver.close();
			
		 }
	}
	
	
	


