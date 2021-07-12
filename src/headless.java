import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
		
     ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);
	       driver.get("https://amazon.com");
      System.out.println(driver.getTitle());
      
      
     String actualTitle = driver.getTitle();
     String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
     		
      if(expectedTitle.endsWith(actualTitle))
       {
     	  System.out.println("test case PASS");
       }
       else 
       {
     	  
     	  System.out.println("test case FAILED");
     	  
       }
     	 
	}

}

