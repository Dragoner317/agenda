package lsh.agenda1.ui;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * 
 * @desc
 *      计划事件录入界面
 * @author 
 *      LSH
 * 2018年8月23日
 */
public class TableViewOfMatterInput extends Application {
 
    private TableView<FMatter> table = new TableView<FMatter>();
    private final ObservableList<FMatter> data = FXCollections.observableArrayList();
    final HBox hb = new HBox();
 
    public static void main(String[] args) { 
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("计划事件安排");
        stage.setWidth(450);
        stage.setHeight(550);
 
        final Label label = new Label("计划事件列表");
        label.setFont(new Font("Arial", 20));
 
        table.setEditable(true);
        Callback<TableColumn<FMatter,String>, TableCell<FMatter,String>> cellFactory =
             new Callback<TableColumn<FMatter,String>, TableCell<FMatter,String>>() {
                 public TableCell<FMatter,String> call(TableColumn<FMatter,String> p) {
                    return new EditingCell();
                 }
             };

             final Button addButton = new Button("Add");
             TextField tf = null;
        HashMap<TextField,Method> tfArr = new HashMap<TextField,Method>();
        //获取到特定类的所有方法
        Method[] methods = FMatter.class.getDeclaredMethods();
        HashMap<String, Method> map = new HashMap<String,Method>();
        for (Method method : methods) {
        	if(method.getName().startsWith("set")) {//筛选出所有的set方法，并将参数名(也就是字段名)作为键、方法作为值，放入到HashMap中
        		String methodName = method.getName().replaceAll("set", "");
        		String key = methodName.substring(0,1).toLowerCase()+methodName.substring(1, methodName.length());
//        		System.out.println("key = "+key);
//        		System.out.println("methodName = "+method.getName());
        		map.put(key, method);//TODO
        	}
		}
        Field[] fields = FMatter.class.getDeclaredFields();
        int i = 0;
        for (i = 0; i < fields.length; i++) {
        	Field field = fields[i];
			TableColumn<FMatter,String> col = new TableColumn<>(field.getName());//以每个字段作为列名
			col.setMinWidth(100);
			col.setCellValueFactory(new PropertyValueFactory<FMatter,String>(field.getName()));
			col.setCellFactory(cellFactory);
			col.setOnEditCommit(new EventHandler<CellEditEvent<FMatter,String>>(){
				@Override
				public void handle(CellEditEvent<FMatter, String> event) {
					try {
						((Method)map.get(field.getName()))//根据字段名(其实就是方法参数名)，找到对应的set方法，然后通过反射调用set方法实现赋值
						.invoke
						(event.getTableView().getItems().get(event.getTablePosition().getRow()), event.getNewValue());
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				}				
			});
			table.getColumns().add(col);
			
			tf =  new TextField();
			tf.setPromptText(fields[i].getName());
			tf.setMaxWidth(col.getPrefWidth());
			hb.getChildren().add(tf);
//			System.out.println("field.getName() "+field.getName());
			
			tfArr.put(tf, (Method)map.get(field.getName()));
		}
 
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	System.out.println("button event");
            	FMatter matter = new FMatter();
            	Set<Entry<TextField,Method>> set = tfArr.entrySet();
            	for (Entry<TextField,Method> entry : set) {
					try {
//						System.out.println("entry.getValue() ==  "+(entry.getValue()));
						entry.getValue().invoke(matter, entry.getKey().getText());
						entry.getKey().clear();
					} catch (IllegalAccessException e1) {
						e1.printStackTrace();
					} catch (IllegalArgumentException e1) {
						e1.printStackTrace();
					} catch (InvocationTargetException e1) {
						e1.printStackTrace();
					}
				}
                data.add(matter);
            }
        });

        table.setItems(data);
        hb.getChildren().add(addButton);
        hb.setSpacing(3);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, hb);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
 
    public static class FMatter {
    	private SimpleStringProperty matterId;
    	private SimpleStringProperty parentMatterId;
    	private SimpleStringProperty priorityOrder;
    	private SimpleStringProperty matterLevel;
    	private SimpleStringProperty matterName;
    	private SimpleStringProperty createDateTime;
    	private SimpleStringProperty lastUpdateDateTime;
    	private SimpleStringProperty planBeginDateTime;
    	private SimpleStringProperty planEndDateTime;
    	private SimpleStringProperty realBeginDateTime;
    	private SimpleStringProperty relaEndDateTime;
    	private SimpleStringProperty finished;
    	private SimpleStringProperty totalTaskAmount;
    	private SimpleStringProperty remainingTaskAmount;
    	
    	public FMatter() {
		}
    	
    	public FMatter(String matterId,String parentMatterId,
    			String priorityOrder, String matterLevel, String matterName,
				String createDateTime, String lastUpdateDateTime,
				String planBeginDateTime, String planEndDateTime,
				String realBeginDateTime, String relaEndDateTime,
				String finished, String totalTaskAmount,
				String remainingTaskAmount) {
    		this.matterId = new SimpleStringProperty(matterId);
			this.parentMatterId = new SimpleStringProperty(parentMatterId);
			this.priorityOrder = new SimpleStringProperty(priorityOrder);
			this.matterLevel = new SimpleStringProperty(matterLevel);
			this.matterName = new SimpleStringProperty(matterName);
			this.createDateTime =  new SimpleStringProperty(createDateTime);
			this.lastUpdateDateTime = new SimpleStringProperty(lastUpdateDateTime);
			this.planBeginDateTime =  new SimpleStringProperty(planBeginDateTime);
			this.planEndDateTime = new SimpleStringProperty(planEndDateTime);
			this.realBeginDateTime = new SimpleStringProperty(realBeginDateTime);
			this.relaEndDateTime = new SimpleStringProperty(relaEndDateTime);
			this.finished = new SimpleStringProperty(finished);
			this.totalTaskAmount = new SimpleStringProperty(totalTaskAmount);
			this.remainingTaskAmount = new SimpleStringProperty(remainingTaskAmount);
		}
		public String getMatterId() {
    		return matterId.get();
    	}
    	public void setMatterId(String matterId) {
    		this.matterId = new SimpleStringProperty(matterId);
    	}
    	public String getParentMatterId() {
    		return parentMatterId.get();
    	}
    	public void setParentMatterId(String parentMatterId) {
    		this.parentMatterId = new SimpleStringProperty(parentMatterId);
    	}
    	public String getPriorityOrder() {
    		return priorityOrder.get();
    	}
    	public void setPriorityOrder(String priorityOrder) {
    		this.priorityOrder = new SimpleStringProperty(priorityOrder);
    	}
    	public String getMatterLevel() {
    		return matterLevel.get();
    	}
    	public void setMatterLevel(String matterLevel) {
    		this.matterLevel = new SimpleStringProperty(matterLevel);
    	}
    	public String getMatterName() {
    		return matterName.get();
    	}
    	public void setMatterName(String matterName) {
    		this.matterName = new SimpleStringProperty(matterName);
    	}
    	public String getCreateDateTime() {
    		return createDateTime.get();
    	}
    	public void setCreateDateTime(String createDateTime) {
    		this.createDateTime = new SimpleStringProperty(createDateTime);
    	}
    	public String getLastUpdateDateTime() {
    		return lastUpdateDateTime.get();
    	}
    	public void setLastUpdateDateTime(String lastUpdateDateTime) {
    		this.lastUpdateDateTime = new SimpleStringProperty(lastUpdateDateTime);
    	}
    	public String getPlanBeginDateTime() {
    		return planBeginDateTime.get();
    	}
    	public void setPlanBeginDateTime(String planBeginDateTime) {
    		this.planBeginDateTime = new SimpleStringProperty(planBeginDateTime);
    	}
    	public String getPlanEndDateTime() {
    		return planEndDateTime.get();
    	}
    	public void setPlanEndDateTime(String planEndDateTime) {
    		this.planEndDateTime = new SimpleStringProperty(planEndDateTime);
    	}
    	public String getRealBeginDateTime() {
    		return realBeginDateTime.get();
    	}
    	public void setRealBeginDateTime(String realBeginDateTime) {
    		this.realBeginDateTime = new SimpleStringProperty(realBeginDateTime);
    	}
    	public String getRelaEndDateTime() {
    		return relaEndDateTime.get();
    	}
    	public void setRelaEndDateTime(String relaEndDateTime) {
    		this.relaEndDateTime = new SimpleStringProperty(relaEndDateTime);
    	}
    	public String isFinished() {
    		return finished.get();
    	}
    	public void setFinished(String finished) {
    		this.finished = new SimpleStringProperty(finished);
    	}
    	public String getTotalTaskAmount() {
    		return totalTaskAmount.get();
    	}
    	public void setTotalTaskAmount(String totalTaskAmount) {
    		this.totalTaskAmount = new SimpleStringProperty(totalTaskAmount);
    	}
    	public String getRemainingTaskAmount() {
    		return remainingTaskAmount.get();
    	}
    	public void setRemainingTaskAmount(String remainingTaskAmount) {
    		this.remainingTaskAmount = new SimpleStringProperty(remainingTaskAmount);
    	}
    	
    	

    }

 
    class EditingCell extends TableCell<FMatter, String> {
 
        private TextField textField;
 
        public EditingCell() {
        }
 
        @Override
        public void startEdit() {
            if (!isEmpty()) {
                super.startEdit();
                createTextField();
                setText(null);
                setGraphic(textField);
                textField.selectAll();
            }
        }
 
        @Override
        public void cancelEdit() {
            super.cancelEdit();
 
            setText((String) getItem());
            setGraphic(null);
        }
 
        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
 
            if (empty) {
                setText(null);
                setGraphic(null);
            } else {
                if (isEditing()) {
                    if (textField != null) {
                        textField.setText(getString());
                    }
                    setText(null);
                    setGraphic(textField);
                } else {
                    setText(getString());
                    setGraphic(null);
                }
            }
        }
 
        private void createTextField() {
            textField = new TextField(getString());
            textField.setMinWidth(this.getWidth() - this.getGraphicTextGap()* 2);
            textField.focusedProperty().addListener(new ChangeListener<Boolean>(){
                @Override
                public void changed(ObservableValue<? extends Boolean> arg0, 
                    Boolean arg1, Boolean arg2) {
                        if (!arg2) {
                            commitEdit(textField.getText());
                        }
                }
            });
        }
 
        private String getString() {
            return getItem() == null ? "" : getItem().toString();
        }
    }
}