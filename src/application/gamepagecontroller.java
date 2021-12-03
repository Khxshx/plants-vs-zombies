package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class gamepagecontroller implements Initializable  {
	@FXML
	Label playername;

	@FXML
	private ImageView zombie1;
	@FXML
	private ImageView zombie2;
	@FXML
	private ImageView zombie3;
	@FXML
	private ImageView zombie4;
	@FXML
	private ImageView zombie5;
	public void displayName(String username) {
		playername.setText("PLAYER : " + username);
	}
//
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	TranslateTransition z1 = new TranslateTransition();
	z1.setDuration(Duration.seconds(5));
	z1.setNode(zombie1);
	z1.setToX(-400);
	z1.setCycleCount(1000);
	z1.play();
	
	TranslateTransition z2 = new TranslateTransition();
	z2.setDuration(Duration.seconds(5));
	z2.setNode(zombie2);
	z2.setToX(-600);
	z2.setCycleCount(1000);
	z2.play();
	
	TranslateTransition z3 = new TranslateTransition();
	z3.setDuration(Duration.seconds(5));
	z3.setNode(zombie3);
	z3.setToX(-500);
	z3.setCycleCount(1000);
	z3.play();
	
	TranslateTransition z4 = new TranslateTransition();
	z4.setDuration(Duration.seconds(5));
	z4.setNode(zombie4);
	z4.setToX(-300);
	z4.setCycleCount(1000);
	z4.play();
	
	TranslateTransition z5 = new TranslateTransition();
	z5.setDuration(Duration.seconds(5));
	z5.setNode(zombie5);
	z5.setToX(-550);
	z5.setCycleCount(1000);
	z5.play();
	
	
}


	
	
	
	
}
