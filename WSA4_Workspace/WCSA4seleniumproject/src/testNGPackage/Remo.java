package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  
  @Test
  public void remo() {
	//  System.out.println("hello");
	  Reporter.log("This is method remo",true);
	  
  }
  @Test
  public void remo1() {
	  Reporter.log("This is method remo1",true);
  }
  
  // how to fail the test case
  @Test
  public void remo2() {
	  //
	  int a=2/1;
	  Reporter.log("This is method demo2",a);
	  }
  
}
