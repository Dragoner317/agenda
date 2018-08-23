package lsh.agenda6.domain;

import java.util.Date;

public class Task {
	private int id;
	private int order;
	private int matterId;//必定是一级事件
	private String taskName; 
	private Date createDateTime;
	private Date lastUpdateTime;
	private Date planBeginDateTime;
	private Date planFinishDateTime;
	private Date realBeginDateTime;
	private Date realFinishDateTime;
	private boolean isFinished;
	private String growUpType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public int getMatterId() {
		return matterId;
	}
	public void setMatterId(int matterId) {
		this.matterId = matterId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getPlanBeginDateTime() {
		return planBeginDateTime;
	}
	public void setPlanBeginDateTime(Date planBeginDateTime) {
		this.planBeginDateTime = planBeginDateTime;
	}
	public Date getPlanFinishDateTime() {
		return planFinishDateTime;
	}
	public void setPlanFinishDateTime(Date planFinishDateTime) {
		this.planFinishDateTime = planFinishDateTime;
	}
	public Date getRealBeginDateTime() {
		return realBeginDateTime;
	}
	public void setRealBeginDateTime(Date realBeginDateTime) {
		this.realBeginDateTime = realBeginDateTime;
	}
	public Date getRealFinishDateTime() {
		return realFinishDateTime;
	}
	public void setRealFinishDateTime(Date realFinishDateTime) {
		this.realFinishDateTime = realFinishDateTime;
	}
	public boolean isFinished() {
		return isFinished;
	}
	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	public String getGrowUpType() {
		return growUpType;
	}
	public void setGrowUpType(String growUpType) {
		this.growUpType = growUpType;
	}
	

}
