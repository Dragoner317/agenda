package lsh.agenda1.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import lsh.agenda3.mymodule.MenuFactory;

public class TopMenuBar extends MenuBar{
	
	private static Menu file;
	private static Menu edit;
	private static Menu search;
	private static Menu help;
	
	private TopMenuBar() {}
	
	public static TopMenuBar newInstance() {
		String[] fileMenuItemNames = {"日计划","周计划","月度计划","季度计划","年度计划","人生计划"};
		String[] editMenuItemNames = {"撤销","恢复","剪切","粘贴","复制"};
		
		List<MenuItem> fileMenuItems = MenuFactory.getMenuItems(
				new ArrayList<MenuItem>(fileMenuItemNames.length), Arrays.asList(fileMenuItemNames));
		
		List<MenuItem> editMenuItems = MenuFactory.getMenuItems(
				new ArrayList<MenuItem>(editMenuItemNames.length), Arrays.asList(editMenuItemNames));
		
		
		TopMenuBar menuBar = new TopMenuBar();
		
		file = new Menu("计划");
		file.getItems().addAll(fileMenuItems);	
		
		edit = new Menu("编辑");
		edit.getItems().addAll(editMenuItems);
		
		menuBar.getMenus().addAll(file,edit);
		return menuBar;
	}

}
