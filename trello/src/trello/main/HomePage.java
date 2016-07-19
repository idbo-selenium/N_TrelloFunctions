package trello.main;

import trello.main.HeaderPage;
import trello.main.Browser;

public class HomePage {

	public static String baseURL = "https://trello.com/";
	
	public static void GoTo() {
		Browser.driver.navigate().to(baseURL);
	}
	
	public static HeaderPage Header() {
		// TODO Auto-generated method stub
		return new HeaderPage();
	}
}
