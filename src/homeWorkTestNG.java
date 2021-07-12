import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homeWorkTestNG {
ChromeDriver driver;
	
	@BeforeTest
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.mortgagecalculator.org/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	}
	
	@Test(enabled = true, priority =0, description ="User populating Home Value ",testName="Functional Test")
  public void SetHomeValue() {
		
		  driver.findElement(By.id("homeval")).sendKeys("400000");
		  System.out.println("user populate home Value");
  }
	@Test(enabled = true, priority =1, description ="User populating down payment",testName="Functional Test")
	  public void SetDownPayment() {
			
			  driver.findElement(By.id("downpayment")).sendKeys("70000");
			  System.out.println("user populate down payment");
	  }	
	@Test(enabled = true, priority =2, description ="User checked $ Amount",testName="Functional Test")
	  public void SetLoanAmount() {
			
			  driver.findElement(By.name("param[downpayment_type]")).click();
			  System.out.println("User checked $ Amount");
	  }	
	@Test(enabled = true, priority =3, description ="User populating interest Rate",testName="Functional Test")
	  public void SetInterestRate() {
			
			  driver.findElement(By.id("intrstsrate")).sendKeys("4");
			  System.out.println("user populate Interest Rate");
	  }	
	@Test(enabled = true, priority =4, description ="User populating loan Term",testName="Functional Test")
	  public void SetLoanTerm() {
			
			  driver.findElement(By.id("loanterm")).sendKeys("25");
			  System.out.println("user populate Loan Term");
	  }	
	@Test(enabled = true, priority =5, description ="User selecting Start Date",testName="Functional Test")
	  public void SetStartDate() {
			
		 Select dropdown = new Select(driver.findElement(By.name("param[start_month]")));
		  dropdown.selectByVisibleText("Jul");
			  System.out.println("User select Start Date");
	  }	
	@Test(enabled = true, priority =6, description ="User populating property tax",testName="Functional Test")
	  public void SetPropertyTax() {
			
			  driver.findElement(By.id("pptytax")).sendKeys("3000");
			  System.out.println("user populate Property Tax");
	  }	 
	@Test(enabled = true, priority =7, description ="User populating PMI",testName="Functional Test")
	  public void SetPMI() {
			
			  driver.findElement(By.id("pmi")).sendKeys("1.00");
			  System.out.println("user populate PMI");
	  }	 
	@Test(enabled = true, priority =8, description ="User populating Home Insurance",testName="Functional Test")
	  public void SetHomeIns() {
			
			  driver.findElement(By.id("hoi")).sendKeys("1500");
			  System.out.println("user populate Home Insurance");
	  }	 
	@Test(enabled = true, priority =9, description ="User populating Monthly HOA",testName="Functional Test")
	  public void SetMonthlyHOA() {
			
			  driver.findElement(By.id("hoa")).sendKeys("100");
			  System.out.println("user populate Monthly HOA");
	  }	 
	@Test(enabled = true, priority =10, description ="User Selecting Loan Type",testName="Functional Test")
	  public void SetLoanType() {
			
		 Select dropdown = new Select(driver.findElement(By.name("param[milserve]")));
		  dropdown.selectByVisibleText("FHA");
			  System.out.println(" User Select loan Type ");
	  }	
	@Test(enabled = true, priority =11, description ="User Selecting Buy or Refi",testName="Functional Test")
	  public void SetBuyOrRefi() {
			
		 Select dropdown = new Select(driver.findElement(By.name("param[refiorbuy]")));
		  dropdown.selectByVisibleText("Buy");
			  System.out.println(" User Select Buy or Refi ");
	  }		
	 @Test(enabled = true, priority =12, description ="Clicking the Calulate Button",testName="Functional Test")
	  public void ClickCalculate() {
		  driver.findElement(By.name("cal")).click();
		  System.out.println("User clicked Caculate");  
		  
	  }
	 
	
	  @AfterTest
	  public void CloseBrowser() {
		  driver.close();
	  }
	   
	 
	 
	
}
