package com.leaftaps.projectspecfic;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.readexcelfile.ReadExcelFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonLeafTap {
	public RemoteWebDriver driver;
	public String excelFileName;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName,testDescription,testCategory,testAuthor;

	@BeforeSuite
	public void startReport() {

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@BeforeClass
	public void testCaseDetails() {
		test = extent.createTest(testName,testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor("testAuthor");
	}
	
	@AfterSuite
	public void stopReport()
	{
		extent.flush();
	}
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

		String[][] data = ReadExcelFile.getData(excelFileName);
		return data;

	}
}