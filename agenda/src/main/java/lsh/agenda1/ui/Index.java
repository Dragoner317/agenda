package lsh.agenda1.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lsh.agenda2.factory.ModuleFactory;
import lsh.agenda3.mymodule.MyGridPane;

public class Index extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//step1:创建登录界面基本元素
		Text text1 = ModuleFactory.newText("账号：");
		Text text2 = ModuleFactory.newText("密码：");
		TextField tf = ModuleFactory.newTextField();
		PasswordField pf = ModuleFactory.newPasswordField();
		
		MyGridPane mgp = new MyGridPane();
		mgp.setMinSize(800, 400);
		mgp.setMGap(5, 5)
		   .setMPadding(5,5,5,5)
		   .setMStyle("-fx-background-color: BEIGE;")
		   .setMAlignment()
		   .addMNode(text1, 0, 0)
		   .addMNode(tf, 	1, 0)
		   .addMNode(text2, 0, 1)
		   .addMNode(pf, 	1, 1)
		   .addMNode(ModuleFactory.newButton("提交"), 0, 2)
		   .addMNode(ModuleFactory.newButton("清除"), 1, 2);
		
		//step2：创建Scene
		Scene scene = ModuleFactory.newScene(mgp);
		//step3：
		primaryStage.setTitle("登录");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
