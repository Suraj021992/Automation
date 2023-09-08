package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	public static WebDriver driver = null;
	
	public static final String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", "");
		System.setProperty("org.freemaker.loggerLibrary", "none");
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.setBinary(chromePath);
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
	}
	
	public static void main(String[] args) {
		setup();

	}

}
