package verificationsReportings;

import com.aventstack.extentreports.Status;

import selenium.launch.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Verify3");
		test.log(Status.INFO, "init the properties files....");
		
		launch("chromebrowser");
		test.log(Status.INFO, "opened the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigating to url : " + childProp.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
		String expectedLink = "Customer Serv";
		
		if(!isLinksEqual(expectedLink))
			//System.out.println("Both links are not equal... ");
			reportFailure("Both links are not equal... ");
		else
			//System.out.println("Both links are equal... ");
			reportSuccess("Both links are equal... ");
		
		report.flush();
	}

	

	

}
