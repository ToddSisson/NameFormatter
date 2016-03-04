package num3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NameFormatter extends Application {

	public void start(Stage stage) throws Exception {

		Parent parent = FXMLLoader.load(
				getClass().getResource("NameFormatter.fxml"));
		
		Scene scene = new Scene(parent);
		
		stage.setTitle("Name Formatter");
		stage.setScene(scene);
		stage.show();
	}
	
	
	public static void main(String[] args){
		launch(args);
	}
	
}
