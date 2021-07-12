import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class downLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	     
	    driver.get("http://demo.automationtesting.in/FileDownload.html");
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("textbox")).sendKeys("this selenium 101");
	    driver.findElement(By.id("createTxt")).click();
        driver.findElement(By.id("link-to-download")).click();
	    
	}

}
