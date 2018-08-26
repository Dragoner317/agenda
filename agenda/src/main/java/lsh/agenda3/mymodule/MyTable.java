package lsh.agenda3.mymodule;

import java.util.HashMap;
import java.util.Map;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MyTable extends TableView{
	
	private static String[] property = {"事件序号","事件名称","计划开始日期","计划完成日期","真实开始日期","真实完成日期"};
	
	public MyTable() {
		super(generateDataInMap());
		TableColumn<Map, String> matterOrder = new TableColumn<>("事件序号");
        TableColumn<Map, String> matterName = new TableColumn<>("事件名称");
        TableColumn<Map, String> planStartDate = new TableColumn<>("计划开始日期");
        TableColumn<Map, String> planFinishDate = new TableColumn<>("计划完成日期");
        TableColumn<Map, String> realStartDate = new TableColumn<>("真实开始日期");
        TableColumn<Map, String> realFinishDate = new TableColumn<>("真实完成日期");
        
        setEditable(true);
        getSelectionModel().setCellSelectionEnabled(true);
        getColumns().setAll(matterOrder, matterName,planStartDate,planFinishDate,realStartDate,realFinishDate);
                        
	}
	
	 private static ObservableList<Map> generateDataInMap() {
	        int max = 10;
	        ObservableList<Map> allData = FXCollections.observableArrayList();
	        for (int i = 1; i < max; i++) {
	            Map<String, String> dataRow = new HashMap<>();
	 
	            String value1 = "A" + i;
	            String value2 = "B" + i;
	 
	            dataRow.put(property[0], value1);
	            dataRow.put(property[1], value2);
	            dataRow.put(property[2], value2);
	            dataRow.put(property[3], value2);
	            dataRow.put(property[4], value2);
	            dataRow.put(property[5], value2);
	 
	            allData.add(dataRow);
	        }
	        return allData;
	    }

}
