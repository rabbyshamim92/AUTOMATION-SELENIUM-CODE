import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://facebook.com");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    Thread.sleep(3000);
	    
	    Select monthDropdown = new Select (driver.findElement(By.id("month")));
        monthDropdown.selectByIndex(7);//select July
        Thread.sleep(3000);
       
       Select dayDropdown = new Select (driver.findElement(By.id("day")));
       dayDropdown.selectByVisibleText("10");
       Thread.sleep(3000);
       
       Select yearDropdown = new Select(driver.findElement(By.id("year")));
       yearDropdown.selectByVisibleText("2000");
       
	}

}
