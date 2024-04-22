package application;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class GUIdie extends Button{
	
	private String buttonText = "";
	
	private Rectangle die = new Rectangle();
	private Circle dieDot = new Circle();
	Circle circle1 = new Circle(10);
	

	
	public GUIdie() {
		super();
		//this.getChildren().add(circle1);
		//circle1.setFill(Color.BLUE);
		
	    Image img = new Image(getClass().getResourceAsStream("Die1.jpg"));
        ImageView imgView = new ImageView(img);
        this.setGraphic(imgView);
        
            
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
	
	public GUIdie(String userText) {
		super(userText);
		buttonText = userText;
		
		this.getChildren().add(circle1);	
	}
	
	public void shake() {
		
	}
	
	
	
	
	
	

	
	
	
	

}
