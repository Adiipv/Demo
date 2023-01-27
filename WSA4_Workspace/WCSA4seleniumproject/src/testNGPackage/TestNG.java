package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
  @Test(priority = 1)
  public void today() {
	   long threadid = Thread.currentThread().getId();
	  Reporter.log("Today Method "+threadid+" is the threadid ",true);
  }
  @Test
  public void tomorrow() {
	  
	  long threadid = Thread.currentThread().getId();
	  Reporter.log("Today Method "+threadid+" is the threadid ",true);
	
}
  
}
