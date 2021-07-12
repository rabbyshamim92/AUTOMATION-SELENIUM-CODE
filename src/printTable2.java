import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rabby\\OneDrive\\Desktop\\selenium prosmart\\webdriver\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.timeanddate.com/worldclock/");
	    driver.manage().window().fullscreen();
	    WebElement table = driver.findElement(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table"));// this table body.(whole table)
		   
	    List<WebElement> rows = table.findElements(By.tagName("tr"));//tr represents rows
	    for(int i= 1; i<rows.size(); i++)
	    {
	     List<WebElement>columns = rows.get(i).findElements(By.tagName("td"));// td represents columns
	     for(int j = 0; j<columns.size(); j++)
	     {
	    	 System.out.println(columns.get(j).getText());
	     }
	     System.out.println();
	    }
	    
	    
	    

	}

}
