package lsh.agenda7.util;

import java.io.IOException;
import java.io.InputStream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import lsh.agenda1.ui.WorkStation;

public final class Translate {
	
	private Translate() {}
		
	public  static Node replaceSceneContent(Stage stage,String fxml) {
		FXMLLoader loader = new FXMLLoader();
		InputStream in = WorkStation.class.getResourceAsStream(fxml);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setLocation(WorkStation.class.getResource(fxml));
		BorderPane page = null;
		try {
			page = (BorderPane)loader.load(in);
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