package testngAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertP
{
  @Test
  public void f() {
	  String a="hii";
	  String f="hello";
	 SoftAssert s= new SoftAssert(); 
	 s.assertEquals(a, f);
	 System.out.println(a);
	 System.out.println(f);
	 System.out.println("softAssert");
	 s.assertAll();
  }
  
  @Test
  public void f1() {
	  String s="hii";
	  String f="hii";
	 SoftAssert s1= new SoftAssert(); 
	 s1.assertEquals(s, f);
	 System.out.println(s);
	 System.out.println(f);
	 System.out.println("softAssert");
	 s1.assertAll();
  }
}
