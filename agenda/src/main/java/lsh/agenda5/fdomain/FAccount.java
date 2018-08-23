package lsh.agenda5.fdomain;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class FAccount {
	private SimpleIntegerProperty accountId;
	private SimpleStringProperty userName;
	private SimpleStringProperty password;
	private SimpleStringProperty email;
	private SimpleStringProperty targets;
	private SimpleIntegerProperty finisedTaskAmount;
	private SimpleIntegerProperty remamingTaskAmount;
	private SimpleIntegerProperty age;
	
	public int getAccountId() {
		return accountId.get();
	}
	public void setAccountId(int accountId) {
		this.accountId = new SimpleIntegerProperty(accountId);
	}
	public String getUserName() {
		return userName.get();
	}
	public void setUserName(String userName) {
		this.userName = new SimpleStringProperty(userName);
	}
	public String getPassword() {
		return password.get();
	}
	public void setPassword(String password) {
		this.password = new SimpleStringProperty(password);
	}
	public String getEmail() {
		return email.get();
	}
	public void setEmail(String email) {
		this.email = new SimpleStringProperty(email);
	}
	public SimpleStringProperty getTargets() {
		return targets;
	}
	public void setTargets(String targets) {
		this.targets = new SimpleStringProperty(targets);
	}
	public int getFinisedTaskAmount() {
		return finisedTaskAmount.get();
	}
	public void setFinisedTaskAmount(int finisedTaskAmount) {
		this.finisedTaskAmount = new SimpleIntegerProperty(finisedTaskAmount);
	}
	public int getRemamingTaskAmount() {
		return remamingTaskAmount.get();
	}
	public void setRemamingTaskAmount(int remamingTaskAmount) {
		this.remamingTaskAmount = new SimpleIntegerProperty(remamingTaskAmount);
	}
	public int getAge() {
		return age.get();
	}
	public void setAge(int age) {
		this.age = new SimpleIntegerProperty(age);
	}
	
	
}
