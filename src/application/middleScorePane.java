package application;

import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class middleScorePane extends Pane{
	
	private int Aces;
	private Text AcesStr = new Text( "Aces:      | ");
	private int Twos;
	private Text TwosStr = new Text("Twos:      | ");
	private int Threes;
	private Text ThreesStr = new Text("Threes:    | ");
	private int Fours;
	private Text FoursStr = new Text("Fours:     | ");
	private int Fives;
	private Text FivesStr = new Text("Fives:     | ");
	private int Sixes;	
	private Text SixesStr = new Text("Sixes:     | ");	
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
	
	VBox upperTextArea;
	VBox lowerTextArea;
	
	public middleScorePane() {
		this.setMinWidth(333);
		this.setMinHeight(562);
		
		this.setStyle("-fx-background-color: white;");	
		
		upperTextArea = new VBox();
		
		upperTextArea.getChildren().add(AcesStr);
		upperTextArea.getChildren().add(TwosStr);
		upperTextArea.getChildren().add(ThreesStr);
		upperTextArea.getChildren().add(FoursStr);
		upperTextArea.getChildren().add(FivesStr);
		upperTextArea.getChildren().add(SixesStr);
		upperTextArea.getChildren().add(UpperBounsStr);
		upperTextArea.getChildren().add(upperSubTotalStr);
		
		lowerTextArea = new VBox();
		
		lowerTextArea.getChildren().add(ThreeOfAKindStr);
		lowerTextArea.getChildren().add(FourOfAKindStr);
		lowerTextArea.getChildren().add(FullHouseStr);
		lowerTextArea.getChildren().add(SmStraightStr);
		lowerTextArea.getChildren().add(LgStraightStr);
		lowerTextArea.getChildren().add(YahtzeeStr);
		lowerTextArea.getChildren().add(YahtzeeBounsStr);
		lowerTextArea.getChildren().add(ChanceStr);
		lowerTextArea.getChildren().add(lowerSubTotalStr);

		VBox ScoreBoardVBox = new VBox();
		ScoreBoardVBox.setPadding(new Insets(10.0));
		
		ScoreBoardVBox.getChildren().add(upperTextArea);
		ScoreBoardVBox.getChildren().add(lowerTextArea);		
		ScoreBoardVBox.getChildren().add(GameTotalStr);		
		
		this.getChildren().add(ScoreBoardVBox);
		
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
		String tempString = AcesStr.getText();
		AcesStr.setText(tempString+ Aces+"\n");
				
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

	/**
	 * @param gameTotal the gameTotal to set
	 */
	public void updateGameTotal() {
		if (GameTotal == (getUpperSubTotal() + getLowerSubTotal())) {
			
		}
		else {
			updateUpperSubTotal();
			updateLowerSubTotal();
			GameTotal = getUpperSubTotal() + getLowerSubTotal();
			String tempString = GameTotalStr.getText();
			GameTotalStr.setText(tempString+ GameTotal +"\n");
		}
		
	}

}
