import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowserScript {
WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("https://facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(enabled = true, priority=0, description="Clicking the Create Account button", testName="Functional Test")
	  public void ClickCreateAccount() {
		  
		  driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		  System.out.println("User clicked Create Account");
		  
	  }
	  
	  @Test(enabled = true, priority=1, description="User populating the First Name field", testName="Functional Test")
	  public void SetFirstName() {
		  
		  driver.findElement(By.name("firstname")).sendKeys("Selenium");
		  System.out.println("User populated First Name");
		  
	  }
	  
	  @Test(enabled = true, priority=2, description="User populating the Last Name field", testName="Functional Test")
	  public void SetLastName() {
		  
		  driver.findElement(By.name("lastname")).sendKeys("101");
		  System.out.println("User populated Last Name");
		  
	  }
	  
	  @Test(enabled = true, priority=3, description="User populating the Email field", testName="Functional Test")
	  public void setEmail() {
		  
		  driver.findElement(By.name("reg_email__")).sendKeys("rabby@gmail.com");
		  System.out.println("User populated the Email field");
		  
	  }
	  
	  @Test(enabled = true, priority=4, description="User populating the Registration Email field", testName="Functional Test")
	  public void setConfirmedEmail() {
		  
		  driver.findElement(By.name("reg_email_confirmation__")).sendKeys("szumith@yahoo.com");
		  System.out.println("User populated the Confirm Email field");
		  
	  }
	  
	  @Test(enabled = true, priority=5, description="User populating the password field", testName="Functional Test") 
	  public void setPassword() {
		  
		  driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium123!");
		  System.out.println("User populated the password field");
		  
	  }
	  
	  @Test(enabled = true, priority=6, description="User selecting the Birthday month", testName="Functional Test")
	  public void SetDOBMonth() {
		  
		  Select dropdown = new Select(driver.findElement(By.name("birthday_month")));
		  dropdown.selectByVisibleText("Jul");
		  System.out.println("User selected Birthday month");
		  
	  }
	  
	  @Test(enabled = true, priority=7, description="User selecting the Birthday Date", testName="Functional Test")
	  public void SetDOBDate() {
		  
		  Select dropdown = new Select(driver.findElement(By.name("birthday_day")));
		  dropdown.selectByVisibleText("10");
		  System.out.println("User selected Birthday Date");
		  
	  }
	  
	  @Test(enabled = true, priority=8, description="User selecting the Birthday Year", testName="Functional Test")
	  public void SetDOBYear() {
		  
		  Select dropdown = new Select(driver.findElement(By.name("birthday_year")));
		  dropdown.selectByVisibleText("1990");
		  System.out.println("User selected Birthday Year");
		  
	  }
	  
	  @Test(enabled = true, priority=9, description="User selecting the gender", testName="Functional Test")
	  public void setGender() {
		  
		  driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click(); //This is how we write custom x path for text with no attributes.
		  System.out.println("User selected gender Male");
		  
	  }
	  
	  @Test(enabled = true, priority=10, description="User clicked the Sign Up button", testName="functional Test")
	  public void ClickSignUp() {
		  
		  driver.findElement(By.name("websubmit")).click();
		  System.out.println("User clicked Sign Up");
		  
	  }
	  
	  @Test(enabled = true, priority=11, description="User verifying error text", testName="Functional Test")
	  public void VerifyInvalidSignUp() throws InterruptedException {
		  
		  Thread.sleep(5000);
		  
		  String actualError = driver.findElement(By.xpath("//*[@id=\"reg_error_inner\"]/a")).getText();
		  
		  System.out.println(actualError);
		  
		  String expectedError = "Learn more";
		  
		  assertEquals(actualError, expectedError);
		  
		  
	  }
	  
	  @AfterTest
	  public void CloseBrowser()
	  {
		  driver.close();
	  }
}

	
	
 
 


