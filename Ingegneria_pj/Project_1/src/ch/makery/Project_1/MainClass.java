package ch.makery.Project_1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
	Parent root = FXMLLoader.load(getClass().getResource("Overview.fxml"));
	Scene scene = new Scene(root);
	primaryStage.setScene(scene);
	primaryStage.setTitle("Analisys Software");
	primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
