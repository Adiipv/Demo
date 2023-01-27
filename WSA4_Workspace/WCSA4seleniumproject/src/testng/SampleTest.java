package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	// @Test acts like main method in java
	// execution in TestNG starts from @Test
	// ideally we can have 15 @Test methods in a class
	@Test
	public void demo() {
		Reporter.log("Hello world", true);
	}

}
