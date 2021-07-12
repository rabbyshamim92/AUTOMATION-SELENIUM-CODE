import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class srollPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.target.com");
	    Thread.sleep(3000);
	    
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    //way1
	    
	    //js.executeScript("Window.scrollBy(0,1000)","");// scroll the screen by 1000 pixel
	    //Thread.sleep(3000);
	    
         js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//*[@id=\"mainContainer\"]/div[13]/div/div/ul/li[10]/a/div[2]")));
         //Thread.sleep(3000);
         
	   // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
         // scroll top to bottom
	 }

}
