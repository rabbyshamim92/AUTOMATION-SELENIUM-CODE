import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw2Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.Kayak.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div/div[3]/span[1]")).click();
		
		String month = "December 2021";
		
		String date = "December 24, 2021";
		while(true)
		{
			String text = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div[1]")).getText();
			
			if(text.contains(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[2]/div/div/div[1]/div[2]")).click();
			}
         List<WebElement>allcelldate=driver.findElements(By.xpath("//*[@id=\"udHm\"]/div[7]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]"));
			
			for(WebElement elem:allcelldate)
			{
				String date_value = (elem.getAttribute("aria-label")).toString();
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
