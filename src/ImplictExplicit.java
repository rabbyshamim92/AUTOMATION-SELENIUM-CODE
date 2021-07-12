import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplictExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/imtiazsumith/Downloads/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		/*
		 * Implicit Wait: When implicit wait is set, the browser will wait for specified amount of time for each findelement or 
		 * findelements call before throwing an exception/error.
		 * 
		 * Implicit wait is always applied globally to all WebElement.
		 * 
		 */
		
		driver.get("https://amazon.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 * 
		 * Implicit Wait example: 
		 * 
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
		 * 
		 * driver.findElement(By.id("nav-search-submit-button123")).click(); //Error
		 * code
		 */
		
		/*
		 * Explicit Wait: When wait is set, it will wait until the expected element is
		 * found, otherwise it will throw an exception. It's very specific to a certain
		 * webelement.
		 * 
		 * Waits for particular element or action to take place.
		 * 
		 */
		
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		
		SendKeys(driver, searchBar, 5, "macbook");
		
		Click(driver, searchButton, 5);
		 

	}
	
	public static void SendKeys(WebDriver w, WebElement e, int timeout, String s)
	{
		new WebDriverWait(w, timeout).until(ExpectedConditions.visibilityOf(e));
		e.sendKeys(s);
	}
	
	public static void Click(WebDriver w, WebElement e, int timeout)
	{
		new WebDriverWait(w, timeout).until(ExpectedConditions.visibilityOf(e));
		e.click();
	}
	



    }

