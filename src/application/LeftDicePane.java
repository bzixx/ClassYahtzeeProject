package application;

import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LeftDicePane extends Pane{
	
	//Needs a Array of GUIDice setup.
	
	public LeftDicePane() {
		this.setMinWidth(333);
		this.setMinHeight(562);
		
		this.setStyle("-fx-background-color: Blue;");	

		GUIdie die1 = new GUIdie();
		GUIdie die2 = new GUIdie();
		GUIdie die3 = new GUIdie();
		GUIdie die4 = new GUIdie();
		GUIdie die5 = new GUIdie();
		
		VBox diceVBox = new VBox();
		
		diceVBox.getChildren().add(die1);
		diceVBox.getChildren().add(die2);
		diceVBox.getChildren().add(die3);
		diceVBox.getChildren().add(die4);
		diceVBox.getChildren().add(die5);
		
		this.getChildren().add(diceVBox);
		
		//diceVBox.setPadding(Insets(15));
		
		/*die1.setFill(Color.BLUE);
		die2.setFill(Color.GREEN);
		die3.setFill(Color.YELLOW);
		die4.setFill(Color.BROWN);
		die5.setFill(Color.BLUE);*/
		
		//Needs a method to return the total of the Array of GUIDice


		
	}

}
