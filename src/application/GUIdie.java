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
	
	private Rectangle dieLockBox = new Rectangle();
	
    private Image side1 = new Image(getClass().getResourceAsStream("Diepics/Die1.jpg"));
    private Image side2 = new Image(getClass().getResourceAsStream("Diepics/Die2.jpg"));
    private Image side3 = new Image(getClass().getResourceAsStream("Diepics/Die3.jpg"));
    private Image side4 = new Image(getClass().getResourceAsStream("Diepics/Die4.jpg"));
    private Image side5 = new Image(getClass().getResourceAsStream("Diepics/Die5.jpg"));
    private Image side6 = new Image(getClass().getResourceAsStream("Diepics/Die6.jpg"));

    private boolean locked;
	private int currentValue;
	Random random = new Random();

	
	public GUIdie() {
		super();
		//this.getChildren().add(circle1);
		//circle1.setFill(Color.BLUE);
		
        ImageView imgView = new ImageView(side3);
        this.setGraphic(imgView);
		this.setOnAction(this::processButtonPress);

        
            
		/* Image img = new Image(getClass().getResourceAsStream("search.png"));
        ImageView imgView = new ImageView(img);
        button.setGraphic(imgView);
        
        */       
		/* Image img = new Image(getClass().getResourceAsStream("search.png"));
        ImageView imgView = new ImageView(img);
        button.setGraphic(imgView);
        
        */       
		/* Image img = new Image(getClass().getResourceAsStream("search.png"));
        ImageView imgView = new ImageView(img);
        button.setGraphic(imgView);
        
        */       
		/* Image img = new Image(getClass().getResourceAsStream("search.png"));
        ImageView imgView = new ImageView(img);
        button.setGraphic(imgView);
        
        */       
		/* Image img = new Image(getClass().getResourceAsStream("search.png"));
        ImageView imgView = new ImageView(img);
        button.setGraphic(imgView);
        
        */

		
	}
	
	
	public void shake() {
		
	}
	
	public void processButtonPress(ActionEvent event) {
		if(locked == false) {
			locked = true;
			dieLockBox.setFill(Color.CRIMSON);
			System.out.println("PUSHED BUTTON");
		}
		else {
			locked = false;
			dieLockBox.setFill(Color.TRANSPARENT);
		}
	}
	
	
	
	
	
	

	
	
	
	

}
