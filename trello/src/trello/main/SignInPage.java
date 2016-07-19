package trello.main;

import trello.main.SignInCommands;

public class SignInPage {
	public static SignInCommands LoginAs(String username) {
		SignInCommands signinCmd = new SignInCommands(username);
		return signinCmd;	
	}
}
