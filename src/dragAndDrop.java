import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame(0);
	    // frame(0) means only one frame in the 'website'
	    
	    WebElement drag = driver.findElement(By.id("draggable"));
	    WebElement drop = driver.findElement(By.id("droppable"));
	    
	    Actions dragging = new Actions(driver);
	    
	    dragging.clickAndHold(drag).moveToElement(drop).release().build().perform();
	    //2nd way
	    dragging.dragAndDrop(drag, drop).build().perform();
	    
	}

}
