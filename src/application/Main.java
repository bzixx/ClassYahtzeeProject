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
			
			LeftDicePane leftDicePane = new LeftDicePane();
			middleScorePane middleScorePane = new middleScorePane();
			rightRollPane rightRollPane = new rightRollPane();
			
			mainThreeDivs.getChildren().add(leftDicePane);
			mainThreeDivs.getChildren().add(middleScorePane);
			mainThreeDivs.getChildren().add(rightRollPane);
			
			
			
			root.getChildren().add(mainThreeDivs);
			
			//TESTING ONLY
			middleScorePane.setAces(3);
			middleScorePane.setTwos(6);
			middleScorePane.setThrees(9);
			middleScorePane.setFours(12);
			middleScorePane.setFives(15);
			middleScorePane.setSixes(18);
			middleScorePane.setUpperBouns();
			middleScorePane.updateUpperSubTotal();


			middleScorePane.setThreeOfAKind(12);
			middleScorePane.setFourOfAKind(12);
			middleScorePane.setFullHouse();
			middleScorePane.setSmStraight();
			middleScorePane.setLgStraight();
			middleScorePane.setYahtzee();
			middleScorePane.setChance(12);
			middleScorePane.setYahtzeeBouns();
			middleScorePane.setYahtzeeBouns();
			
			middleScorePane.updateLowerSubTotal();
			
			middleScorePane.updateGameTotal();

			

			
			//leftDicePane.getChildren().add(leftDicePaneRect);

			//leftDicePaneRect.getChildren().add(diceVBox);
			//middleScorePane.getChildren().add(middleScorePaneRect);
			//rightRollPane.getChildren().add(rightRollPaneRect);
			//leftDicePane.setSpacing(15);
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
