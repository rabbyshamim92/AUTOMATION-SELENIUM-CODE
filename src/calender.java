import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.trivago.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div[1]/div[2]/form/div/div[2]/button")).click();
		
		String month = "December 2021";
		
		String date = "2021-12-24";
		
		while(true)
		{
			String text = driver.findElement(By.xpath("//*[@id=\"cal-heading-month\"]")).getText();
			
			if(text.contains(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
			}
			
			List<WebElement>allcelldate=driver.findElements(By.xpath("//time[@class='cal-day cal-is-selectable']"));
			
			for(WebElement elem:allcelldate)
			{
				String date_value = (elem.getAttribute("datetime")).toString();
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
