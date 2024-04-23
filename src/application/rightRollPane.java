package application;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class rightRollPane extends Pane{
	
	public rightRollPane() {
		
		this.setMinWidth(333);
		this.setMinHeight(562);
		
		this.setStyle("-fx-background-color: #AA45F6;");
		
		VBox mainRightVBox = new VBox();

		Button rollButton = new Button("Roll!");
		TextArea remainingRolls = new TextArea();
		TextArea highScores = new TextArea();
		
		mainRightVBox.getChildren().add(rollButton);
		mainRightVBox.getChildren().add(remainingRolls);
		mainRightVBox.getChildren().add(highScores);

	
		this.getChildren().add(mainRightVBox);


	}
}


