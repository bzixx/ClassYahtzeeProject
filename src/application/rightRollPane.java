package application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class rightRollPane extends Pane {

	// protected static boolean resetRollCount = false;
	protected static int rollCount = 2;

	private static final String REMAININGROLLS = "Rolls Remaining: ";
	private static Text remainingRolls;
	
	protected static int scoreButtonsPushed = 0;

	private TextField gameScoreName;
	private TextArea highScores;
	private VBox mainRightVBox;
	private Label nameLabel = new Label("Enter Name: ");
	private Button recordHighScore;
	private Button restartGame;

	public rightRollPane() {

		this.setMinWidth(333);
		this.setMinHeight(562);

		this.setStyle("-fx-background-color: #AA45F6;");

		mainRightVBox = new VBox();
		mainRightVBox.setAlignment(Pos.CENTER);
		mainRightVBox.setSpacing(15);
		mainRightVBox.setPadding(new Insets(10.0, 0, 10.0, 0));
		

		Font rollButtonFont = new Font("Arial", 36);
		Font SecondaryFont = new Font("Arial", 24);
		Button rollButton = new Button("Roll!");
		rollButton.setOnAction(processRollButton);
		rollButton.setMinSize(200, 100);
		rollButton.setFont(rollButtonFont);

		// The Lines Below should appear after all the Scoring Buttons are gone.
		recordHighScore = new Button("Record High Score!");
		recordHighScore.setOnAction(processHighScoreButton);
		recordHighScore.setFont(SecondaryFont);


		gameScoreName = new TextField();
		

		remainingRolls = new Text(REMAININGROLLS + rollCount);
		remainingRolls.setFont(SecondaryFont);
		highScores = new TextArea();
		highScores.appendText("High Scores: \n");
		highScores.setEditable(false);
		highScores.setMaxWidth(333);
		
		nameLabel.setFont(SecondaryFont);

		restartGame = new Button("Start a new game!");
		restartGame.setOnAction(processResetGameButton);
		restartGame.setFont(SecondaryFont);


		mainRightVBox.getChildren().add(rollButton);
		mainRightVBox.getChildren().add(remainingRolls);

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

	// Record High Score button needs to appear after all Score buttons (-Yahtzee)
	// have disappeared.
	// High Score will Capture Name.

	EventHandler<ActionEvent> processRollButton = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			// TODO create button action when pressed.
			if (rollCount == 0) {

			} else {
				for (GUIdie die : LeftDicePane.Dice) {
					die.roll();
				}
				rollCount = rollCount - 1;
				remainingRolls.setText(REMAININGROLLS + rollCount);
				//System.out.println(scoreButtonsPushed);
				if (scoreButtonsPushed >= 12) {
					try {
					showHighScore();
					showResetButton();
					}catch(Exception someExceptionToDoNothingWith) {
						//Do Nothing.  I just didn't Want to Change logic
					}
				}
			}
		}

	};

	EventHandler<ActionEvent> processHighScoreButton = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (!(gameScoreName.getText().equals(""))) {
				highScores.appendText(gameScoreName.getText() + " scored " + YahtzeeMain.middleScorePane.getGameTotal() + "\n");
				mainRightVBox.getChildren().remove(recordHighScore);
			}
			
		}
	};
	
	EventHandler<ActionEvent> processResetGameButton = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			YahtzeeMain.middleScorePane.activateScoreButtonsAgain();
			YahtzeeMain.middleScorePane.resetScoreboard();
			for (GUIdie die : LeftDicePane.Dice) {
				die.unlockDie();
			}
			rollCount = 3;
			remainingRolls.setText(REMAININGROLLS + rollCount);
			scoreButtonsPushed = 0;
			gameScoreName.setText("");
			mainRightVBox.getChildren().remove(nameLabel);
			mainRightVBox.getChildren().remove(gameScoreName);
			mainRightVBox.getChildren().remove(recordHighScore);
			mainRightVBox.getChildren().remove(restartGame);
		}
	};
	
	private void showResetButton() {
		mainRightVBox.getChildren().add(restartGame);
	}
	
	private void showHighScore() {
		mainRightVBox.getChildren().add(nameLabel);
		mainRightVBox.getChildren().add(gameScoreName);
		mainRightVBox.getChildren().add(recordHighScore);
		
	}
}
