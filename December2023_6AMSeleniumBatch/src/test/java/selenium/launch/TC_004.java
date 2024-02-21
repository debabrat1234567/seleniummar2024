package selenium.launch;

import com.aventstack.extentreports.Status;

public class TC_004 extends BaseTest
{
	
	
	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.createTest("TC_004");
		test.log(Status.INFO, "init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.INFO, "opened the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigating to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazonsearchdropbox_id","Books");
		test.log(Status.PASS, "selecting the option from dropbox By using the locator : " + orProp.getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtext_name","Harry Potter");
		test.log(Status.INFO, "Entering the search text By usng the locator : " + orProp.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicking rhe element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));	
		
		report.flush();
	}

}
