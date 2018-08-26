package lsh.agenda1.ui;


import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;

public class IndexPageController extends BorderPane{
	private WorkStation app;
	
	@FXML
	private TreeView<String> leftPane;
	@FXML
	private TabPane centerPane;
	@FXML
	private MenuBar menuBar;
	
	
	@FXML
	void initialize() {
		System.out.println("FXML文件初始化完毕");
	}
	
	public void updateModuleSize(double newHeight) {
		if(leftPane != null) {
			leftPane.setPrefHeight(newHeight);
		}
	}

	public void setApp(WorkStation app) {
		this.app = app;
	}
	
	public void onclickAgendaCreate() {
		System.out.println("创建日程");
	}
	
	public void onclickAgendaLook() {
		System.out.println("查看日程");
	}
	
	public void onclickMemoCreate() {
		System.out.println("创建备忘录");
		TableView<Object> tableView = new TableView<Object>();
		TableColumn<Object,String> col1 = new TableColumn<>("备忘录顺序");
		TableColumn<Object,String> col2 = new TableColumn<>("备忘录创建时间");
		tableView.getColumns().addAll(col1,col2);
		Tab tab = new Tab();
		tab.setText("测试Tab");
		tab.setContent(tableView);
		SelectionModel<Tab> select = centerPane.getSelectionModel();
		centerPane.getTabs().add(tab);
		select.select(tab);
//		sp.getChildren().add(tableView);
//		this.setCenter(sp);
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
		System.out.println("查看知识");
	}
	
	public void onclickKnowledgeEdit() {
		System.out.println("编辑知识");		
	}
	
	
	public void onclickMemoConfig() {
		System.out.println("配置之配置备忘录模板");
		this.setCenter(null);
	}
}
