package lsh.agenda1.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PersonalizedDialog extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("memoDialog.fxml"));
		Parent root = (Parent)loader.load();

		//Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));        
		Scene scene = new Scene(root);        
		stage.setScene(scene);
		stage.show();

//		MemoDialogController controller = (MemoDialogController)loader.getController();
//		controller.setStageAndSetupListeners(stage); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
