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
		System.out.println("创建日程");
	}
	
	public void onclickAgendaLook() {
		
	}
	
	public void onclickMemoCreate() {
		System.out.println("创建备忘录");
	}
	
	public void onclickMemoLook() {
		System.out.println("查看备忘录");
	}
	
	public void onclickMatterCreate() {
		System.out.println("创建事情");
	}
	
	public void onclickMatterLook() {
		System.out.println("查看事情");
	}
	
	public void onclickKnowledgeLook() {
		System.out.println("show me a knowledge classify table");
	}
	
	public void onclickKnowledgeEdit() {
		System.out.println("edit a knowledge file");
	}
}
