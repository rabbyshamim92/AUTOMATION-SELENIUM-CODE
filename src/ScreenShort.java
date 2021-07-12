import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShort {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://amazon.com");
	       driver.manage().window().maximize();
	       
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       
	      // FileHandler.copy(src, new File("C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\New folder\\screenshot.png"));
	       
	       //copy the folder location
	       
	       FileHandler.copy(src, new File("C:\\Users\\rabby\\eclipse-workspace-seleniu\\AutomationSelinium\\screenshot.png"));
	    // Rightclick on project-properties-copy location(not path)-name(screenshot.png)
	
	
	
	
	
	}
	

}
