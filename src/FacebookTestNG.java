import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTestNG {
	ChromeDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://facebook.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	
  @Test(enabled = true, priority =0, description ="Clicking the Create account",testName="Functional Test")
  public void ClickCreatAccout() {
	  driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	  System.out.println("User clicked Create Account");  
	  
  }
  
  @Test(enabled = true, priority =1, description ="user populating the first Name field",testName="Functional Test")
  public void SetFirstName() {
	  driver.findElement(By.name("firstname")).sendKeys("selenium");
	  System.out.println("user populate first name ");
  }
  
  @Test(enabled = true, priority =2, description ="user populating the last Name field",testName="Functional Test")
  public void SetLastName() {
	  driver.findElement(By.name("lastname")).sendKeys("101");
	  System.out.println("user populate last name");
  }
  @Test(enabled = true, priority =3, description ="user populating the  email field",testName="Functional Test")
  public void setEmail() {
	  
	  driver.findElement(By.name("reg_email__")).sendKeys("rabbyshamim92@gmail.com");
	  System.out.println("user populate email feild");
	  
  }
  @Test(enabled = true, priority =4, description ="user populating the confirm email field",testName="Functional Test")
  public void setConfirmEmail() {
	  driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rabbyshamim92@gmail.com");
	  System.out.println("user populate the confirm email feild");
  }
  
  @Test(enabled = true, priority =5, description ="user populating the password field",testName="Functional Test")
  public void setPassword() {
	  driver.findElement(By.name("reg_passwd__")).sendKeys("rabby123");
	  System.out.println("user populate the  password feild");
  }
  
  @Test(enabled = true, priority =6, description ="user selecting birthday month",testName="Functional Test")
  public void SetDOBMonth() {
	  Select dropdown = new Select(driver.findElement(By.name("birthday_month")));
	  dropdown.selectByVisibleText("Jul");
	  System.out.println("user selected birthday month");
  }
  @Test(enabled = true, priority =7, description ="user selecting birthday date",testName="Functional Test")
  public void SetDOBDate() {
	  Select dropdown = new Select(driver.findElement(By.name("birthday_day")));
	  dropdown.selectByVisibleText("10");
	  System.out.println("user selected birthday date");
  }
  @Test(enabled = true, priority =8, description ="user selecting birthday year",testName="Functional Test")
  public void SetDOBYear() {
	  Select dropdown = new Select(driver.findElement(By.name("birthday_year")));
	  dropdown.selectByVisibleText("1990");
	  System.out.println("user selected birthday Year");
  }
  
  @Test(enabled = true, priority =9, description ="user selecting Gender Male",testName="Functional Test")
  public void setGender(){
	driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();//when there is no attribute=value ,this is the way we do customized Xpath
	System.out.println("user select Gender Male");
	  
  }
  @Test(enabled = true, priority =10, description ="user click SignUp",testName="Functional Test")
  public void ClickSignUp(){
	  driver.findElement(By.name("websubmit")).click();
			  System.out.println("user clicked SignUp");
	  		
  }
  
  @Test(enabled = true, priority =11, description ="user verifying errror text ",testName="Functional Test")
  public  void VerifyInvalidSignUp() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  String actualError = driver.findElement(By.xpath("//*[@id=\"reg_error_inner\"]/a")).getText();
	  System.out.println(actualError);
		
	  String expectedError = "Learn more";
	  assertEquals(actualError,expectedError);
	   
	  
  
  }
  @AfterTest
  public void CloseBrowser() {
	  driver.close();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
