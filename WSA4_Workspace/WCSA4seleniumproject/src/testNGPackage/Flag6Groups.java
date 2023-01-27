package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6Groups {
  @Test(groups = "Functional")
  public void ft1() {
	  Reporter.log("functional Testing1",true);
  }
  @Test(groups = "Integration")
  public void it1() {
	  Reporter.log("Integration Testing1",true);
  }
  @Test(groups = "System")
  public void st1() {
	  Reporter.log("System Testing1",true);
  }
  //---------------------------------------------------
  @Test(groups = "Functional")
  public void ft2() {
	  Reporter.log("functional Testing2",true);
  }
  @Test(groups = "Integration")
  public void it2() {
	  Reporter.log("Integration Testing2",true);
  }
  @Test(groups = "System")
  public void st2() {
	  Reporter.log("System Testing3",true);
  }
  //-------------------------------------------------
  @Test(groups = "Functional")
  public void ft3() {
	  Reporter.log("functional Testing3",true);
  }
  @Test(groups = "Integration")
  public void it3() {
	  Reporter.log("Integration Testing3",true);
  }
  @Test(groups = "System")
  public void st3() {
	  Reporter.log("System Testing3",true);
  }
  //---------------------------------------------------
  @Test(groups = "Functional")
  public void ft4() {
	  Reporter.log("functional Testing4",true);
  }
  @Test(groups = "Integration")
  public void it4() {
	  Reporter.log("Integration Testing4",true);
  }
  @Test(groups = "System")
  public void st4() {
	  Reporter.log("System Testing4",true);
  }
  //----------------------------------------------------
  @Test(groups = "Functional")
  public void ft5() {
	  Reporter.log("functional Testing5",true);
  }
  @Test(groups = "Integration")
  public void it5() {
	  Reporter.log("Integration Testing5",true);
  }
  @Test(groups = "System")
  public void st5() {
	  Reporter.log("System Testing5",true);
  }
  //--------------------------------------------------
  @Test(groups = "Functional")
  public void ft6() {
	  Reporter.log("functional Testing6",true);
  }
  @Test(groups = "Integration")
  public void it6() {
	  Reporter.log("Integration Testing6",true);
  }
  @Test(groups = "System")
  public void st6() {
	  Reporter.log("System Testing6",true);
  }
  
  @Test(groups = {"Functional","System"})
  public void ft7() {
	  Reporter.log("functional Testing7",true);
  }
  @Test(groups = {"Functional","System"})
  public void it7() {
	  Reporter.log("Integration Testing7",true);
  }
  @Test(groups = {"Functional","System"})
  public void st7() {
	  Reporter.log("System Testing7",true);
  }
}
