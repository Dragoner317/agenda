package lsh.agenda5.fdomain;

import javafx.beans.property.SimpleStringProperty;

public class FMemo {
	//备忘录ID
		private SimpleStringProperty memoId;
		//内容发出者
		private SimpleStringProperty sender;
		//内容接受者(处理者)
		private SimpleStringProperty processor;
		//创建时间
		private SimpleStringProperty createDateTime;
		//是否提醒我
		private SimpleStringProperty remindMe;
		//提醒时间
		private SimpleStringProperty remindDateTime;
		//过多久提醒我
		private SimpleStringProperty seconds;
		//是否做好准备
		private SimpleStringProperty ready;
				
		public String getMemoId() {
			return memoId.get();
		}
		public void setMemoId(String memoId) {
			this.memoId = new SimpleStringProperty(memoId);
		}
		public String getSender() {
			return sender.get();
		}
		public void setSender(String sender) {
			this.sender = new SimpleStringProperty(sender);
		}
		public String getProcessor() {
			return processor.get();
		}
		public void setProcessor(String processor) {
			this.processor = new SimpleStringProperty(processor);
		}
		public String getCreateDateTime() {
			return createDateTime.get();
		}
		public void setCreateDateTime(String createDateTime) {
			this.createDateTime = new SimpleStringProperty(createDateTime);
		}
		public String isRemindMe() {
			return remindMe.get();
		}
		public void setRemindMe(String remindMe) {
			this.remindMe = new SimpleStringProperty(remindMe);
		}
		public String getRemindDateTime() {
			return remindDateTime.get();
		}
		public void setRemindDateTime(String remindDateTime) {
			this.remindDateTime = new SimpleStringProperty(remindDateTime);
		}
		public String getSeconds() {
			return seconds.get();
		}
		public void setSeconds(String seconds) {
			this.seconds = new SimpleStringProperty(seconds);
		}
		public String isReady() {
			return ready.get();
		}
		public void setReady(String ready) {
			this.ready = new SimpleStringProperty(ready);
		}

		
}
