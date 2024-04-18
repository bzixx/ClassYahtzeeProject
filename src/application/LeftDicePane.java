package application;

import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LeftDicePane extends Pane{
	
	public LeftDicePane() {
		this.setMinWidth(333);
		this.setMinHeight(562);
		
		this.setStyle("-fx-background-color: Blue;");	

		GUIdie die1 = new GUIdie("String Constructor");
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

		
	}

}
