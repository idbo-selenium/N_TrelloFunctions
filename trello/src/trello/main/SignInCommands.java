package trello.main;

import trello.main.SignInCommands;
import org.openqa.selenium.By;

public class SignInCommands {

	public String username;
	public String password;
	int maxSecond = 5000;
	
	public SignInCommands(String username){
		this.username = username;
	}
	public SignInCommands WithPassword(String password ){
		this.password = password;
		return this;
	}
	
	public void Login() {
		//Find username and put username
		Utility.waitForPageUntilElementIsVisible(By.id("user"), maxSecond).sendKeys(username);
		// Find password and put password
		Utility.waitForPageUntilElementIsVisible(By.id("password"), maxSecond).sendKeys(password);
		// find sign in button and click
		Utility.waitForPageUntilElementIsVisible(By.id("login"), maxSecond).click();
		
	}

	
}
