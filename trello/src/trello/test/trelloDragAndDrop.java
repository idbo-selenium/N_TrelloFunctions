package trello.test;

import trello.main.HomePage;
import trello.main.MyAccountPage;
import trello.main.SignInPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;
import trello.main.Browser;

public class trelloDragAndDrop {

	@Before 
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void Cleanup(){
		//Browser.Close();
	}
	
	@Test
	public void DragDropTest() throws InterruptedException{
		HomePage.GoTo();
		HomePage.Header().SelectSignIn();
		SignInPage.LoginAs("knskumari").WithPassword("pass@word1").Login();
		Assert.assertEquals("Nirmala", MyAccountPage.IsAbleToLoginAs());	
		MyAccountPage.Board().Click();
		MyAccountPage.Board().List().DrapAnddrop();System.out.println("wetrhfgyukhio;oisd");
		MyAccountPage.Signout();
	}
	
}
