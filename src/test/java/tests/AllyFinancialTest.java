package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;		

import pages.AllyFinancialPage;

public class AllyFinancialTest {		
	    WebDriver driver;
	    AllyFinancialPage objAllyFinancial;
	    
		@BeforeMethod
		public void beforeTest() 
		{	
	        driver = new ChromeDriver();
		}		
		
		/**
	     * Ally Financial Interview
	     */
		@Test				
		public void AllyTest()
		{	
			//Create Ally Financial Page object
			objAllyFinancial = new AllyFinancialPage(driver);
   
		}	
		
		@AfterMethod
		public void afterTest() 
		{
			driver.quit();			
		}		
}