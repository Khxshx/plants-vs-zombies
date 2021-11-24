package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class gamepagecontroller {
	@FXML
	Label playername;
	
	public void displayName(String username) {
		playername.setText("PLAYER : " + username);
	}
}
