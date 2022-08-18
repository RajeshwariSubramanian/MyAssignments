package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//Take me to dashboard		
		WebElement elementGoDashboard=driver.findElement(By.xpath("//form[@id='j_idt87']/div/div[1]/div[1]/div/div/a"));
		elementGoDashboard.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Find my destination		
		WebElement elementFindURL=driver.findElement(By.xpath("//form[@id='j_idt87']/div/div[1]/div[2]/div/div/a"));
		System.out.println("The URL of the Page:" +elementFindURL.getAttribute("href"));
		
		Thread.sleep(2000);
		
		//Broken link
		WebElement elementClickURL=driver.findElement(By.xpath("//form[@id='j_idt87']/div/div[1]/div[3]/div/div/a"));
		elementClickURL.click();
		Thread.sleep(3000);
		
		WebElement elementGetStatusCode=driver.findElement(By.xpath("//table/tbody/tr[2]/td"));
		String StatusText=elementGetStatusCode.getText();
		
		WebElement elementGetMessage=driver.findElement(By.xpath("//table/tbody/tr[3]/td"));
		
		
		if(StatusText.equals("404"))
		{
			System.out.println("This is a Broken Link:" +StatusText +elementGetMessage.getText());
		}
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Duplicate Link
		WebElement elementGoDashboard1=driver.findElement(By.xpath("//form[@id='j_idt87']/div/div[1]/div[1]/div/div/a"));
		WebElement elementDuplicateLink=driver.findElement(By.xpath("//form[@id='j_idt87']/div/div[2]/div[1]/div/div/a"));
		String LinkDuplicateCheck1=elementGoDashboard1.getAttribute("href");
		String LinkDuplicateCheck2=elementDuplicateLink.getAttribute("href");
	
		if(LinkDuplicateCheck2.equals(LinkDuplicateCheck1))
				{
			System.out.println("The Link is Duplicate");
				}
	    Thread.sleep(2000);
	
	    //Count Links  	     
	    List< WebElement> elementCount=driver.findElements(By.tagName("a"));
	    int count=elementCount.size();
	    System.out.println("The Number of Links in this Page:" +count);	 
	    Thread.sleep(2000);
	    
	    //Count Layout Links
	    WebElement elementCountLayoutLinks=driver.findElement(By.xpath("//form[@id='j_idt87']/div/div[2]/div[3]/div/div/a"));
	    elementCountLayoutLinks.click();	    
	    Thread.sleep(3000);
	    List< WebElement> elementCountLayout=driver.findElements(By.tagName("a"));
	    int count1=elementCountLayout.size();
	    System.out.println("The Number of Links in this layout:https://www.leafground.com/list.xhtml :" +count1);	  
	    
	    driver.navigate().back();
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	  
	}
	
	

}
