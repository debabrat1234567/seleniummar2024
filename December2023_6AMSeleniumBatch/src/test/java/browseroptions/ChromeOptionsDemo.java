package browseroptions;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsDemo 
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		//option.addArguments("--headless");
		//option.addArguments("--incognito");
		option.addArguments("--ignore-certificate-errors");
		//option.addArguments("--proxy-server=https://192.168.10.1:1744");
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		option.addArguments("--user-data-dir=C:\\Users\\ravi\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		//driver.get("https://www.amazon.in");
		driver.get("https://expired.badssl.com/");
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

}
