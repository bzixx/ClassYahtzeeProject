package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class rightRollPane extends Pane{
	
	//protected static boolean resetRollCount = false;
	protected static int rollCount = 2;
	
	private static final String REMAININGROLLS = "Rolls Remaining: ";
	private static Text remainingRolls;
	
	public rightRollPane() {
		
		this.setMinWidth(333);
		this.setMinHeight(562);
		
		this.setStyle("-fx-background-color: #AA45F6;");
		
		VBox mainRightVBox = new VBox();

		
		Font rollButtonFont = new Font("Wingding", 36);
		Button rollButton = new Button("Roll!");
		rollButton.setOnAction(processRollButton);
		rollButton.setMinSize(200, 100);
		rollButton.setFont(rollButtonFont);
		
		
		//The Lines Below should appear after all the Scoring Buttons are gone. 
		Button recordHighScore = new Button("Record High Score!");
		TextField gameScoreName = new TextField();
		Label nameLabel = new Label("Enter Name: ");
		
		
		
		remainingRolls = new Text(REMAININGROLLS + rollCount);
		TextArea highScores = new TextArea();
		
		mainRightVBox.getChildren().add(rollButton);
		mainRightVBox.getChildren().add(remainingRolls);
		
		mainRightVBox.getChildren().add(nameLabel);
		mainRightVBox.getChildren().add(gameScoreName);
		mainRightVBox.getChildren().add(recordHighScore);

		
		mainRightVBox.getChildren().add(highScores);

	
		this.getChildren().add(mainRightVBox);


	}
	
	public static void resetRollCount() {
		rollCount = 3;
		remainingRolls.setText(REMAININGROLLS + rollCount);
		for (GUIdie die : LeftDicePane.Dice) {
			die.unlockDie();
		}		
	}
	
	//Record High Score button needs to appear after all Score buttons (-Yahtzee) have disappeared. 
	//High Score will Capture Name. 
	
	EventHandler<ActionEvent> processRollButton = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			//TODO create button action when pressed. 
			if (rollCount == 0 ) {
				
			}
			else {
				for (GUIdie die : LeftDicePane.Dice) {
					die.roll();
				}
				rollCount = rollCount - 1;
				remainingRolls.setText(REMAININGROLLS + rollCount);
			}
		}
		
	};
	
	EventHandler<ActionEvent> processHighScoreButton = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {

		}
	};
}


