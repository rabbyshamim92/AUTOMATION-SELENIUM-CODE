import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.mortgagecalculator.org/");
	       driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		   Actions action = new Actions(driver);
		  WebElement saveMoney = driver.findElement(By.xpath("/html/body/section/section/div/div/nav/ul/li[6]/a"));
		  
		  action.moveToElement(saveMoney).release().build().perform();
		  

	}

}
