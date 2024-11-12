package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
HBox pane = new HBox(10);
pane.setAlignment(Pos.CENTER);
Button btOk = new Button("OK");
Button btCancel = new Button("Cancel");
OKHandlerClass handler1 = new OKHandlerClass();

btOk.setOnAction(handler1); 
// on the click of Okay button -with setOnAction -calls the handler1 that
//deals with calling crud operation!. 
CancelHandlerClass handler2 = new CancelHandlerClass(); //create handler object
btCancel.setOnAction(handler2); //register the handler object 
pane.getChildren().addAll(btOk, btCancel); //add buttons to the scene

Scene scene = new Scene(pane);
primaryStage.setTitle("HandleEvent"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
primaryStage.show(); // Display the stage
}



	public static void main(String[] args) {
		launch(args);
	}
}
