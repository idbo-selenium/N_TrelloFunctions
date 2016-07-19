package trello.main;

import trello.main.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	int maxSecond;
	public static WebElement waitForPageUntilElementIsVisible(By locator, int maxSecond){
		return (new WebDriverWait(Browser.driver, maxSecond))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
