package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftapStepDef {
	ChromeDriver driver;
	String leadID1;

	@Given("Open Chrome browser")

	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@And("Load the URL,maximize and set the timeouts")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("Enter Username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("Enter password as {string}")
	public void enterPwd(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("Click LoginButton")

	public void loginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@And("Click CRMSFA")

	public void homePage() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@And("Click Leads")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@And("Click Create Leads")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@And("Enter company name as {string}")
	public void enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@And("Enter First Name as {string}")
	public void entFrtName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}

	@And("Enter Last Name as {string}")
	public void enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}

	@When("Create lead button is clicked")
	public void clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Lead should be created")
	public void viewLead() {
		System.out.println("Lead created");
	}

	@And("Click Find leads")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And("Click Phone")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@And("Enter Phone Number as {string}")
	public void enterPhoneNum(String num) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(num);

	}

	@And("Find leads button clicked")
	public void findLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@And("Click first resulting lead")
	public void leadList() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@And("Edit  button is clicked")
	public void editLead() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@And("Update the company name as {string}")
	public void updateCname(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
	}

	@When("Update button clicked")
	public void updateButton() {

		driver.findElement(By.name("submitButton")).click();
	}

	@Then("The company name should be updated")
	public void updatedLeadDetails() {
		System.out.println("Lead Updated");
	}

	@When("Delete  button is clicked")
	public void deleteButton() {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
	}

	@Then("Record gets deleted")
	public void deleteRecord() {

		System.out.println("No records to display");
	}

	@When("Duplicate  button is clicked")
	public void dupButtClick() {

		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

	@Then("Create a dulicate record")
	public void createDupRec() {
		driver.findElement(By.name("submitButton")).click();
	}

	@And("Click Merge leads")
	public void clickMerge() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}

	@When("From lead widget is clicked")
	public void fromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}

	@Then("Select Lead as {string}")
	public void switchNewWindow(String name) throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		leadID1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
	}

	@When("To Lead widget is clicked")
	public void toLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}

	@Then("Select lead as {string}")
	public void selectLead2(String name1) throws InterruptedException {

		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
	}

	@When("Merge button is clicked")
	public void clickMerge1() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}

	@Then("Check and Verify for the merged lead")
	public void verifyLead() throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		Thread.sleep(2000);
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}

	@And("Close the browser")
	public void closeBrowser() {
		driver.close();
	}
}
