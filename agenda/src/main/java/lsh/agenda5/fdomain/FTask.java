package lsh.agenda5.fdomain;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class FTask {
	private SimpleIntegerProperty id;
	private SimpleIntegerProperty priorityOrder;//任务的优先级顺序
	private SimpleIntegerProperty matterId;//必定是一级事件
	private SimpleStringProperty taskName; 
	private SimpleStringProperty createDateTime;
	private SimpleStringProperty lastUpdateTime;
	private SimpleStringProperty planBeginDateTime;
	private SimpleStringProperty planFinishDateTime;
	private SimpleStringProperty realBeginDateTime;
	private SimpleStringProperty realFinishDateTime;
	private SimpleBooleanProperty isFinished;
	private SimpleStringProperty growUpType;
	
	public SimpleIntegerProperty getId() {
		return id;
	}
	public void setId(int id) {
		this.id = new SimpleIntegerProperty(id);
	}
	public int getPriorityOrder() {
		return priorityOrder.get();
	}
	public void setOrder(int priorityOrder) {
		this.priorityOrder = new SimpleIntegerProperty(priorityOrder);
	}
	public int getMatterId() {
		return matterId.get();
	}
	public void setMatterId(int matterId) {
		this.matterId = new SimpleIntegerProperty(matterId);
	}
	public String getTaskName() {
		return taskName.get();
	}
	public void setTaskName(String taskName) {
		this.taskName = new SimpleStringProperty(taskName);
	}
	public String getCreateDateTime() {
		return createDateTime.get();
	}
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = new SimpleStringProperty(createDateTime);
	}
	public String getLastUpdateTime() {
		return lastUpdateTime.get();
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = new SimpleStringProperty(lastUpdateTime);
	}
	public String getPlanBeginDateTime() {
		return planBeginDateTime.get();
	}
	public void setPlanBeginDateTime(String planBeginDateTime) {
		this.planBeginDateTime = new SimpleStringProperty(planBeginDateTime);
	}
	public String getPlanFinishDateTime() {
		return planFinishDateTime.get();
	}
	public void setPlanFinishDateTime(String planFinishDateTime) {
		this.planFinishDateTime = new SimpleStringProperty(planFinishDateTime);
	}
	public String getRealBeginDateTime() {
		return realBeginDateTime.get();
	}
	public void setRealBeginDateTime(String realBeginDateTime) {
		this.realBeginDateTime = new SimpleStringProperty(realBeginDateTime);
	}
	public String getRealFinishDateTime() {
		return realFinishDateTime.get();
	}
	public void setRealFinishDateTime(String realFinishDateTime) {
		this.realFinishDateTime = new SimpleStringProperty(realFinishDateTime);
	}
	public boolean getIsFinished() {
		return isFinished.get();
	}
	public void setIsFinished(boolean isFinished) {
		this.isFinished = new SimpleBooleanProperty(isFinished);
	}
	public String getGrowUpType() {
		return growUpType.get();
	}
	public void setGrowUpType(String growUpType) {
		this.growUpType = new SimpleStringProperty(growUpType);
	}
	
	

}
