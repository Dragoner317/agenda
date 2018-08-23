package lsh.agenda6.domain;

public class Account {
	private int accountId;
	private String userName;
	private String password;
	private String email;
	private String targets;
	private int finisedTaskAmount;
	private int remamingTaskAmount;
	private int age;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTargets() {
		return targets;
	}
	public void setTargets(String targets) {
		this.targets = targets;
	}
	public int getFinisedTaskAmount() {
		return finisedTaskAmount;
	}
	public void setFinisedTaskAmount(int finisedTaskAmount) {
		this.finisedTaskAmount = finisedTaskAmount;
	}
	public int getRemamingTaskAmount() {
		return remamingTaskAmount;
	}
	public void setRemamingTaskAmount(int remamingTaskAmount) {
		this.remamingTaskAmount = remamingTaskAmount;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", userName=" + userName + ", password=" + password + ", email="
				+ email + ", targets=" + targets + ", finisedTaskAmount=" + finisedTaskAmount + ", remamingTaskAmount="
				+ remamingTaskAmount + ", age=" + age + "]";
	}
	
	

}
