package lsh.agenda1.ui;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import lsh.agenda7.util.Translate;

public class WorkStation extends Application{
	private Stage stage;
	private static final double MIN_WINDOW_WIDTH = 400.0;
	private static final double MIN_WINDOW_HEIGHT= 600.0;
	
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		stage.setMinWidth(MIN_WINDOW_WIDTH);
		stage.setMinHeight(MIN_WINDOW_HEIGHT);
		stage.setTitle("工作台");      
		gotoMainPage();
		stage.show();
	}
	
	private void gotoMainPage() {
		IndexPageController ipc = (IndexPageController)Translate.replaceSceneContent(stage,"indexPage.fxml");
		ipc.setApp(this);
		stage.heightProperty().addListener(new ChangeListener<Number>() {			
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				ipc.updateModuleSize((double)newValue);
			}
		});
	}
	
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}

}
