package lsh.agenda6.domain;

import java.util.Date;

public class Matter {
	private int matterId;
	private int parentMatterId;
	private int priorityOrder;
	private int matterLevel;
	private String matterName;
	private Date createDateTime;
	private Date lastUpdateDateTime;
	private Date planBeginDateTime;
	private Date planEndDateTime;
	private Date realBeginDateTime;
	private Date relaEndDateTime;
	private boolean isFinished;
	private int totalTaskAmount;
	private int remainingTaskAmount;
	
	
	public int getMatterId() {
		return matterId;
	}
	public void setMatterId(int matterId) {
		this.matterId = matterId;
	}
	public int getParentMatterId() {
		return parentMatterId;
	}
	public void setParentMatterId(int parentMatterId) {
		this.parentMatterId = parentMatterId;
	}
	public int getPriorityOrder() {
		return priorityOrder;
	}
	public void setPriorityOrder(int priorityOrder) {
		this.priorityOrder = priorityOrder;
	}
	public int getMatterLevel() {
		return matterLevel;
	}
	public void setMatterLevel(int matterLevel) {
		this.matterLevel = matterLevel;
	}
	public String getMatterName() {
		return matterName;
	}
	public void setMatterName(String matterName) {
		this.matterName = matterName;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public Date getLastUpdateDateTime() {
		return lastUpdateDateTime;
	}
	public void setLastUpdateDateTime(Date lastUpdateDateTime) {
		this.lastUpdateDateTime = lastUpdateDateTime;
	}
	public Date getPlanBeginDateTime() {
		return planBeginDateTime;
	}
	public void setPlanBeginDateTime(Date planBeginDateTime) {
		this.planBeginDateTime = planBeginDateTime;
	}
	public Date getPlanEndDateTime() {
		return planEndDateTime;
	}
	public void setPlanEndDateTime(Date planEndDateTime) {
		this.planEndDateTime = planEndDateTime;
	}
	public Date getRealBeginDateTime() {
		return realBeginDateTime;
	}
	public void setRealBeginDateTime(Date realBeginDateTime) {
		this.realBeginDateTime = realBeginDateTime;
	}
	public Date getRelaEndDateTime() {
		return relaEndDateTime;
	}
	public void setRelaEndDateTime(Date relaEndDateTime) {
		this.relaEndDateTime = relaEndDateTime;
	}
	public boolean isFinished() {
		return isFinished;
	}
	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	public int getTotalTaskAmount() {
		return totalTaskAmount;
	}
	public void setTotalTaskAmount(int totalTaskAmount) {
		this.totalTaskAmount = totalTaskAmount;
	}
	public int getRemainingTaskAmount() {
		return remainingTaskAmount;
	}
	public void setRemainingTaskAmount(int remainingTaskAmount) {
		this.remainingTaskAmount = remainingTaskAmount;
	}
	
	

}
