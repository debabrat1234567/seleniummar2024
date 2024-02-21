package testng;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import selenium.launch.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
	
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String btype) throws Exception 
  {
	  System.out.println("startProcess");
	    init();
		test = report.createTest("TC_004");
		test.log(Status.INFO, "init the properties files....");
		
		launch(btype);
		test.log(Status.INFO, "opened the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigating to url : " + childProp.getProperty("amazonurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	  System.out.println("amazon test");
	    selectOption("amazonsearchdropbox_id","Books");
		test.log(Status.PASS, "selecting the option from dropbox By using the locator : " + orProp.getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtext_name","Harry Potter");
		test.log(Status.INFO, "Entering the search text By usng the locator : " + orProp.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicking rhe element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess() 
  {
	  System.out.println("endProcess");
	  report.flush();
	  driver.quit();
  }

}
