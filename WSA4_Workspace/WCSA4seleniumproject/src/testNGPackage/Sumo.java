package testNGPackage;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Sumo {
	@Test
	  public void sumo() {
		//  System.out.println("hello");
		  Reporter.log("This is method semo",true);
		  
	  }
	  @Test
	  public void sumo1() {
		  Reporter.log("This is method semo1",true);
	  }
	 //skip test
	  @Test
	   public void sumo2(){
	      System.out.println("sumo 2 - skip exception example");
	      throw new SkipException("Skipping this exception");
	   }
}
//how to perform patch execution
