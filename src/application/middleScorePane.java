package application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class middleScorePane extends Pane{
	
	private int Aces;
	private Text AcesStr = new Text( "Aces:      | ");
	private final String ACESSTR =  "Aces:      | ";
	private int Twos;
	private Text TwosStr = new Text("Twos:      | ");
	private final String TWOSSTR =  "Twos:      | ";
	private int Threes;
	private Text ThreesStr = new Text("Threes:    | ");
	private final String THREESSTR =  "Threes:    | ";

	private int Fours;
	private Text FoursStr = new Text("Fours:     | ");
	private final String FOURSSTR =  "Fours:     | ";

	private int Fives;
	private Text FivesStr = new Text("Fives:     | ");
	private final String FIVESSTR =  "Fives:     | ";

	private int Sixes;	
	private Text SixesStr = new Text("Sixes:     | ");
	private final String SIXESSTR =  "Sixes:     | ";

	private int upperSubTotal;
	private Text upperSubTotalStr = new Text("Upper SubTotal:     | ");
	private int UpperBouns; 
	private Text UpperBounsStr = new Text("Upper Bonus:     | ");
		
	private int ThreeOfAKind;
	private Text ThreeOfAKindStr = new Text("3 of Kind: | ");
	private int FourOfAKind;
	private Text FourOfAKindStr = new Text("4 of Kind: | ");
	private int FullHouse;
	private Text FullHouseStr = new Text("Full House:| ");
	private int SmStraight;
	private Text SmStraightStr = new Text("Small Str: | ");
	private int LgStraight;
	private Text LgStraightStr = new Text("Large Str: | ");
	private int Yahtzee;
	private Text YahtzeeStr = new Text("Yahtzee:   | ");
	private int YahtzeeBouns;
	private Text YahtzeeBounsStr = new Text("Yahtzee +: | ");
	private int Chance;
	private Text ChanceStr = new Text("Chance:    | ");
	private int lowerSubTotal;
	private Text lowerSubTotalStr = new Text("Lower SubTotal:     | ");
	
	private int GameTotal;
	private Text GameTotalStr = new Text("Game Total:     | ");
	
	private HBox primeMiddleHBox;
	
	private VBox upperTextArea;
	private VBox upperButtonArea;
	private VBox lowerTextArea;
	private VBox lowerButtonArea;
	
	private VBox ScoreBoardVBox;
	private VBox scoreButtonVBox;
	
	private Button scoreAces = new Button("Score Aces");
	private Button scoreTwos = new Button("Score Two");
	private Button scoreThrees = new Button("Score Three");
	private Button scoreFours = new Button("Score Four");
	private Button scoreFives = new Button("Score Fives");
	private Button scoreSixes = new Button("Score Sixes");

	private Button scoreThreeOfAKind = new Button("Score Three of a Kind");
	private Button scoreFourOfAKind = new Button("Score Four of a Kind");
	private Button scoreFullHouse = new Button("Score Full House");
	private Button scoreSmStraight = new Button("Score Small Staight");
	private Button scoreLgStraight = new Button("Score Large Staight");
	private Button scoreYahtzee = new Button("Score Yahtzee");
	private Button scoreChance = new Button("Score Chance");

	
	public middleScorePane() {
		this.setMinWidth(333);
		this.setMinHeight(562);
		
		this.setStyle("-fx-background-color: white;");	
		
		
		/*scoreTwos.setOnAction(scoreTwos::processAcesScore);
		scoreThrees.setOnAction(scoreThrees::processAcesScore);
		scoreFours.setOnAction(scoreFours::processAcesScore);
		scoreFives.setOnAction(scoreFives::processAcesScore);
		scoreSixes.setOnAction(scoreSixes::processAcesScore);

		scoreThreeOfAKind.setOnAction(scoreThreeOfAKind::processAcesScore);
		scoreFourOfAKind.setOnAction(scoreFourOfAKind::processAcesScore);
		scoreFullHouse.setOnAction(scoreFullHouse::processAcesScore);
		scoreSmStraight.setOnAction(scoreSmStraight::processAcesScore);
		scoreLgStraight.setOnAction(scoreLgStraight::processAcesScore);
		scoreYahtzee.setOnAction(scoreYahtzee::processAcesScore);
		scoreChance.setOnAction(scoreChance::processAcesScore);*/

		
		primeMiddleHBox = new HBox();
		
		primeMiddleHBox.setPadding(new Insets(10, 10, 10, 10));
		
		
		upperTextArea = new VBox();
		upperButtonArea = new VBox();
		upperButtonArea.setSpacing(10);

		
		upperButtonArea.getChildren().add(scoreAces);
		upperButtonArea.getChildren().add(scoreTwos);
		upperButtonArea.getChildren().add(scoreThrees);
		upperButtonArea.getChildren().add(scoreFours);
		upperButtonArea.getChildren().add(scoreFives);
		upperButtonArea.getChildren().add(scoreSixes);
		
		upperButtonArea.setAlignment(Pos.BASELINE_RIGHT);


		upperTextArea.getChildren().add(AcesStr);
		upperTextArea.getChildren().add(TwosStr);
		upperTextArea.getChildren().add(ThreesStr);
		upperTextArea.getChildren().add(FoursStr);
		upperTextArea.getChildren().add(FivesStr);
		upperTextArea.getChildren().add(SixesStr);
		upperTextArea.getChildren().add(UpperBounsStr);
		upperTextArea.getChildren().add(upperSubTotalStr);
		
		lowerTextArea = new VBox();
		lowerButtonArea = new VBox();
		lowerButtonArea.setSpacing(10);

		lowerButtonArea.getChildren().add(scoreThreeOfAKind);
		lowerButtonArea.getChildren().add(scoreFourOfAKind);
		lowerButtonArea.getChildren().add(scoreFullHouse);
		lowerButtonArea.getChildren().add(scoreSmStraight);
		lowerButtonArea.getChildren().add(scoreLgStraight);
		lowerButtonArea.getChildren().add(scoreYahtzee);
		lowerButtonArea.getChildren().add(scoreChance);
		
		lowerButtonArea.setAlignment(Pos.BASELINE_RIGHT);
		
		lowerTextArea.getChildren().add(ThreeOfAKindStr);
		lowerTextArea.getChildren().add(FourOfAKindStr);
		lowerTextArea.getChildren().add(FullHouseStr);
		lowerTextArea.getChildren().add(SmStraightStr);
		lowerTextArea.getChildren().add(LgStraightStr);
		lowerTextArea.getChildren().add(YahtzeeStr);
		lowerTextArea.getChildren().add(YahtzeeBounsStr);
		lowerTextArea.getChildren().add(ChanceStr);
		lowerTextArea.getChildren().add(lowerSubTotalStr);

		ScoreBoardVBox = new VBox();
		scoreButtonVBox = new VBox();
		scoreButtonVBox.setSpacing(10);
		
		ScoreBoardVBox.setPadding(new Insets(10.0));
		scoreButtonVBox.setPadding(new Insets(10.0));
		
		scoreButtonVBox.getChildren().add(upperButtonArea);
		scoreButtonVBox.getChildren().add(lowerButtonArea);
		
		ScoreBoardVBox.getChildren().add(upperTextArea);
		ScoreBoardVBox.getChildren().add(lowerTextArea);		
		ScoreBoardVBox.getChildren().add(GameTotalStr);		
		
		primeMiddleHBox.getChildren().add(ScoreBoardVBox);
		primeMiddleHBox.getChildren().add(scoreButtonVBox);
		
		this.getChildren().add(primeMiddleHBox);
				
		scoreAces.setOnAction(processAcesScore);
		scoreTwos.setOnAction(processTwosScore);
		scoreThrees.setOnAction(processThreesScore);
		scoreFours.setOnAction(processFoursScore);
		scoreFives.setOnAction(processFivesScore);
		scoreSixes.setOnAction(processSixesScore);

		scoreThreeOfAKind.setOnAction(processThreeOfAKindScore);
		scoreFourOfAKind.setOnAction(processFourOfAKindScore);
		scoreFullHouse.setOnAction(processFullHouseScore);
		scoreSmStraight.setOnAction(processSmStraightScore);
		scoreLgStraight.setOnAction(processSixesScore);
		scoreYahtzee.setOnAction(processYahtzeeScore);
		scoreChance.setOnAction(processChanceScore);


		
	}

	/**
	 * @return the aces
	 */
	public int getAces() {
		return Aces;
	}

	/**
	 * @param aces the aces to set
	 */
	public void setAces(int aces) {
		Aces = aces;
		//String tempString = AcesStr.getText();
		AcesStr.setText(ACESSTR+ Aces+"\n");
				
	}

	/**
	 * @return the twos
	 */
	public int getTwos() {
		return Twos;
	}

	/**
	 * @param twos the twos to set
	 */
	public void setTwos(int twos) {
		Twos = twos;
		String tempString = TwosStr.getText();
		TwosStr.setText(tempString+ Twos +"\n");

	}

	/**
	 * @return the threes
	 */
	public int getThrees() {
		return Threes;
	}

	/**
	 * @param threes the threes to set
	 */
	public void setThrees(int threes) {
		Threes = threes;
		String tempString = ThreesStr.getText();
		ThreesStr.setText(tempString+ Threes +"\n");
	}

	/**
	 * @return the fours
	 */
	public int getFours() {
		return Fours;
	}

	/**
	 * @param fours the fours to set
	 */
	public void setFours(int fours) {
		Fours = fours;
		String tempString = FoursStr.getText();
		FoursStr.setText(tempString+ Fours +"\n");
	}

	/**
	 * @return the fives
	 */
	public int getFives() {
		return Fives;
	}

	/**
	 * @param fives the fives to set
	 */
	public void setFives(int fives) {
		Fives = fives;
		String tempString = FivesStr.getText();
		FivesStr.setText(tempString+ Fives +"\n");
	}

	/**
	 * @return the sixes
	 */
	public int getSixes() {
		return Sixes;
	}

	/**
	 * @param sixes the sixes to set
	 */
	public void setSixes(int sixes) {
		Sixes = sixes;
		String tempString = SixesStr.getText();
		SixesStr.setText(tempString+ Sixes +"\n");
	}
	
	/**
	 * @return the upperSubTotoal
	 */
	public int getUpperSubTotal() {
		return upperSubTotal;
	}

	/**
	 * @param upperSubTotoal the upperSubTotoal to set
	 */
	public void updateUpperSubTotal() {
		//FIXME need to put if statement for repeat calls.
		if (upperSubTotal == (getAces() + getTwos() + getThrees() + getFours() + getFives() + getSixes() + getUpperBouns())) {

		}
		else {
			upperSubTotal = getAces() + getTwos() + getThrees() + getFours() + getFives() + getSixes() + getUpperBouns();
			String tempString = upperSubTotalStr.getText();
			upperSubTotalStr.setText(tempString + upperSubTotal + "\n");
		}

	}

	/**
	 * @return the upperBouns
	 */
	public int getUpperBouns() {
		return UpperBouns;
	}

	/**
	 * @param upperBouns the upperBouns to set
	 */
	public void setUpperBouns() {
		if ((Aces + Twos + Threes + Fours + Fives + Sixes) >= 63) {
		UpperBouns = 35;
		String tempString = UpperBounsStr.getText();
		UpperBounsStr.setText(tempString + UpperBouns + "\n");
		}else {
			UpperBouns = 0;
			String tempString = UpperBounsStr.getText();
			UpperBounsStr.setText(tempString + UpperBouns + "\n");
		}
		
	}

	/**
	 * @return the threeOfAKind
	 */
	public int getThreeOfAKind() {
		return ThreeOfAKind;
	}

	/**
	 * @param threeOfAKind the threeOfAKind to set
	 */
	public void setThreeOfAKind(int threeOfAKind) {
		ThreeOfAKind = threeOfAKind;
		String tempString = ThreeOfAKindStr.getText();
		ThreeOfAKindStr.setText(tempString+ ThreeOfAKind +"\n");
	}

	/**
	 * @return the fourOfAKind
	 */
	public int getFourOfAKind() {
		return FourOfAKind;
	}

	/**
	 * @param fourOfAKind the fourOfAKind to set
	 */
	public void setFourOfAKind(int fourOfAKind) {
		FourOfAKind = fourOfAKind;
		String tempString = FourOfAKindStr.getText();
		FourOfAKindStr.setText(tempString+ FourOfAKind +"\n");
	}

	/**
	 * @return the fullHouse
	 */
	public int getFullHouse() {
		return FullHouse;
	}

	/**
	 * @param fullHouse the fullHouse to set
	 */
	public void setFullHouse() {
		FullHouse = 25;
		String tempString = FullHouseStr.getText();
		FullHouseStr.setText(tempString+ FullHouse +"\n");
	}

	/**
	 * @return the smStraight
	 */
	public int getSmStraight() {
		return SmStraight;
	}

	/**
	 * @param smStraight the smStraight to set
	 */
	public void setSmStraight() {
		SmStraight = 30;
		String tempString = SmStraightStr.getText();
		SmStraightStr.setText(tempString+ SmStraight +"\n");
	}
	
	public void scratchSmStraight() {
		SmStraight = 0;
		String tempString = SmStraightStr.getText();
		SmStraightStr.setText(tempString+ SmStraight +"\n");
		
	}

	/**
	 * @return the lgStraight
	 */
	public int getLgStraight() {
		return LgStraight;
	}

	/**
	 * @param lgStraight the lgStraight to set
	 */
	public void setLgStraight() {
		LgStraight = 40;
		String tempString = LgStraightStr.getText();
		LgStraightStr.setText(tempString+ LgStraight +"\n");
	}
	
	public void scratchLgStraight() {
		LgStraight = 0;
		String tempString = LgStraightStr.getText();
		LgStraightStr.setText(tempString+ LgStraight +"\n");
	}

	/**
	 * @return the Yahtzee
	 */
	public int getYahtzee() {
		return Yahtzee;
	}

	/**
	 * @param Yahtzee the Yahtzee to set
	 */
	public void setYahtzee() {
		Yahtzee = 50;
		String tempString = YahtzeeStr.getText();
		YahtzeeStr.setText(tempString+ Yahtzee +"\n");
	}
	
	public void scratchYahtzee() {
		Yahtzee = 0;
		String tempString = YahtzeeStr.getText();
		YahtzeeStr.setText(tempString+ Yahtzee +"\n");
	}

	/**
	 * @return the yahtzeeBouns
	 */
	public int getYahtzeeBouns() {
		return YahtzeeBouns * 100;
	}

	/**
	 * @param yahtzeeBouns the yahtzeeBouns to set
	 */
	public void setYahtzeeBouns() {
		YahtzeeBouns++;
		String tempString = YahtzeeBounsStr.getText();
		
		if (YahtzeeBouns <= 1) {
		YahtzeeBounsStr.setText(tempString+ getYahtzeeBouns() +"\n");
		}
		else {
			YahtzeeBounsStr.setText("Yahtzee +: | " + getYahtzeeBouns() +"\n");
		}	
	}

	/**
	 * @return the chance
	 */
	public int getChance() {
		return Chance;
	}

	/**
	 * @param chance the chance to set
	 */
	public void setChance(int chance) {
		Chance = chance;
		String tempString = ChanceStr.getText();
		ChanceStr.setText(tempString+ Chance +"\n");
	}

	/**
	 * @return the lowerSubTotoal
	 */
	public int getLowerSubTotal() {
		return lowerSubTotal;
	}

	/**
	 * @param lowerSubTotoal the lowerSubTotoal to set
	 */
	public void updateLowerSubTotal() {
		if (lowerSubTotal == (getThreeOfAKind() + getFourOfAKind() + getFullHouse() + getSmStraight() + getLgStraight() + getYahtzee() + getChance() +getYahtzeeBouns())) {
			
		}
		else {
			lowerSubTotal = getThreeOfAKind() + getFourOfAKind() + getFullHouse() + getSmStraight() + getLgStraight() + getYahtzee() + getChance() +getYahtzeeBouns();
			String tempString = lowerSubTotalStr.getText();
			lowerSubTotalStr.setText(tempString+ lowerSubTotal +"\n");
		}
	}

	/**
	 * @return the gameTotal
	 */
	public int getGameTotal() {
		updateGameTotal();
		return GameTotal;
	}
	
	protected static int internalGameTotal() {
		return GameTotal;

	}

	/**
	 * @param gameTotal the gameTotal to set
	 */
	
	//FIXME  this is Broken cause ti deosnt work after being called be each button event
	public void updateGameTotal() {
		if (GameTotal != 0 && GameTotal == (getUpperSubTotal() + getLowerSubTotal())) {
			
		}
		else {
			updateUpperSubTotal();
			updateLowerSubTotal();
			GameTotal = getUpperSubTotal() + getLowerSubTotal();
			String tempString = GameTotalStr.getText();
			GameTotalStr.setText(tempString+ GameTotal +"\n");
		}
		
	}
	
	
	EventHandler<ActionEvent> processAcesScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				if (die.getSide() == 1){
					numberToReturn += 1;
				}
			}
			setAces(numberToReturn);
			updateGameTotal();
			rightRollPane.resetRollCount();

		}
		
	};
	
	EventHandler<ActionEvent> processTwosScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				if (die.getSide() == 2){
					numberToReturn += 2;
				}
			}
			setTwos(numberToReturn);
			updateGameTotal();
			rightRollPane.resetRollCount();

		}
		
	};
	
	EventHandler<ActionEvent> processThreesScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				if (die.getSide() == 3){
					numberToReturn += 3;
				}
			}
			setThrees(numberToReturn);
			updateGameTotal();
			rightRollPane.resetRollCount();

		}
		
	};
	
	EventHandler<ActionEvent> processFoursScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				if (die.getSide() == 4){
					numberToReturn += 4;
				}
			}
			setFours(numberToReturn);
			updateGameTotal();
			rightRollPane.resetRollCount();

		}
		
	};
	
	EventHandler<ActionEvent> processFivesScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				if (die.getSide() == 5){
					numberToReturn += 5;
				}
			}
			setFives(numberToReturn);
			updateGameTotal();
			rightRollPane.resetRollCount();

		}
		
	};
	
	EventHandler<ActionEvent> processSixesScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				if (die.getSide() == 6){
					numberToReturn += 6;
				}
			}
			setSixes(numberToReturn);
			updateGameTotal();
			rightRollPane.resetRollCount();
		}
		
	};
	
	EventHandler<ActionEvent> processThreeOfAKindScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				numberToReturn += die.getSide();
			}
			setThreeOfAKind(numberToReturn);
			updateGameTotal();
			rightRollPane.resetRollCount();
		}
		
	};
	
	EventHandler<ActionEvent> processFourOfAKindScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				numberToReturn += die.getSide();
			}
			setFourOfAKind(numberToReturn);
			updateGameTotal();
			rightRollPane.resetRollCount();
		}
		
	};
	
	EventHandler<ActionEvent> processFullHouseScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			//FIXME Need too Implement Check for Full House. Record regardless. 
			
			setFullHouse();
			updateGameTotal();
			rightRollPane.resetRollCount();
		}
		
	};
	
	EventHandler<ActionEvent> processSmStraightScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				numberToReturn += die.getSide();
			}
			if (numberToReturn >= 10 && numberToReturn <= 18) {
				setSmStraight();
			}
			else {
				scratchSmStraight();
			}
			// 10 Low 18 High
			updateGameTotal();		
			rightRollPane.resetRollCount();
		}
		
	};
	
	EventHandler<ActionEvent> processLgStraightScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
				numberToReturn += die.getSide();
			}
			if (numberToReturn == 15 || numberToReturn == 20) {
				setLgStraight();
			}
			else {
				scratchLgStraight();
			}
			// 10 Low 18 High
			updateGameTotal();
			rightRollPane.resetRollCount();
		}
		
	};
	
	EventHandler<ActionEvent> processYahtzeeScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (LeftDicePane.Dice.get(0).getSide() == LeftDicePane.Dice.get(1).getSide() && LeftDicePane.Dice.get(0).getSide() == LeftDicePane.Dice.get(2).getSide() && LeftDicePane.Dice.get(0).getSide() == LeftDicePane.Dice.get(3).getSide() && LeftDicePane.Dice.get(0).getSide() == LeftDicePane.Dice.get(4).getSide()) {
				if (getYahtzee() == 0) {
					setYahtzee();
				}
				else {
					int numberToReturn = 0;
					for (GUIdie die : LeftDicePane.Dice) {
						numberToReturn += die.getSide();
					}
					setYahtzeeBouns();
				}
			}
			else {
				scratchYahtzee();
			}
			updateGameTotal();
			rightRollPane.resetRollCount();
		}
		
		//Once the ScoreYahtzee Button is pressed it Updates the Button to Say Score Yahzee bonus. AR
		//Also have to figure out how to show to prompt another score. 
	};
	
	EventHandler<ActionEvent> processChanceScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			
			int numberToReturn = 0;
			for (GUIdie die : LeftDicePane.Dice) {
					numberToReturn += die.getSide();
			}
			setChance(numberToReturn);
			updateGameTotal();
			rightRollPane.resetRollCount();

		}
		
	};

}
