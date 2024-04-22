package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GUIdie extends Button{
	
	private String buttonText = "";
	
	//private Rectangle dieLockBox = new Rectangle();
	
	
	
    private Image baseImage;
    //private Image side1 = new Image(getClass().getResourceAsStream("DiePics/Die1.jpg"));
    private Image side2 = new Image(getClass().getResourceAsStream("DiePics/Die2.jpg"));
    private Image side3 = new Image(getClass().getResourceAsStream("DiePics/Die3.jpg"));
    private Image side4 = new Image(getClass().getResourceAsStream("DiePics/Die4.jpg"));
    private Image side5 = new Image(getClass().getResourceAsStream("DiePics/Die5.jpg"));
    private Image side6 = new Image(getClass().getResourceAsStream("DiePics/Die6.jpg"));
    private Image side1L = new Image(getClass().getResourceAsStream("DiePics/Die1Locked.jpeg"));
    private Image side2L = new Image(getClass().getResourceAsStream("DiePics/Die2Locked.jpg"));
    private Image side3L = new Image(getClass().getResourceAsStream("DiePics/Die3Locked.jpg"));
    private Image side4L = new Image(getClass().getResourceAsStream("DiePics/Die4Locked.jpg"));
    private Image side5L = new Image(getClass().getResourceAsStream("DiePics/Die5Locked.jpg"));
    private Image side6L = new Image(getClass().getResourceAsStream("DiePics/Die6Locked.jpg"));
    
    ImageView currentDieSide = new ImageView(baseImage);
    

    private boolean locked;
	private int currentValue;
	
	Random random = new Random();

	
	public GUIdie() {
		super();
		//this.getChildren().add(circle1);
		//circle1.setFill(Color.BLUE);
		
        this.setGraphic(currentDieSide);
        this.currentValue = 1;
		this.setOnAction(this::processButtonPress);
		
		baseImage = new Image(getClass().getResourceAsStream("DiePics/Die"+currentValue+".jpg"));
		
		locked = false;
		
		//FIXME As this roll() does not currently work as expected. 
		//this.roll();


        
            
		/* Image img = new Image(getClass().getResourceAsStream("search.png"));
        ImageView imgView = new ImageView(img);
        button.setGraphic(imgView);
        */

		
	}
	
	
	public int roll() {
		if (locked == true)
			return currentValue;
		else {
			currentValue = random.nextInt(1,7);
			Image img = new Image(getClass().getResourceAsStream("Die" + currentValue + ".jpg"));
		     ImageView imgView = new ImageView(img);
		     this.setGraphic(imgView);
		return currentValue;
		}
	}
	
	public void setSide() {
		
	}
	
	public void unlockDie() {
		locked = false;
		
	}
	
	public void processButtonPress(ActionEvent event) {
		if(locked == false) {
			locked = true;
			//dieLockBox.setFill(Color.CRIMSON);
			System.out.println("PUSHED BUTTON");
			baseImage.getClass().getResourceAsStream("DiePics/Die"+currentValue+".jpg");

			
			currentDieSide.setImage(baseImage);
			
		}
		else {
			locked = false;
			//dieLockBox.setFill(Color.TRANSPARENT);
			currentDieSide.setImage(side2);

		}
	}
	
	
	
	
	
	

	
	
	
	

}
