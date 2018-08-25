package lsh.agenda1.ui;

import java.io.IOException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lsh.agenda1.ui.controller.IndexPageController;

public class MainPage extends Application{
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
		stage.setTitle("自我管理控制台");      
		gotoMainPage();
		stage.show();
	}
	
	private void gotoMainPage() {
		IndexPageController ipc = (IndexPageController)replaceSceneContent("indexPage.fxml");
		ipc.setApp(this);
		stage.widthProperty().addListener(new ChangeListener<Number>() {
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				ipc.getMenuBar().setPrefWidth((double)newValue);
			}
		});
	}
	
	private Node replaceSceneContent(String fxml) {
		FXMLLoader loader = new FXMLLoader();
		InputStream in = MainPage.class.getResourceAsStream(fxml);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setLocation(MainPage.class.getResource(fxml));
		AnchorPane page = null;
		try {
			page = (AnchorPane)loader.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		double stageWidth = stage.getWidth();
		if(!Double.isNaN(stageWidth)) {
			stageWidth -= (stage.getWidth() - stage.getScene().getWidth());
		}
		
		double stageHeight = stage.getHeight();
		if(!Double.isNaN(stageHeight)) {
			stageHeight -= (stage.getHeight() - stage.getScene().getHeight());
		}
		
		Scene scene = new Scene(page);
		if(!Double.isNaN(stageWidth)) {
			page.setPrefWidth(stageWidth);
		}
		
		if(!Double.isNaN(stageHeight)) {
			page.setPrefHeight(stageHeight);
		}
		
		stage.setScene(scene);
		stage.sizeToScene();
		return (Node)loader.getController();
	}

}
