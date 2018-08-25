package lsh.agenda1.ui.controller;


import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import lsh.agenda1.ui.MainPage;

public class IndexPageController extends AnchorPane{
	private MainPage application;
	@FXML
	private AnchorPane anchorPane;
	
	@FXML
	private MenuBar menuBar;
	
	@FXML
	void initialize() {
		System.out.println("FXML文件初始化完毕");
	}

	public void setApp(MainPage app) {
		this.application = app;
	}
	
	public MenuBar getMenuBar() {
		return menuBar;
	}
	
	public void onclickAgendaCreate() {
		
	}
	
	public void onclickAgendaLook() {
		
	}
	
	public void onclickMemoCreate() {
		
	}
	
	public void onclickMemoLook() {}
	
	public void onclickMatterCreate() {}
	
	public void onclickMatterLook() {}
	
	public void onclickKnowledgeLook() {
		System.out.println("show me a knowledge classify table");
	}
	
	public void onclickKnowledgeEdit() {
		System.out.println("edit a knowledge file");
	}
}
