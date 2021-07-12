import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	      
	       
	    		   
	     WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	       //username:password
	       

			String actualCongrats = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
			String expectedCongrats = "Congratulations! You must have the proper credentials.";
			
			if(expectedCongrats.equals(actualCongrats))
			{
				System.out.println("SUCCESS");
			}
			else
				System.out.println("FAILED");



	       
	}

}
