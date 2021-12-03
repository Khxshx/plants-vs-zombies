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
	private ImageView sun1;
	@FXML 
	private ImageView sun2;
	@FXML 
	private ImageView sun3;
	@FXML 
	private ImageView sun4;
	@FXML 
	private ImageView sun5;
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
	private static int sunCount;
	public void displayName(String username) {
		playername.setText("PLAYER : " + username);
	}
//
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	TranslateTransition z1 = new TranslateTransition();
	z1.setDuration(Duration.seconds(10));
	z1.setNode(zombie1);
	z1.setToX(-400);
	z1.setCycleCount(1000);
	z1.play();
	
	TranslateTransition z2 = new TranslateTransition();
	z2.setDuration(Duration.seconds(10));
	z2.setNode(zombie2);
	z2.setToX(-600);
	z2.setCycleCount(1000);
	z2.play();
	
	TranslateTransition z3 = new TranslateTransition();
	z3.setDuration(Duration.seconds(10));
	z3.setNode(zombie3);
	z3.setToX(-500);
	z3.setCycleCount(1000);
	z3.play();
	
	TranslateTransition z4 = new TranslateTransition();
	z4.setDuration(Duration.seconds(10));
	z4.setNode(zombie4);
	z4.setToX(-300);
	z4.setCycleCount(1000);
	z4.play();
	
	TranslateTransition z5 = new TranslateTransition();
	z5.setDuration(Duration.seconds(10));
	z5.setNode(zombie5);
	z5.setToX(-550);
	z5.setCycleCount(1000);
	z5.play();
	

	TranslateTransition s1 = new TranslateTransition();
	s1.setDuration(Duration.seconds(10));
	s1.setNode(sun1);
	s1.setToY(400);
	s1.play();
	TranslateTransition s2 = new TranslateTransition();
	s2.setDuration(Duration.seconds(10));
	s2.setNode(sun2);
	s2.setToY(400);
	s2.play();
	TranslateTransition s3 = new TranslateTransition();
	s3.setDuration(Duration.seconds(10));
	s3.setNode(sun3);
	s3.setToY(400);
	s3.play();
	TranslateTransition s4 = new TranslateTransition();
	s4.setDuration(Duration.seconds(10));
	s4.setNode(sun4);
	s4.setToY(400);
	s4.play();
	TranslateTransition s5 = new TranslateTransition();
	s5.setDuration(Duration.seconds(10));
	s5.setNode(sun5);
	s5.setToY(400);
	s5.play();
	
	
	
}


	
	
	
	
}
