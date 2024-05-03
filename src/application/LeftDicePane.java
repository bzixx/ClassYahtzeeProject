package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class LeftDicePane extends Pane {

	private VBox diceVBox;
	private VBox nameVBox;
	
	private HBox mainLeftHBox;
	
	private Text YahtzeeName = new Text("Y\na\nh\nt\nz\ne\ne");
	private Text GUIdieText = new Text("\nClick\nTo\nLock\nDie\n\nDies\nLocked\nWith\nRed\nWill\nBe\nHeld\nBetween\nRolls");

	// Created New GLobal GUI dies that can then be added to the Array List and
	// Shipped off to other classes when needed.
	private GUIdie die1;
	private GUIdie die2;
	private GUIdie die3;
	private GUIdie die4;
	private GUIdie die5;

	// Added Array List to Hold the Dice and Made it static so we can reference the
	// Dice Object from Anywhere.
	protected static ArrayList<GUIdie> Dice = new ArrayList<GUIdie>();

	// Needs a Array of GUIDice setup.

	public LeftDicePane() {
		this.setMinWidth(333);
		this.setMinHeight(570);

		this.setStyle("-fx-background-color: Red;");
		
		Font YahtzeeFont = new Font("Broadway", 70);
		Font InstructionFont = new Font("Trebuchet MS", 20);
		
		YahtzeeName.setFont(YahtzeeFont);
		YahtzeeName.setFill(Color.DARKORANGE);
		YahtzeeName.setStroke(Color.ORANGE);
		YahtzeeName.setStrokeWidth(3);
		
		GUIdieText.setFont(InstructionFont);
		
		
		die1 = new GUIdie();
		die1.setMinWidth(100);
		die1.setMinHeight(100);
		die2 = new GUIdie();
		die2.setMinWidth(100);
		die2.setMinHeight(100);
		die3 = new GUIdie();
		die3.setMinWidth(100);
		die3.setMinHeight(100);
		die4 = new GUIdie();
		die4.setMinWidth(100);
		die4.setMinHeight(100);
		die5 = new GUIdie();
		die5.setMinWidth(100);
		die5.setMinHeight(100);

		Dice.add(die1);
		Dice.add(die2);
		Dice.add(die3);
		Dice.add(die4);
		Dice.add(die5);

		mainLeftHBox = new HBox();
		diceVBox = new VBox();
		nameVBox = new VBox();
		
//		diceVBox.setPadding(new Insets(10.0));
		mainLeftHBox.setPadding(new Insets(0, 10, 5, 10));

		diceVBox.setSpacing(10);
		diceVBox.setAlignment(Pos.CENTER);

		diceVBox.getChildren().add(die1);
		diceVBox.getChildren().add(die2);
		diceVBox.getChildren().add(die3);
		diceVBox.getChildren().add(die4);
		diceVBox.getChildren().add(die5);
		diceVBox.setAlignment(Pos.CENTER);
		
		mainLeftHBox.getChildren().add(nameVBox);
		mainLeftHBox.getChildren().add(diceVBox);
		mainLeftHBox.getChildren().add(GUIdieText);
		
		mainLeftHBox.setSpacing(40);
		
		nameVBox.getChildren().add(YahtzeeName);
				
		this.getChildren().add(mainLeftHBox);

		// diceVBox.setPadding(Insets(15));

		/*
		 * die1.setFill(Color.BLUE); die2.setFill(Color.GREEN);
		 * die3.setFill(Color.YELLOW); die4.setFill(Color.BROWN);
		 * die5.setFill(Color.BLUE);
		 */

		// Needs a method to return the total of the Array of GUIDice

	}

}
