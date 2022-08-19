package week2.day2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//Take me to dashboard		
		WebElement elementGoDashboard=driver.findElement(By.xpath("//form/div/div[1]/div[1]/div/div/a"));
		elementGoDashboard.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Find my destination		
		WebElement elementFindURL=driver.findElement(By.xpath("//form/div/div[1]/div[2]/div/div/a"));
		System.out.println("The URL of the Page:" +elementFindURL.getAttribute("href"));
		
		Thread.sleep(2000);
		
		//Broken link
		WebElement elementClickURL=driver.findElement(By.xpath("//form/div/div[1]/div[3]/div/div/a"));
		String url=elementClickURL.getAttribute("href");
		Thread.sleep(3000);
		
		URL link=new URL(url);
		HttpURLConnection httpConnection=(HttpURLConnection) link.openConnection();
		Thread.sleep(2000);
		httpConnection.connect();
		int responseCode= httpConnection.getResponseCode();
		if(responseCode>400)
		{
			System.out.println(url +" - "+ "This is a Broken Link");
		}
		else
		{
			System.out.println(url +" - "+ "This is a valid Link");
		}
		
		Thread.sleep(2000);
		
		//Duplicate Link
		WebElement elementGoDashboard1=driver.findElement(By.xpath("//form/div/div[1]/div[1]/div/div/a"));
		WebElement elementDuplicateLink=driver.findElement(By.xpath("//form/div/div[2]/div[1]/div/div/a"));
		String LinkOriginal=elementGoDashboard1.getAttribute("href");
		String LinkDuplicate=elementDuplicateLink.getAttribute("href");
	
		if(LinkOriginal.equals(LinkDuplicate))
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
	    WebElement elementCountLayoutLinks=driver.findElement(By.xpath("//form/div/div[2]/div[3]/div/div/a"));
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
