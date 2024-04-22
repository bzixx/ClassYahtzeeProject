package application;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class rightRollPane extends Pane{
	
	public rightRollPane() {
		
		this.setMinWidth(333);
		this.setMinHeight(562);
		
		this.setStyle("-fx-background-color: #AA45F6;");	

	
		
		Button rollButton = new Button("Roll!");
		TextArea remainingRolls = new TextArea();
		TextArea highScores = new TextArea();
	
		this.getChildren().add(rollButton);
		this.getChildren().add(remainingRolls);
		this.getChildren().add(highScores);

	}
}


