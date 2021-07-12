import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printTable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.timeanddate.com/worldclock/");
	    driver.manage().window().fullscreen();
	    
	   
		   
	    List<WebElement>elements = driver.findElements(By.tagName("tr"));
	    
	          for(WebElement elem:elements)
	    {
	    	System.out.println(elem.getText());
	    }
	    
	    
	    
	    

	}

}
