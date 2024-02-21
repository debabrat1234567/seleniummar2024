package testNGAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertDemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String expectedLink = "Customer Serv";
		
		//Assert.assertTrue(actualLink.equals(expectedLink), "Links are not equal....");
		Assert.assertEquals(actualLink, expectedLink, "Links are not equal....");
		
		driver.findElement(By.linkText("Customer Service")).click();
	}
}
