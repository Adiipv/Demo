package testngAssert;

import org.testng.Assert;
import org.testng.annotations.Test;


//hard assert will use for critical or blocker function
public class WhyAssertion {
	@Test
	public void f() {
		String s = "hii";
		String f = "hello";
//		if (s.equals(f))
//			System.out.println("pass");
//
//		else
//			System.out.println("fail");
////   
//		Assertion assertion = new Assertion();
//		assertion.assertEquals(s, f);
//		
		Assert.assertEquals(s, f);
		 System.out.println(s);
		 System.out.println(f);
		 System.out.println("hardAssert");
	
	}
	@Test
	  public void f1() {
		  String s="bye";
		  String f="ta ta";
		
		 System.out.println(s);
		 System.out.println(f);
		 System.out.println("hardAssert");
		 
	  }
	
}
