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

public class middleScorePane extends Pane {

	private int Aces;
	private Text AcesStr = new Text("Aces:                       |");
	private final String ACESSTR = "Aces:                       |";

	private int Twos;
	private Text TwosStr = new Text("Twos:                      |");
	private final String TWOSSTR = "Twos:                      |";

	private int Threes;
	private Text ThreesStr = new Text("Threes:                   |");
	private final String THREESSTR = "Threes:                   |";

	private int Fours;
	private Text FoursStr = new Text("Fours:                      |");
	private final String FOURSSTR = "Fours:                      |";

	private int Fives;
	private Text FivesStr = new Text("Fives:                       | ");
	private final String FIVESSTR = "Fives:                       | ";

	private int Sixes;
	private Text SixesStr = new Text("Sixes:                       | ");
	private final String SIXESSTR = "Sixes:                       | ";

	private int upperSubTotal;
	private Text upperSubTotalStr = new Text("Upper SubTotal: | ");
	private final String UPPERSUBTOTALSTR = "Upper SubTotal: | ";

	private int UpperBouns;
	private Text UpperBounsStr = new Text("Upper Bonus:       | ");
	private final String UPPERBOUNSSTR = "Upper Bonus:       | ";

	private int ThreeOfAKind;
	private Text ThreeOfAKindStr = new Text("3 of Kind:                | ");
	private final String THREEOFAKINDSTR = "3 of Kind:                | ";

	private int FourOfAKind;
	private Text FourOfAKindStr = new Text("4 of Kind:                | ");
	private final String FOUROFAKINDSTR = "4 of Kind:                | ";

	private int FullHouse;
	private Text FullHouseStr = new Text("Full House:             | ");
	private final String FULLHOUSESTR = "Full House:             | ";

	private int SmStraight;
	private Text SmStraightStr = new Text("Small Straight:      | ");
	private final String SMSTRAIGHTSTR = "Small Straight:      | ";

	private int LgStraight;
	private Text LgStraightStr = new Text("Large Straight:      | ");
	private final String LGSTRAIGHTSTR = "Large Straight:      | ";

	private int Yahtzee;
	private Text YahtzeeStr = new Text("Yahtzee:                  | ");
	private final String YAHTZEESTR = "Yahtzee:                  | ";

	private int YahtzeeBouns;
	private Text YahtzeeBounsStr = new Text("Yahtzee Bonus:    | ");
	private final String YAHTZEEBOUNSSTR = "Yahtzee Bonus:    | ";

	private int Chance;
	private Text ChanceStr = new Text("Chance:                   | ");
	private final String CHANCESTR = "Chance:                   | ";

	private int lowerSubTotal;
	private Text lowerSubTotalStr = new Text("Lower SubTotal:  | ");
	private final String LOWERSUBTOTALSTR = "Lower SubTotal:  | ";

	private int GameTotal;
	private Text GameTotalStr = new Text("Game Total:           | ");
	private final String GAMETOTALSTR = "Game Total:           | ";

	private HBox primeMiddleHBox;

	private VBox upperTextArea;
	private VBox upperButtonArea;
	private VBox lowerTextArea;
	private VBox lowerButtonArea;

	private VBox ScoreBoardVBox;
	private VBox scoreButtonVBox;

	private Button scoreAces = new Button("Score Aces");
	private Button scoreTwos = new Button("Score Twos");
	private Button scoreThrees = new Button("Score Threes");
	private Button scoreFours = new Button("Score Fours");
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

		/*
		 * scoreTwos.setOnAction(scoreTwos::processAcesScore);
		 * scoreThrees.setOnAction(scoreThrees::processAcesScore);
		 * scoreFours.setOnAction(scoreFours::processAcesScore);
		 * scoreFives.setOnAction(scoreFives::processAcesScore);
		 * scoreSixes.setOnAction(scoreSixes::processAcesScore);
		 * 
		 * scoreThreeOfAKind.setOnAction(scoreThreeOfAKind::processAcesScore);
		 * scoreFourOfAKind.setOnAction(scoreFourOfAKind::processAcesScore);
		 * scoreFullHouse.setOnAction(scoreFullHouse::processAcesScore);
		 * scoreSmStraight.setOnAction(scoreSmStraight::processAcesScore);
		 * scoreLgStraight.setOnAction(scoreLgStraight::processAcesScore);
		 * scoreYahtzee.setOnAction(scoreYahtzee::processAcesScore);
		 * scoreChance.setOnAction(scoreChance::processAcesScore);
		 */

		primeMiddleHBox = new HBox();

		// primeMiddleHBox.setPadding(new Insets(10, 10, 10, 10));

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
		
		primeMiddleHBox.setSpacing(45);

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
		scoreLgStraight.setOnAction(processLgStraightScore);
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
		// String tempString = AcesStr.getText();
		AcesStr.setText(ACESSTR + Aces + "\n");

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
		// String tempString = TwosStr.getText();
		TwosStr.setText(TWOSSTR + Twos + "\n");

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
		// String tempString = ThreesStr.getText();
		ThreesStr.setText(THREESSTR + Threes + "\n");
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
		// String tempString = FoursStr.getText();
		FoursStr.setText(FOURSSTR + Fours + "\n");
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
		// String tempString = FivesStr.getText();
		FivesStr.setText(FIVESSTR + Fives + "\n");
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
		// String tempString = SixesStr.getText();
		SixesStr.setText(SIXESSTR + Sixes + "\n");
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
		// FIXME need to put if statement for repeat calls.
		// # Fixed.
		/*
		 * if (upperSubTotal == (getAces() + getTwos() + getThrees() + getFours() +
		 * getFives() + getSixes() + getUpperBouns())) {
		 * 
		 * } else {
		 */
		updateUpperBouns();
		upperSubTotal = getAces() + getTwos() + getThrees() + getFours() + getFives() + getSixes() + getUpperBouns();
		// String tempString = upperSubTotalStr.getText();
		upperSubTotalStr.setText(UPPERSUBTOTALSTR + upperSubTotal + "\n");
		// }

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
	public void updateUpperBouns() {
		if ((Aces + Twos + Threes + Fours + Fives + Sixes) >= 63) {
			UpperBouns = 35;
			// String tempString = UpperBounsStr.getText();
			UpperBounsStr.setText(UPPERBOUNSSTR + UpperBouns + "\n");
		} else {
			UpperBouns = 0;
			// String tempString = UpperBounsStr.getText();
			UpperBounsStr.setText(UPPERBOUNSSTR + UpperBouns + "\n");
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
		// String tempString = ThreeOfAKindStr.getText();
		ThreeOfAKindStr.setText(THREEOFAKINDSTR + ThreeOfAKind + "\n");
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
		// String tempString = FourOfAKindStr.getText();
		FourOfAKindStr.setText(FOUROFAKINDSTR + FourOfAKind + "\n");
	}

	/**
	 * @return the fullHouse
	 */
	public int getFullHouse() {
		return FullHouse;
	}

	/**
	 */
	public void setFullHouse() {
		FullHouse = 25;
		// String tempString = FullHouseStr.getText();
		FullHouseStr.setText(FULLHOUSESTR + FullHouse + "\n");
	}

	public void scratchFullHouse() {
		FullHouse = 0;
		// String tempString = FullHouseStr.getText();
		FullHouseStr.setText(FULLHOUSESTR + FullHouse + "\n");
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
		// String tempString = SmStraightStr.getText();
		SmStraightStr.setText(SMSTRAIGHTSTR + SmStraight + "\n");
	}

	public void scratchSmStraight() {
		SmStraight = 0;
		// String tempString = SmStraightStr.getText();
		SmStraightStr.setText(SMSTRAIGHTSTR + SmStraight + "\n");

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
		// String tempString = LgStraightStr.getText();
		LgStraightStr.setText(LGSTRAIGHTSTR + LgStraight + "\n");
	}

	public void scratchLgStraight() {
		LgStraight = 0;
		// String tempString = LgStraightStr.getText();
		LgStraightStr.setText(LGSTRAIGHTSTR + LgStraight + "\n");
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
		// String tempString = YahtzeeStr.getText();
		YahtzeeStr.setText(YAHTZEESTR + Yahtzee + "\n");
	}

	public void scratchYahtzee() {
		if (getYahtzee() != 0) {
			YahtzeeBounsStr.setText(YAHTZEEBOUNSSTR + getYahtzeeBouns() + "\n");
			scoreYahtzee.setDisable(true);
		} else {
			Yahtzee = 0;
			// String tempString = YahtzeeStr.getText();
			YahtzeeStr.setText(YAHTZEESTR + Yahtzee + "\n");
			YahtzeeBounsStr.setText(YAHTZEEBOUNSSTR + getYahtzeeBouns() + "\n");
			scoreYahtzee.setDisable(true);
		}

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
		// String tempString = YahtzeeBounsStr.getText();

		if (YahtzeeBouns <= 1) {
			YahtzeeBounsStr.setText(YAHTZEEBOUNSSTR + getYahtzeeBouns() + "\n");
		} else {
			YahtzeeBounsStr.setText(YAHTZEEBOUNSSTR + getYahtzeeBouns() + "\n");
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
		// String tempString = ChanceStr.getText();
		ChanceStr.setText(CHANCESTR + Chance + "\n");
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
		/*
		 * if (lowerSubTotal == (getThreeOfAKind() + getFourOfAKind() + getFullHouse() +
		 * getSmStraight() + getLgStraight() + getYahtzee() + getChance()
		 * +getYahtzeeBouns())) {
		 * 
		 * } else {
		 */
		lowerSubTotal = getThreeOfAKind() + getFourOfAKind() + getFullHouse() + getSmStraight() + getLgStraight()
				+ getYahtzee() + getChance() + getYahtzeeBouns();
		// String tempString = lowerSubTotalStr.getText();
		lowerSubTotalStr.setText(LOWERSUBTOTALSTR + lowerSubTotal + "\n");
		// }
	}

	/**
	 * @return the gameTotal
	 */
	public int getGameTotal() {
		updateGameTotal();
		return GameTotal;
	}

	/**
	 * @param gameTotal the gameTotal to set
	 */

	public void updateGameTotal() {
		/*
		 * if (GameTotal != 0 && GameTotal == (getUpperSubTotal() + getLowerSubTotal()))
		 * {
		 * 
		 * } else {
		 */
		updateUpperSubTotal();
		updateLowerSubTotal();
		GameTotal = getUpperSubTotal() + getLowerSubTotal();
		// String tempString = GameTotalStr.getText();
		GameTotalStr.setText(GAMETOTALSTR + GameTotal + "\n");
		// }

	}

	EventHandler<ActionEvent> processAcesScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				int numberToReturn = 0;
				for (GUIdie die : LeftDicePane.Dice) {
					if (die.getSide() == 1) {
						numberToReturn += 1;
					}
				}
				setAces(numberToReturn);
				updateGameTotal();
				scoreAces.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}

		}

	};

	EventHandler<ActionEvent> processTwosScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				int numberToReturn = 0;
				for (GUIdie die : LeftDicePane.Dice) {
					if (die.getSide() == 2) {
						numberToReturn += 2;
					}
				}
				setTwos(numberToReturn);
				updateGameTotal();
				scoreTwos.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}

		}

	};

	EventHandler<ActionEvent> processThreesScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				int numberToReturn = 0;
				for (GUIdie die : LeftDicePane.Dice) {
					if (die.getSide() == 3) {
						numberToReturn += 3;
					}
				}
				setThrees(numberToReturn);
				updateGameTotal();
				scoreThrees.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}

		}

	};

	EventHandler<ActionEvent> processFoursScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				int numberToReturn = 0;
				for (GUIdie die : LeftDicePane.Dice) {
					if (die.getSide() == 4) {
						numberToReturn += 4;
					}
				}
				setFours(numberToReturn);
				updateGameTotal();
				scoreFours.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}

		}

	};

	EventHandler<ActionEvent> processFivesScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				int numberToReturn = 0;
				for (GUIdie die : LeftDicePane.Dice) {
					if (die.getSide() == 5) {
						numberToReturn += 5;
					}
				}
				setFives(numberToReturn);
				updateGameTotal();
				scoreFives.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;


			}

		}

	};

	EventHandler<ActionEvent> processSixesScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {
				int numberToReturn = 0;
				for (GUIdie die : LeftDicePane.Dice) {
					if (die.getSide() == 6) {
						numberToReturn += 6;
					}
				}
				setSixes(numberToReturn);
				updateGameTotal();
				scoreSixes.setDisable(true);

				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}

		}

	};

	EventHandler<ActionEvent> processThreeOfAKindScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				int isAAce = 0;
				int isATwo = 0;
				int isAThree = 0;
				int isAFour = 0;
				int isAFive = 0;
				int isASix = 0;

				for (GUIdie die : LeftDicePane.Dice) {
					switch (die.getSide()) {
					case 1:
						isAAce++;
						break;
					case 2:
						isATwo++;
						break;
					case 3:
						isAThree++;
						break;
					case 4:
						isAFour++;
						break;
					case 5:
						isAFive++;
						break;
					case 6:
						isASix++;
						break;
					default:
						break;

					}
				}

				int[] countedDice = { isAAce, isATwo, isAThree, isAFour, isAFive, isASix };

				boolean isThreeMatching = false;

				for (int number : countedDice) {
					if (number >= 3) {
						isThreeMatching = true;
					}
				}

				if (isThreeMatching) {
					int numberToReturn = 0;
					for (GUIdie die : LeftDicePane.Dice) {
						numberToReturn += die.getSide();
					}
					setThreeOfAKind(numberToReturn);

				} else {
					setThreeOfAKind(0);
				}

				// FIXME need logic to check for three of the same dice

				updateGameTotal();
				scoreThreeOfAKind.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}
		}

	};

	EventHandler<ActionEvent> processFourOfAKindScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				int isAAce = 0;
				int isATwo = 0;
				int isAThree = 0;
				int isAFour = 0;
				int isAFive = 0;
				int isASix = 0;

				for (GUIdie die : LeftDicePane.Dice) {
					switch (die.getSide()) {
					case 1:
						isAAce++;
						break;
					case 2:
						isATwo++;
						break;
					case 3:
						isAThree++;
						break;
					case 4:
						isAFour++;
						break;
					case 5:
						isAFive++;
						break;
					case 6:
						isASix++;
						break;
					default:
						break;

					}
				}

				int[] countedDice = { isAAce, isATwo, isAThree, isAFour, isAFive, isASix };

				boolean isFourMatching = false;

				for (int number : countedDice) {
					if (number >= 4) {
						isFourMatching = true;
					}
				}

				if (isFourMatching) {
					int numberToReturn = 0;
					for (GUIdie die : LeftDicePane.Dice) {
						numberToReturn += die.getSide();
					}
					setFourOfAKind(numberToReturn);

				} else {
					setFourOfAKind(0);
				}

				updateGameTotal();
				scoreFourOfAKind.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}
		}

	};

	EventHandler<ActionEvent> processFullHouseScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				// FIXME Need too Implement Check for Full House. Record regardless.

				int isAAce = 0;
				int isATwo = 0;
				int isAThree = 0;
				int isAFour = 0;
				int isAFive = 0;
				int isASix = 0;

				for (GUIdie die : LeftDicePane.Dice) {
					switch (die.getSide()) {
					case 1:
						isAAce++;
						break;
					case 2:
						isATwo++;
						break;
					case 3:
						isAThree++;
						break;
					case 4:
						isAFour++;
						break;
					case 5:
						isAFive++;
						break;
					case 6:
						isASix++;
						break;
					default:
						break;

					}
				}

				int[] countedDice = { isAAce, isATwo, isAThree, isAFour, isAFive, isASix };

				boolean isTwoMatching = false;
				boolean isThreeMatching = false;

				for (int number : countedDice) {
					if (number == 3) {
						isThreeMatching = true;
					} else if (number == 2) {
						isTwoMatching = true;
					} else {

					}
				}

				if (isTwoMatching && isThreeMatching) {
					setFullHouse();
				} else {
					scratchFullHouse();
				}

				updateGameTotal();
				scoreFullHouse.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}
		}

	};

	EventHandler<ActionEvent> processSmStraightScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				boolean isAAce = false;
				boolean isATwo = false;
				boolean isAThree = false;
				boolean isAFour = false;
				boolean isAFive = false;
				boolean isASix = false;

				for (GUIdie die : LeftDicePane.Dice) {
					switch (die.getSide()) {
					case 1:
						isAAce = true;
						break;
					case 2:
						isATwo = true;
						break;
					case 3:
						isAThree = true;
						break;
					case 4:
						isAFour = true;
						break;
					case 5:
						isAFive = true;
						break;
					case 6:
						isASix = true;
						break;
					default:
						break;

					}
				}

				// FIXME This LOGIC is BORKED Big Time.
				if ((isAAce && isATwo && isAThree && isAFour) || (isATwo && isAThree && isAFour && isAFive)
						|| (isAThree && isAFour && isAFive && isASix)) {
					setSmStraight();
				} else {
					scratchSmStraight();
				}
				// 10 Low 18 High
				updateGameTotal();
				scoreSmStraight.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}
		}

	};

	EventHandler<ActionEvent> processLgStraightScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				int numberToReturn = 0;
				for (GUIdie die : LeftDicePane.Dice) {
					numberToReturn += die.getSide();
				}
				if (numberToReturn == 15 || numberToReturn == 20) {
					setLgStraight();
				} else {
					scratchLgStraight();
				}
				// 10 Low 18 High
				updateGameTotal();
				scoreLgStraight.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}
		}

	};

	EventHandler<ActionEvent> processYahtzeeScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {
				if (LeftDicePane.Dice.get(0).getSide() == LeftDicePane.Dice.get(1).getSide()
						&& LeftDicePane.Dice.get(0).getSide() == LeftDicePane.Dice.get(2).getSide()
						&& LeftDicePane.Dice.get(0).getSide() == LeftDicePane.Dice.get(3).getSide()
						&& LeftDicePane.Dice.get(0).getSide() == LeftDicePane.Dice.get(4).getSide()) {
					if (getYahtzee() == 0) {
						setYahtzee();
					} else {
						setYahtzeeBouns();
						rightRollPane.resetRollCount();
						rightRollPane.scoreButtonsPushed++;
					}
				} else {
					scratchYahtzee();
				}
				updateGameTotal();
				if (getYahtzeeBouns() == 0) {
					rightRollPane.resetRollCount();
					rightRollPane.scoreButtonsPushed++;
				}
				

			}
		}

		// Once the ScoreYahtzee Button is pressed it Updates the Button to Say Score
		// Yahzee bonus. AR
		// Also have to figure out how to show to prompt another score.
	};

	EventHandler<ActionEvent> processChanceScore = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			if (rightRollPane.rollCount == 3) {

			} else {

				int numberToReturn = 0;
				for (GUIdie die : LeftDicePane.Dice) {
					numberToReturn += die.getSide();
				}
				setChance(numberToReturn);
				updateGameTotal();
				scoreChance.setDisable(true);
				rightRollPane.resetRollCount();
				rightRollPane.scoreButtonsPushed++;

			}

		}

	};
	
	protected void activateScoreButtonsAgain() {
		scoreAces.setDisable(false);
		scoreTwos.setDisable(false);
		scoreThrees.setDisable(false);
		scoreFours.setDisable(false);
		scoreFives.setDisable(false);
		scoreSixes.setDisable(false);

		scoreThreeOfAKind.setDisable(false);
		scoreFourOfAKind.setDisable(false);
		scoreFullHouse.setDisable(false);
		scoreSmStraight.setDisable(false);
		scoreLgStraight.setDisable(false);
		scoreYahtzee.setDisable(false);
		scoreChance.setDisable(false);
		
	}
	
	protected void resetScoreboard() {
		AcesStr.setText(ACESSTR);
		Aces = 0;
		TwosStr.setText(TWOSSTR);
		Twos = 0;
		ThreesStr.setText(THREESSTR);
		Threes = 0;
		FoursStr.setText(FOURSSTR);
		Fours = 0;
		FivesStr.setText(FIVESSTR);
		Fives = 0;
		SixesStr.setText(SIXESSTR);
		Sixes = 0;
		UpperBounsStr.setText(UPPERBOUNSSTR);
		UpperBouns = 0;
		upperSubTotalStr.setText(UPPERSUBTOTALSTR);
		upperSubTotal= 0;
		ThreeOfAKindStr.setText(THREEOFAKINDSTR);
		ThreeOfAKind = 0;
		FourOfAKindStr.setText(FOUROFAKINDSTR);
		FourOfAKind = 0;
		FullHouseStr.setText(FULLHOUSESTR);
		FullHouse = 0;
		SmStraightStr.setText(SMSTRAIGHTSTR);
		SmStraight = 0;
		LgStraightStr.setText(LGSTRAIGHTSTR);
		LgStraight = 0;
		YahtzeeStr.setText(YAHTZEESTR);
		Yahtzee = 0;
		YahtzeeBounsStr.setText(YAHTZEEBOUNSSTR);
		YahtzeeBouns = 0;
		ChanceStr.setText(CHANCESTR);
		Chance = 0;
		lowerSubTotalStr.setText(LOWERSUBTOTALSTR);
		lowerSubTotal = 0;
		GameTotalStr.setText(GAMETOTALSTR);
		GameTotal = 0;



		
	}

}
