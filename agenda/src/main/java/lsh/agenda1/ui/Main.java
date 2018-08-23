package lsh.agenda1.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lsh.agenda3.mymodule.MyTable;

public class Main extends Application {
	  public static void main(String[] args) {
	    Application.launch(args);
	  }

	  @Override
	  public void start(Stage primaryStage) {
	    primaryStage.setTitle("日程管理");
	    BorderPane bp = new BorderPane();

	    TopMenuBar mb = TopMenuBar.newInstance();
	    bp.setTop(mb);
	    
	    MyTable tableView = new MyTable();
	    final VBox vbox = new VBox();
	    
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(tableView);
        bp.setCenter(vbox);

	    Scene scene = new Scene(bp, 800, 400);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	  }
	}