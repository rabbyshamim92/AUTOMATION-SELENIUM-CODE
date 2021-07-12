import org.openqa.selenium.chrome.ChromeDriver;

public class nevigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://facebook.com");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.manage().window().fullscreen();
	    
	    Thread.sleep(3000);
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        
        driver.get("https://chase.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();//close the window that is focused
      // driver.quit();//close all the browse in window
        
	}  

}
