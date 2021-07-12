import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	     
	    driver.get("http://demo.automationtesting.in/FileUpload.html");
	    
	    WebElement upload =driver.findElement(By.id("input-4"));
	    
	    upload.sendKeys("C:\\Users\\rabby\\OneDrive\\Desktop\\Prosmart class\\book1 (1).xlsx");

	}

}
