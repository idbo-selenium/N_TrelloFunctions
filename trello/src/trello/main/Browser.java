package trello.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;

	public static void Open() {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	public static void Close() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public static WebDriver Driver() {
		return driver;
	}

	
}
