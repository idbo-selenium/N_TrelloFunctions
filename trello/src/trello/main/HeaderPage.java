package trello.main;

import org.openqa.selenium.By;

public class HeaderPage {

	public void SelectSignIn() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/section[1]/div/div[2]/p/a"), 5000).click();		
		
		
	}

}
