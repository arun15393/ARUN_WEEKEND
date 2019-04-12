package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {
	public static WebDriver driver;
	@Before
	public static void launchBrowser()
	{
		System.out.println("Executing Launch Browser");
		driver=new ChromeDriver();
		driver.get("https://www.khanacademy.org/");
	}
	@After
	public static void quitbrowser()
	{
		System.out.println("Executing quit browser");
		driver.close();
		driver.quit();
	}
}
