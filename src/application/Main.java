package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			
			HBox mainThreeDivs = new HBox();
			//FlowPane mainThreeDivs = new FlowPane();

			//mainThreeDivs.setSpacing(50);
			
			HBox leftDicePane = new HBox();
			HBox middleScorePane = new HBox();
			HBox rightRollPane = new HBox();
			
			Pane leftDicePaneRect = new Pane();
			leftDicePaneRect.setMinWidth(333);
			leftDicePaneRect.setMinHeight(562);
			
			
			Rectangle middleScorePaneRect = new Rectangle(334,0,333,562);
			Rectangle rightRollPaneRect = new Rectangle(667,0,333,562);
			
			VBox diceVBox = new VBox();
			
			
			GUIdie die1 = new GUIdie("String Constructor");
			GUIdie die2 = new GUIdie();
			GUIdie die3 = new GUIdie();
			GUIdie die4 = new GUIdie();
			GUIdie die5 = new GUIdie();
			
			diceVBox.getChildren().add(die1);
			diceVBox.getChildren().add(die2);
			diceVBox.getChildren().add(die3);
			diceVBox.getChildren().add(die4);
			diceVBox.getChildren().add(die5);
			
			//diceVBox.setPadding(Insets(15));

			
			
			
			/*die1.setFill(Color.BLUE);
			die2.setFill(Color.GREEN);
			die3.setFill(Color.YELLOW);
			die4.setFill(Color.BROWN);
			die5.setFill(Color.BLUE);*/
			
			TextArea upperTextArea = new TextArea();
			TextArea lowerTextArea = new TextArea();

			Button rollButton = new Button("Roll!");
			TextArea remainingRolls = new TextArea();
			TextArea highScores = new TextArea();
			
			root.getChildren().add(mainThreeDivs);
			
			mainThreeDivs.getChildren().add(leftDicePane);
			mainThreeDivs.getChildren().add(middleScorePane);
			mainThreeDivs.getChildren().add(rightRollPane);
			
			leftDicePane.getChildren().add(leftDicePaneRect);

			leftDicePaneRect.getChildren().add(diceVBox);
			
			middleScorePane.getChildren().add(middleScorePaneRect);
			
			middleScorePane.getChildren().add(upperTextArea);
			middleScorePane.getChildren().add(lowerTextArea);
			
			rightRollPane.getChildren().add(rightRollPaneRect);

			rightRollPane.getChildren().add(rollButton);
			rightRollPane.getChildren().add(remainingRolls);
			rightRollPane.getChildren().add(highScores);
			
			leftDicePane.setSpacing(15);
			
			
			//leftDicePane.setPrefWidth((primaryStage.getWidth() / 3));
			
			//Text hello = new Text(50,20, "Hello, JavaFX!");
			//Text question = new Text(120,80,"How's it going?");
			//Group root = new Group(hello, question);
			Scene scene = new Scene(root,1000,562, Color.LIGHTGREEN);
			
			//Font myNewFont = new Font("Times",12);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("A JavaFX Program");
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
