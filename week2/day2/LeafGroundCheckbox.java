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

		
		//Basic Checkbox
		
		 WebElement elementBasicCheckBox=driver.findElement(By.id("j_idt87:j_idt89_input"));
		 System.out.println("Is Basic checkbox selected:" +elementBasicCheckBox.isSelected());
		 
		 Thread.sleep(2000);
	      
		 //Notification 
		 for(int i=0;i<2;i++)
		 {
		 WebElement elementNotification=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[2]"));
		 elementNotification.click();
		 Thread.sleep(2000);
		 WebElement elementNotificationMessage=driver.findElement(By.xpath("//div[@id='j_idt87:msg_container']/div/div/div[2]/span"));
		 System.out.println("The Notification Checkbox is:" +elementNotificationMessage.getText());
		 }
		   
		  	 
		 //Choose your favorite language(s)
		 WebElement elementFavLanguage=driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody/tr/td[1]/div"));
		 elementFavLanguage.click();
		 WebElement elementFavLanguage1=driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody/tr/td[2]/div"));
		 elementFavLanguage1.click();
		 Thread.sleep(2000);
		 
		 //Tri State Checkbox
		 for(int i=0;i<3;i++)
		 {
		 WebElement elementTriState=driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]"));
		 elementTriState.click();
		 Thread.sleep(2000);
		 WebElement elementTriState1=driver.findElement(By.xpath("//div[@id='j_idt87:id_container']/div/div/div[2]/span"));
		 WebElement elementTriState1Text=driver.findElement(By.xpath("//div[@id='j_idt87:id_container']/div/div/div[2]/p"));
		 System.out.println(elementTriState1.getText() + ":"+ elementTriState1Text.getText());
		 }
		 Thread.sleep(2000);
		 
		 //Toggle Switch
		 for(int i=0;i<2;i++){
		 WebElement elementToggleSwitchCheck=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']/div[2]"));
		 elementToggleSwitchCheck.click();
		 Thread.sleep(2000);
		 WebElement elementToggleMessage1=driver.findElement(By.xpath("//div[@id='j_idt87:msg_container']/div/div/div[2]/span"));
		 System.out.println("The Toggle Switch is:" +elementToggleMessage1.getText());
		 }
		 Thread.sleep(2000);
			
		 //Verify if check box is disabled
		 WebElement elementVerifyCheckBox=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		 boolean elementCheckBoxDisabled=elementVerifyCheckBox.isSelected();
		 System.out.println("Is CheckBox Selected :" +elementCheckBoxDisabled);
		 
		//Select Multiple Checkboxes
		 WebElement elementClickCheckBox=driver.findElement(By.xpath("//div[@id='j_idt87:multiple']/div[3]/span"));
		 elementClickCheckBox.click();
		 WebElement elementClickSelect=driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul"));
		 elementClickSelect.click();
		 
		 Thread.sleep(2000);
		 WebElement elementClickCheckbox1=driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[1]/div[1]/div[2]"));
		 elementClickCheckbox1.click();
		 WebElement elementClickClose=driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[1]/a"));
		 elementClickClose.click();
		 Thread.sleep(2000);
		 
		 driver.close();
			
		 }
	}
	
	
	


