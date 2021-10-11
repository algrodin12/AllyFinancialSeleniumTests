package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AllyFinancialPage {

    WebDriver driver;

    public AllyFinancialPage(WebDriver driver)
    {
        this.driver = driver;
    }
    
    public void waitForPageToLoad(String pageId)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(pageId)));
    }
    
    //Scroll to element on page by css
    public void scrollToElementByCss(String cssName)
    {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.cssSelector(cssName)));
    }

    //Navigate to Career Page
    public void navigateToCareerPage()
    {
    	WebElement navBar = driver.findElement(By.cssSelector("#navbar > nav.secondary-nav > div > ul"));
    	List<WebElement> links = navBar.findElements(By.tagName("li"));
    	for (WebElement link : links) 
    	{
    		if (link.findElement(By.tagName("a")).getText().equals("Careers"))
			{
    			link.findElement(By.tagName("a")).click();
    			break;
			}
    	}
    }
 
    //Verify Job Opening Results
    public void verifyAndClickOnJobOpening(String jobName)
    {
    	WebElement jobOpenings = driver.findElement(By.cssSelector("div.phs-jobs-list > div.content-block > ul"));
    	List<WebElement> jobs = jobOpenings.findElements(By.tagName("li"));
    	
    	for (WebElement job : jobs) 
    	{
    		if (job.findElement(By.cssSelector("div.information > span > a > div.job-title > span")).getText().equals(jobName)) 
    			{
    				job.findElement(By.cssSelector("div.information > span > a > div.job-title > span")).click();
    				break;
    			}
    	}
    }

}