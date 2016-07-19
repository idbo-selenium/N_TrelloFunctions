package trello.main;

import org.openqa.selenium.By;

public class MyAccountPage {

	public static String IsAbleToLoginAs() {
		// TODO Auto-generated method stub
		//return Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]/span[2]"), 5000).getText();
		return Utility.waitForPageUntilElementIsVisible(By.xpath(".//*[@id='header']/div[4]/a[2]/span[2]"), 5000).getText();
	}

	public static Board Board() {
		// TODO Auto-generated method stub
		return new Board();
	}

	public static void Signout() throws InterruptedException {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[3]/div[1]/div[4]/a[2]/span[2]"), 5000).click();Thread.sleep(3000);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div[5]/div[2]/div/ul[5]/li/a"), 5000).click();//html/body/div[5]/div/div[2]/div/div/div/ul[3]/li/a
	}
}
