package lsh.agenda3.mymodule;

import java.util.List;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class MenuFactory {	
	
	public static List<MenuItem> getMenuItems(List<MenuItem> arr, List<String> menuItemNames){
		for (String name : menuItemNames) {
			arr.add(new MenuItem(name));
		}
		return arr;
	}
	
	public static List<Menu> getMenus(List<Menu> arr, List<String> menuNames){
		for (String name : menuNames) {
			arr.add(new Menu(name));
		}
		return arr;
	}

}
