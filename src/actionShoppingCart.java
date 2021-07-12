import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class actionShoppingCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://amazon.com");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone charger");
	    driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']")).click();
	    driver.findElement(By.name("submit.add-to-cart")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
	    
	    System.out.println(driver.getCurrentUrl());
	    
	}
}
