package selenium.launch;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("init the properties files....");
		
		launch("chromebrowser");
		log.info("opened the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigating to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazonsearchdropbox_id","Books");
		log.info("selecting the option from dropbox By using the locator : " + orProp.getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtext_name","Harry Potter");
		log.info("Entering the search text By usng the locator : " + orProp.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicking rhe element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();*/
	}

}
