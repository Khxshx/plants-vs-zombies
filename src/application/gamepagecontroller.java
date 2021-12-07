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
	@FXML 
	private ImageView mower1;
	@FXML 
	private ImageView mower2;
	@FXML 
	private ImageView mower3;
	@FXML 
	private ImageView mower4;
	@FXML 
	private ImageView mower5;
	private static int sunCounter = 0;
	 private static int tmp = 15;
	 
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
    TranslateTransition z2 = new TranslateTransition();
    TranslateTransition z3 = new TranslateTransition();
    TranslateTransition z4 = new TranslateTransition();
    TranslateTransition z5 = new TranslateTransition();
    TranslateTransition s1 = new TranslateTransition();
    TranslateTransition s2 = new TranslateTransition();
    TranslateTransition s3 = new TranslateTransition();
    TranslateTransition s4 = new TranslateTransition();
    TranslateTransition s5 = new TranslateTransition();
    TranslateTransition m1 = new TranslateTransition();
    TranslateTransition m2 = new TranslateTransition();
    TranslateTransition m3 = new TranslateTransition();
    TranslateTransition m4 = new TranslateTransition();
    TranslateTransition m5 = new TranslateTransition();
    
    
    
    s1.setDuration(Duration.seconds(7));
    s1.setNode(sun1);
    s1.setToY(500);
    s1.play();
    
    s2.setDelay(Duration.seconds(7));
    s2.setDuration(Duration.seconds(7));
    s2.setNode(sun2);
    s2.setToY(500);
    s2.play();
    
    s3.setDelay(Duration.seconds(11));
    s3.setDuration(Duration.seconds(7));
    s3.setNode(sun3);
    s3.setToY(500);
    s3.play();
    
    s4.setDelay(Duration.seconds(13));
    s4.setDuration(Duration.seconds(7));
    s4.setNode(sun4);
    s4.setToY(500);
    s4.play();
    
    s5.setDelay(Duration.seconds(11));
    s5.setDuration(Duration.seconds(7));
    s5.setNode(sun4);
    s5.setToY(500);
    s5.play();
    
    s4.setDelay(Duration.seconds(15));
    s4.setDuration(Duration.seconds(7));
    s4.setNode(sun4);
    s4.setToY(500);
    s4.play();
    
    z1.setDelay(Duration.seconds(5));
    z1.setNode(zombie1);
    z1.setToX(-700);
    z1.setDuration(Duration.seconds(20));
    z1.play();
    
    z1.setOnFinished(e1->
    {
        zombie1.setOpacity(0);
        m1.setNode(mower1);
        m1.setDuration(Duration.seconds(5));
        m1.setToX(750);
        m1.play(); 
    });
    
    z2.setDelay(Duration.seconds(9));
    z2.setNode(zombie2);
    z2.setToX(-700);
    z2.setDuration(Duration.seconds(20));
    z2.play();
    
    z2.setOnFinished(e2->
    {
        zombie2.setOpacity(0);
        m2.setNode(mower2);
        m2.setDuration(Duration.seconds(5));
        m2.setToX(700);
        m2.play();
    });
    
    z3.setDelay(Duration.seconds(17));
    z3.setNode(zombie3);
    z3.setToX(-700);
    z3.setDuration(Duration.seconds(20));
    z3.play();
    z3.setOnFinished(e3->
    {
        zombie3.setOpacity(0);
        m3.setNode(mower3);
        m3.setDuration(Duration.seconds(5));
        m3.setToX(700);
        m3.play();
    });
    
    z4.setDelay(Duration.seconds(13));
    z4.setNode(zombie4);
    z4.setToX(-700);
    
    z4.setDuration(Duration.seconds(20));
    z4.play();
    z4.setOnFinished(e4->
    {
        zombie4.setOpacity(0);
        m4.setNode(mower4);
        m4.setDuration(Duration.seconds(5));
        m4.setToX(700);
        m4.play();
    });
    
    z5.setDelay(Duration.seconds(23));
    z5.setNode(zombie5);
    z5.setToX(-700);
    z5.setDuration(Duration.seconds(20));
    z5.play();
    z5.setOnFinished(e5->
    {
        zombie5.setOpacity(0);
        m5.setNode(mower5);
        m5.setDuration(Duration.seconds(5));
        m5.setToX(700);
        m5.play();
    });
    
    
    m1.setOnFinished(e6->
    {
        mower1.setOpacity(0);
    });
    
    m2.setOnFinished(e7->
    {
        mower2.setOpacity(0);
    });
    m3.setOnFinished(e9->
    {
        mower3.setOpacity(0);
    });
    m4.setOnFinished(e10->
    {
        mower4.setOpacity(0);
    });
    m5.setOnFinished(e11->
    {
        mower5.setOpacity(0);
    });
    
    s1.setOnFinished(e12->
    {
        sun1.setOpacity(0);
    });
    
    s2.setOnFinished(e13->
    {
        sun2.setOpacity(0);
    });
    s3.setOnFinished(e14->
    {
        sun3.setOpacity(0);
    });
    s4.setOnFinished(e15->
    {
        sun4.setOpacity(0);
    });
    s5.setOnFinished(e16->
    {
        sun5.setOpacity(0);
    });
	
}
@Override
public void handle(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}



	
	
	
}
