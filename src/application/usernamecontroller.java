package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class usernamecontroller {
	@FXML
	private TextField getusername;
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchto_homepage(ActionEvent event) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchto_gamepage(ActionEvent event) throws IOException{
		String username = getusername.getText();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/gamepage.fxml"));
		root=loader.load();
		
		gamepagecontroller gamepagecontroller = loader.getController();
		gamepagecontroller.displayName(username);
//		Parent root = FXMLLoader.load(getClass().getResource("/gamepage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
	
}