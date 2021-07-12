import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class homeWorkhoverOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.mortgagecalculator.org/");
	    driver.manage().window().maximize();
	    Actions action = new Actions(driver); 
	    
	    WebElement affordibility = driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[5]/a"));
	    action.moveToElement(affordibility).release().build().perform();
	    Thread.sleep(3000);
	  
	    WebElement rent = driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[5]/ul/li[1]/a"));
	    action.moveToElement(rent).release().build().perform();
	    action.click().build().perform();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.name("PeriodRent")).sendKeys("1500.00");
	    driver.findElement(By.name("AnnualRentIncrease")).sendKeys("2.500");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("HomeValue")).sendKeys("320000.00");
	    driver.findElement(By.name("AnnualAppreciation")).sendKeys("4.000.00");
	    driver.findElement(By.name("YearsBeforeSell")).sendKeys("8");
	    driver.findElement(By.name("SellingCost")).sendKeys("8000.00");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("Amount")).sendKeys("300000.00");
	    driver.findElement(By.name("Interest")).sendKeys("4.00");
	    driver.findElement(By.name("Length")).sendKeys("25");
	    driver.findElement(By.name("Points")).sendKeys("2.00");
	    driver.findElement(By.name("PMI")).sendKeys("1.00");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("PropertyTaxes")).sendKeys("4000.00");
	    driver.findElement(By.name("Insurance")).sendKeys("2000.00");
	    driver.findElement(By.name("AnnualMaintanance")).sendKeys("2500.00");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("Taxes")).sendKeys("30.00");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"CalcForm\"]/table[6]/tbody/tr[3]/td/input")).click();
	    
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
