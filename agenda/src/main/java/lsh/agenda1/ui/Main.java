package lsh.agenda1.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
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

	    StackPane sp = new StackPane();
	    sp.setMinWidth(300);
	    bp.setLeft(sp);

//	    GridPane centerGp = new GridPane();
//	    bp.setCenter(centerGp);
	    
	    MyTable tableView = new MyTable();
	    final VBox vbox = new VBox();
	    
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        final Label label = new Label("计划录入界面");
        label.setFont(new Font("Arial", 20));
        vbox.getChildren().addAll(label, tableView);
        bp.setCenter(vbox);

//	    GridPane rightGp = new GridPane();
        Button rightGp = new Button("右边");
	    bp.setRight(rightGp);

//	    Button btnBottom = new Button("Bottom");
//	    bp.setBottom(btnBottom);

	    Scene scene = new Scene(bp, 800, 400);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	  }
	}