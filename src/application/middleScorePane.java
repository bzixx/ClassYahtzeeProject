package application;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class middleScorePane extends Pane{
	
	public middleScorePane() {
		this.setMinWidth(333);
		this.setMinHeight(562);
		
		this.setStyle("-fx-background-color: Green;");	
		
		TextArea upperTextArea = new TextArea();
		TextArea lowerTextArea = new TextArea();
	}

}
