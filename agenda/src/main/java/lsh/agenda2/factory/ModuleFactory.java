package lsh.agenda2.factory;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 * 
 * @desc
 *      原始组件工厂
 * @author 
 *      LSH
 * 2018年8月21日
 */
public class ModuleFactory {
	
	private ModuleFactory() {}
	
	public static Text newText(String text) {
		return new Text(text);
	}
	
	public static Button newButton(String btnName) {
		return new Button(btnName);
	}
	
	public static TextField newTextField() {
		return new TextField();
	}
	
	public static PasswordField newPasswordField() {
		return new PasswordField();
	}
	
	public static GridPane newGridPane() {
		return new GridPane();
	}
	
	public static Scene newScene(GridPane pane) {
		return new Scene(pane);
	}

}
