
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dateSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://expedia.com");
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("d1-btn")).click();
	    
	    String month = "August 2021";
	    String date ="2021-08-08";
	    while(true)
	    {
	     String text = driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/h2")).getText();
	     // this xpath is first box above day and date [where you can see   august 2021         september 2021 ]         
	     if (text.contains(month))
	     {
	    	 break;
	     }
	    else
	    {
	     driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]")).click();
	     //this is >(erro) buutton
	    }
	     List<WebElement>allcelldate=driver.findElements(By.xpath("//button[@class='uitk-date-picker-day uitk-new-date-picker-day']"));//day(20) button
	     for(WebElement elem:allcelldate)
	     {
	    	 String date_value=(elem.getAttribute("data-day")).toString();// you will find it tagName button Type
	    	 System.out.println(date_value);
	    	 String day[] = date_value.split("\n");
	    	 if(day[0].equals(date))
	    	 {
	    		 elem.click();
	    		 elem.click();
	    		 break;
	    	 }
	    	 
	     }
	    
	    
	    
	    
	    
	}
	}
}
