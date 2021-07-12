import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://facebook.com");
	    
	    //driver.findElement(By.id("email")).sendKeys("rabbyshamim92@gmail.com");
	   // driver.findElement(By.name("email")).sendKeys("rabbyshamim92@gmail.com");
	    
	    String info =driver.findElement(By.tagName("img")).getAttribute("src");
	    //attribute method return element information
	    //tag name is basic locator to access the location of an element
	    System.out.println(info);
	    
	    //driver.findElement(By.id("pass")).sendKeys("rabby123");
	   // driver.findElement(By.name("login")).click(); 
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rabbyshamim92@gmail.com");
	    
	   // driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("rabby123");
       driver.findElement(By.cssSelector("#pass")).sendKeys("rabby123");
      // driver.findElement(By.cssSelector("#u_0_d_Ci")).click();
       
     //driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
       
       
 	}

}
