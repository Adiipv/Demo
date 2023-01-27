package testNGPackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Flag7AlwaysRun {
  @Test
  public void m1() {
	  Assert.fail();
  }
  @Test(dependsOnMethods = "m1",alwaysRun = true)
  public void m2() {
	  Reporter.log("M2 Method",true);
  }
}
