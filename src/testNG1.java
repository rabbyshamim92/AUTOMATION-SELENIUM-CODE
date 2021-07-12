import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG1 {
  @BeforeTest
  public void OpenBrowser()
  {
	  System.out.println("Browser Opened");
	  
  }
   @Test(priority=2,enabled=true, description= "this opens  website",testName="fuctional Test")
   public void OpenWebsite()
   {
	   System.out.println("Browser Opened");
   }
   
   @Test(priority=0,testName="fuctional Test")
   public  void LogIn() 
   {
	   System.out.println("user logged in");
}
   
   
   @Test(priority=1,enabled = true)
   public void ChangeDob()
   {
	   System.out.println("user changed dob");
 
   }
   @AfterTest
   public void CloseBrowse()
   {
	   System.out.println("Browser closed");
   }
}

