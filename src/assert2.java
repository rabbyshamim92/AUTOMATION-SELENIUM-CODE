import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert2 {
	
  @Test
  public void HardTest1() {
	assertTrue(2<1);
	assertTrue(1<2);//hard assertion=order doesn't matter if one fails entire test case fails
  }
  
  @Test
  public void HardTest2() {
	  
	  assertFalse(2<1);
  }
  
  @Test
  public void HardTest3() {
	  
	  
	  assertEquals("log in","user log in");//expected doesn't meet the actual
  }
  @Test
  public void HardTest4() {
	  
	  
	  assertEquals("user log in","user log in");//expected  meets actual
  }
  //soft assertion is a type of assertion that do not throw an error if one assert fails 
 // it keeps on going
  
 @Test
 public void SoftTEst1() {
	 SoftAssert sa =new SoftAssert();
	 
	 sa.assertTrue(2<1);
	 sa.assertTrue(2<0);
	 assertTrue(3<1);
	 
	 
 }
  
}
