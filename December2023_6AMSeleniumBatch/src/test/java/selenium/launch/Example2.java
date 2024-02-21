package selenium.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.get("https://www.amazon.in");
		
		//String txt1 = driver.findElement(By.linkText("Customer Service")).getText();
		//System.out.println(txt1);
		
		System.out.println("-----------------------------------------");
		
		/*List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());
			}
		}*/
		
		//driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("innerHTML"));
		}
		
		
	}

}
