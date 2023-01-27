package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
	//  System.out.println("hello");
	  Reporter.log("This is method demo",true);
	  
  }
  @Test
  public void demo1() {
	  Reporter.log("This is method demo1",true);
  }
  
  // how to fail the test case
  @Test
  public void demo2() {
	  //Reporter.log("This is method demo2",true);
	  int a=2/1;
	  Reporter.log("This is method demo2",a);
	  }
  
  
 
}
