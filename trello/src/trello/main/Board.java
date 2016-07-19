package trello.main;

import org.openqa.selenium.By;

public class Board {

	public void Click() {
		// TODO Auto-generated method stub
		//Board click
		Utility.waitForPageUntilElementIsVisible(By.xpath(".//*[@id='content']/div/div[2]/div/div/div[2]/ul/li/a"),4000).click();
		//board name
		//Utility.waitForPageUntilElementIsVisible(By.xpath(".//*[@id='boardNewTitle']"), 4000).sendKeys("Java");
		//board create click
		//Utility.waitForPageUntilElementIsVisible(By.xpath("html/body/div[5]/div/div[2]/div/div/div/form/input[3]"), 4000).click();
	}

	public List List() {
		// TODO Auto-generated method stub
		return new List();
	}

	
	
}
