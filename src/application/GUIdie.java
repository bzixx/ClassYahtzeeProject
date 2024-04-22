package application;

import java.util.ArrayList;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/* 
 * How to create an Image and display 
 * Image img = new Image(getClass().getResourceAsStream("search.png"));
 * ImageView imgView = new ImageView(img);
 * button.setGraphic(imgView);
*/

public class GUIdie extends Button{
	
	//Initial Creation of ImageView of the GUIdie, this will be changed later in the code.
    private ImageView currentDieSide = new ImageView();

    //Initallize all Images for the Dice 
    private Image side1 = new Image(getClass().getResourceAsStream("DiePics/Die1.jpg"));
    private Image side2 = new Image(getClass().getResourceAsStream("DiePics/Die2.jpg"));
    private Image side3 = new Image(getClass().getResourceAsStream("DiePics/Die3.jpg"));
    private Image side4 = new Image(getClass().getResourceAsStream("DiePics/Die4.jpg"));
    private Image side5 = new Image(getClass().getResourceAsStream("DiePics/Die5.jpg"));
    private Image side6 = new Image(getClass().getResourceAsStream("DiePics/Die6.jpg"));
    private Image side1L = new Image(getClass().getResourceAsStream("DiePics/Die1Locked.jpg"));
    private Image side2L = new Image(getClass().getResourceAsStream("DiePics/Die2Locked.jpg"));
    private Image side3L = new Image(getClass().getResourceAsStream("DiePics/Die3Locked.jpg"));
    private Image side4L = new Image(getClass().getResourceAsStream("DiePics/Die4Locked.jpg"));
    private Image side5L = new Image(getClass().getResourceAsStream("DiePics/Die5Locked.jpg"));
    private Image side6L = new Image(getClass().getResourceAsStream("DiePics/Die6Locked.jpg"));
    
    //Create ArrayLists to hold both unlocked and locked images. 
    private ArrayList<Image> unlockedDice = new ArrayList<Image>(6);
    private ArrayList<Image> lockedDice = new ArrayList<Image>(6);
    
    //Private Bool to see if GUIdie was locked or not. 
    private boolean locked;
    
    //Private Int that holds a numerical value of the dice. 
	private int currentValue;
	
	//Creates a random Object for use to use thoughout the program. 
	Random random = new Random();

	/**
	 * Constructor for a GUIdie.
	 * 
	 */
	public GUIdie() {
		
		//Ask Terry if you dont understand why we called super(); "Makes Button"
		super();
		
		//Initalized values to Unlocked and Generates a random side for die. 
		locked = false;
		currentValue = random.nextInt(1,7);

		//Adds all Unlocked images to an Array list for later use. 
	    unlockedDice.add(side1);
	    unlockedDice.add(side2);
	    unlockedDice.add(side3);
	    unlockedDice.add(side4);
	    unlockedDice.add(side5);
	    unlockedDice.add(side6);
	    
	    
	    //Generates and Array list of LOCKED imaged for later use. 
	    lockedDice.add(side1L);
	    lockedDice.add(side2L);
	    lockedDice.add(side3L);
	    lockedDice.add(side4L);
	    lockedDice.add(side5L);
	    lockedDice.add(side6L);
	    
	    //Sets the imageview created earlier to acually disply currentside of GUIdie. 
	    currentDieSide.setImage(unlockedDice.get(currentValue-1));
	    
	    //Sets Image of GUIdie and Sets event handler for button push. 
		this.setGraphic(currentDieSide);		
		this.setOnAction(this::processButtonPress);
		
	}
	
	/**
	 * Rolls only unlocked GUIdie
	 * 
	 */
	public void roll() {
		if (locked == true) {
			//DO NOTHING. 
		}
		else {
			currentValue = random.nextInt(1,7);
		    currentDieSide.setImage(unlockedDice.get(currentValue-1));
			this.setGraphic(currentDieSide);
		}
	}
	
	/*public void setSide() {
		This Was created initially in UML but not needed in our program. 
	}*/
	
	/**
	 * Gets the current side of the GUIdie
	 * 
	 * @return the current face value of the GUIdie
	 */
	public int getSide() {
		return currentValue;
	}
	
	/**
	 * Will force an unlock of a GUIdie.  Will be used when resetting dice for another roll. 
	 * 
	 */
	public void unlockDie() {
		locked = false;
		currentDieSide.setImage(unlockedDice.get(currentValue-1));
	    this.setGraphic(currentDieSide);
	}
	
	/**
	 * 
	 * Once a GUIdie is pressed this processButtonPress method will toggle the lock of the GUIdie.
	 * 
	 * @param event The action of the Button press for the GUIdie
	 */
	public void processButtonPress(ActionEvent event) {
		if(locked == false) {
			locked = true;
		    currentDieSide.setImage(lockedDice.get(currentValue-1));
		    //TODO REMEBER TO COMMENT OUT SYSTEM.OUT.PRINT
		    System.out.println("PUSHED BUTTON");
		    this.setGraphic(currentDieSide);
			
		}
		else {
			locked = false;
		    currentDieSide.setImage(unlockedDice.get(currentValue-1));
		    //TODO REMEBER TO COMMENT OUT SYSTEM.OUT.PRINT
		    System.out.println("UNPUSHED BUTTON");
		    this.setGraphic(currentDieSide);
		}
	}

}
