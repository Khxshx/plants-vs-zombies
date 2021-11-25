package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class gamepagecontroller implements Initializable{
	@FXML
	Label playername;
	@FXML
	private ImageView zombieImage;
	public void displayName(String username) {
		playername.setText("PLAYER : " + username);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(zombieImage);
		translate.setDuration(Duration.millis(20000));
		translate.setByX(-500);
		translate.play();
	}
}
