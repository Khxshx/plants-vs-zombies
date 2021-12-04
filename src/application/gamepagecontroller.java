package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class gamepagecontroller implements Initializable, EventHandler<ActionEvent>  {
	@FXML
	Label playername;
	@FXML
	Label suncount;
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
	private static int sunCounter = 0;
	public void displayName(String username) {
		playername.setText("PLAYER : " + username);
	}
	public void displaycount(int sunCounter) {
		suncount.setText("" + sunCounter);
	}
//
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	TranslateTransition z1 = new TranslateTransition();
	z1.setDuration(Duration.seconds(30));
	z1.setNode(zombie1);
	z1.setToX(-800);
	z1.setCycleCount(1000);
	z1.play();
	
	TranslateTransition z2 = new TranslateTransition();
	z2.setDuration(Duration.seconds(60));
	z2.setNode(zombie2);
	z2.setToX(-1555);
	z2.setCycleCount(1000);
	z2.play();
	
	TranslateTransition z3 = new TranslateTransition();
	z3.setDuration(Duration.seconds(48));
	z3.setNode(zombie3);
	z3.setToX(-1225);
	z3.setCycleCount(1000);
	z3.play();
	
	TranslateTransition z4 = new TranslateTransition();
	z4.setDuration(Duration.seconds(33));
	z4.setNode(zombie4);
	z4.setToX(-888);
	z4.setCycleCount(1000);
	z4.play();
	
	TranslateTransition z5 = new TranslateTransition();
	z5.setDuration(Duration.seconds(54));
	z5.setNode(zombie5);
	z5.setToX(-1486);
	z5.setCycleCount(1000);
	z5.play();
	

	TranslateTransition s1 = new TranslateTransition();
	s1.setDuration(Duration.seconds(40));
	s1.setNode(sun1);
	s1.setToY(2000);
	s1.setCycleCount(1000);
	s1.play();
	
	
	TranslateTransition s2 = new TranslateTransition();
	s2.setDuration(Duration.seconds(40));
	s2.setNode(sun2);
	s2.setToY(2000);
	s2.setCycleCount(1000);
	s2.play();
	
	
	TranslateTransition s3 = new TranslateTransition();
	s3.setDuration(Duration.seconds(40));
	s3.setNode(sun3);
	s3.setToY(2000);
	s3.setCycleCount(1000);
	s3.play();
	
	
	TranslateTransition s4 = new TranslateTransition();
	s4.setDuration(Duration.seconds(40));
	s4.setNode(sun4);
	s4.setToY(2000);
	s4.setCycleCount(2000);
	s4.play();
	
	
	TranslateTransition s5 = new TranslateTransition();
	s5.setDuration(Duration.seconds(40));
	s5.setNode(sun5);
	s5.setToY(2000);
	s5.setCycleCount(1000);
	s5.play();
	// increment sunCount
	sun1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

	     @Override
	     public void handle(MouseEvent event) {
	    	
	    	 sunCounter += 1;
	    	 sun1.setOpacity(0);
	    	 displaycount(sunCounter); 
	         event.consume();
	     }
	});
	sun2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

	     @Override
	     public void handle(MouseEvent event) {
	    	
	    	 sunCounter += 1;
	    	 sun2.setOpacity(0);
	    	 displaycount(sunCounter); 
	         event.consume();
	     }
	});
	sun3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

	     @Override
	     public void handle(MouseEvent event) {
	    	
	    	 sunCounter += 1;
	    	 sun3.setOpacity(0);
	    	 displaycount(sunCounter); 
	         event.consume();
	     }
	});
	sun4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

	     @Override
	     public void handle(MouseEvent event) {
	    	
	    	 sunCounter += 1;
	    	 sun4.setOpacity(0);
	    	 displaycount(sunCounter); 
	         event.consume();
	     }
	});
	sun5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

	     @Override
	     public void handle(MouseEvent event) {
	    	
	    	 sunCounter += 1;
	    	 sun5.setOpacity(0);
	    	 displaycount(sunCounter); 
	         event.consume();
	     }
	});
	
	
}
@Override
public void handle(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}



	
	
	
}
