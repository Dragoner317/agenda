package lsh.agenda6.domain;

import java.util.Date;

public class Memo {
	//备忘录ID
	private int memoId;
	//内容发出者
	private String sender;
	//内容接受者(处理者)
	private String processor;
	//创建时间
	private Date createDateTime;
	//是否提醒我
	private boolean remindMe;
	//提醒时间
	private Date remindDateTime;
	//过多久提醒我
	private long seconds;
	//是否做好准备
	private boolean ready;

}
