package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class LeftDicePane extends Pane{
	
	//Needs a Array of GUIDice setup.
	
	public LeftDicePane() {
		this.setMinWidth(333);
		this.setMinHeight(562);
		
		this.setStyle("-fx-background-color: Red;");	

		GUIdie die1 = new GUIdie();
		die1.setMinWidth(100);
		die1.setMinHeight(100);
		GUIdie die2 = new GUIdie();
		die2.setMinWidth(100);
		die2.setMinHeight(100);
		GUIdie die3 = new GUIdie();
		die3.setMinWidth(100);
		die3.setMinHeight(100);
		GUIdie die4 = new GUIdie();
		die4.setMinWidth(100);
		die4.setMinHeight(100);
		GUIdie die5 = new GUIdie();
		die5.setMinWidth(100);
		die5.setMinHeight(100);
		
		VBox diceVBox = new VBox();
		
//		diceVBox.setPadding(new Insets(10.0));
		diceVBox.setPadding(new Insets( 10.0,  115.0,  10.0,  115.0));
		

		diceVBox.setSpacing(10);
		diceVBox.setAlignment(Pos.CENTER);
		
		diceVBox.getChildren().add(die1);
		diceVBox.getChildren().add(die2);
		diceVBox.getChildren().add(die3);
		diceVBox.getChildren().add(die4);
		diceVBox.getChildren().add(die5);
		diceVBox.setAlignment(Pos.CENTER);

		
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
