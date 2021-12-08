package application;
import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class homepagecontroller {
	String path = "media\\sounds\\menu.wav";
	Media media = new Media(new File(path).toURI().toString());
	MediaPlayer mediaPlayer = new MediaPlayer(media);
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private Button exitButton, playButton, pauseButton;
	@FXML
	private AnchorPane home;
	
	@FXML
	public void switchto_shop(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("/shop.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public void switchto_username(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("/username.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void exit(ActionEvent event) {
		stage = (Stage) home.getScene().getWindow();
		System.out.println("You logged out!");
		stage.close();
	}
	
	@FXML
	
	public void playSound(ActionEvent event) {
		mediaPlayer.play();
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	}
	
	public void pauseSound(ActionEvent event) {
		mediaPlayer.pause();
	}
	
	
}

