import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class sliderBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
	       driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider1\"]/div/input"));
		    
		    Actions slide = new Actions(driver);
		    
		    slide.clickAndHold(slider).moveByOffset(428, 388).release().perform();
		    slide.dragAndDropBy(slider, 50, 0).release().build().perform();
		    
		    
	}

}
