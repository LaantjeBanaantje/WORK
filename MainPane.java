package testfx;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MainPane extends BorderPane {

	private VBox topBox;
	private Button toDoListButton;
	private Button timerButton;
	private Button shopButton;


	private VBox createTopBox(){
		VBox vbox = new VBox();
		vbox.setStyle("-fx-background-color:#FFD1DC");
		Label Menu = new Label("Menu");
		Menu.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));
		Menu.setPadding(new Insets(5,50,50,210));
		vbox.getChildren().add(Menu);
		vbox.getChildren().addAll(toDoListButton, timerButton, shopButton);
		vbox.setPadding(new Insets(200,200,200,230));
		vbox.setSpacing(30);
		return vbox;
	}

	private Button createToDoListButton(){
		Button TDLButton = new Button("To-Do List");
		TDLButton.setPrefSize(500, 50);
		return TDLButton;
	}

	private Button createTimerButton(){
		Button timer = new Button("Timer");
		timer.setPrefSize(500, 50);
		
		return timer;
	}

	private Button createShopButton(){
		Button shop = new Button("Shop");
		shop.setPrefSize(500, 50);
		return shop;
	}

	public MainPane() {
		toDoListButton = createToDoListButton();
		timerButton = createTimerButton();
		shopButton = createShopButton();
		topBox = createTopBox();
		setCenter(topBox);
	}
}
