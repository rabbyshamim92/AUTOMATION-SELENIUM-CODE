import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       
	       
	      driver.get("https://amazon.com");
         System.out.println(driver.getTitle());
         
         
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        //this is Url title.whwn you copy and paste amazon.com in new window you will see the line.		
        
        
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
