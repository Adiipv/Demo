package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotation {
	@Test
	public void test() {
		Reporter.log("@Test Annotations", true);

	}

	@Test
	public void Test1() {
		Reporter.log("@Test1 Annotation", true);
	}

	@Test
	public void Test2() {
		Reporter.log("@Test2 Annotation", true);
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("@BeforeSuite Annotation", true);

	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("@BeforeClass Annotation", true);

	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("@BeforeTest Annotation", true);

	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("@BeforeMethod Annotation", true);

	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("@AfterMethod Annotation", true);

	}

	@AfterClass
	public void afterclass() {
		Reporter.log("@Afterclass Annotation", true);

	}

	@AfterTest
	public void afterTest() {
		Reporter.log("@AfterTest Annotation", true);

	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("@AfterSuite Annotation", true);

	}

}
