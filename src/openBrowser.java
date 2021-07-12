import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    
    driver.get("https://facebook.com");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    Thread.sleep(3000);
    
    String info=driver.findElement(By.tagName("img")).getAttribute("src");
    System.out.println(info);
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("#email")).sendKeys("rabby@gamail.com");
    driver.findElement(By.cssSelector("#pass")). sendKeys("rabby121e3");
    
   
    driver.close();
    

	}

}
