package lsh.agenda2.factory;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 * 
 * @desc
 *      美化工厂
 * @author 
 *      LSH
 * 2018年8月21日
 */
public class OptimizeFactory {

	public OptimizeFactory() {
	}
	
	public static GridPane optimizeGridPaneForIndexPage(GridPane gridPane) {
		gridPane.setMinSize(800, 400);
	    gridPane.setPadding(new Insets(10, 10, 10, 10)); 
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setStyle("-fx-background-color: BEIGE;"); 
		return gridPane;
	}
	
	public static Button optimizeButton(Button btn, String style) {
		btn.setStyle(style);
		return btn;
	}
}
