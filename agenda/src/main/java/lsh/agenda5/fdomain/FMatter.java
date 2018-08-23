package lsh.agenda5.fdomain;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class FMatter {
	private SimpleIntegerProperty matterId;
	private SimpleIntegerProperty parentMatterId;
	private SimpleIntegerProperty priorityOrder;
	private SimpleIntegerProperty matterLevel;
	private SimpleStringProperty matterName;
	private SimpleStringProperty createDateTime;
	private SimpleStringProperty lastUpdateDateTime;
	private SimpleStringProperty planBeginDateTime;
	private SimpleStringProperty planEndDateTime;
	private SimpleStringProperty realBeginDateTime;
	private SimpleStringProperty relaEndDateTime;
	private SimpleBooleanProperty finished;
	private SimpleIntegerProperty totalTaskAmount;
	private SimpleIntegerProperty remainingTaskAmount;
	
	
	public int getMatterId() {
		return matterId.get();
	}
	public void setMatterId(int matterId) {
		this.matterId = new SimpleIntegerProperty();
	}
	public int getParentMatterId() {
		return parentMatterId.get();
	}
	public void setParentMatterId(int parentMatterId) {
		this.parentMatterId = new SimpleIntegerProperty(parentMatterId);
	}
	public int getPriorityOrder() {
		return priorityOrder.get();
	}
	public void setPriorityOrder(int priorityOrder) {
		this.priorityOrder = new SimpleIntegerProperty(priorityOrder);
	}
	public int getMatterLevel() {
		return matterLevel.get();
	}
	public void setMatterLevel(int matterLevel) {
		this.matterLevel = new SimpleIntegerProperty(matterLevel);
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
	public boolean isFinished() {
		return finished.get();
	}
	public void setFinished(boolean finished) {
		this.finished = new SimpleBooleanProperty(finished);
	}
	public int getTotalTaskAmount() {
		return totalTaskAmount.get();
	}
	public void setTotalTaskAmount(int totalTaskAmount) {
		this.totalTaskAmount = new SimpleIntegerProperty(totalTaskAmount);
	}
	public int getRemainingTaskAmount() {
		return remainingTaskAmount.get();
	}
	public void setRemainingTaskAmount(int remainingTaskAmount) {
		this.remainingTaskAmount = new SimpleIntegerProperty(remainingTaskAmount);
	}
	
	

}
