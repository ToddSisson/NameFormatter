package num3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NameFormatterController {

	@FXML
	private Button button4;

	@FXML
	private Label middleNameLabel;

	@FXML
	private Button button5;

	@FXML
	private Button button2;

	@FXML
	private Button button3;

	@FXML
	private Label titleLabel;

	@FXML
	private Button button6;

	@FXML
	private Label formatLabel;

	@FXML
	private TextField firstNameTextBox;

	@FXML
	private Label lastNameLabel;

	@FXML
	private TextField middleNameTextBox;

	@FXML
	private Label outputLabel;

	@FXML
	private TextField titleTextBox;

	@FXML
	private TextField lastNameTextBox;

	@FXML
	private Label firstNameLabel;

	@FXML
	private Button button1;


	public void name1(){
		outputLabel.setText(String.format("%s %s %s %s", 
				titleTextBox.getText(), 
				firstNameTextBox.getText(),
				middleNameTextBox.getText(),
				lastNameTextBox.getText()));
	}

	public void name2(){
		outputLabel.setText(String.format("%s %s %s",  
				firstNameTextBox.getText(),
				middleNameTextBox.getText(),
				lastNameTextBox.getText()));
	}

	public void name3(){
		outputLabel.setText(String.format("%s %s", 
				firstNameTextBox.getText(),
				lastNameTextBox.getText()));
	}

	public void name4(){
		outputLabel.setText(String.format("%s, %s %s, %s", 
				lastNameTextBox.getText(),
				firstNameTextBox.getText(),
				middleNameTextBox.getText(),
				titleTextBox.getText()));
	}

	public void name5(){
		outputLabel.setText(String.format("%s, %s %s", 
				lastNameTextBox.getText(),
				firstNameTextBox.getText(),
				middleNameTextBox.getText()));	
	}
	public void name6(){
		outputLabel.setText(String.format("%s, %s", 
				lastNameTextBox.getText(),
				firstNameTextBox.getText()));
	}
}