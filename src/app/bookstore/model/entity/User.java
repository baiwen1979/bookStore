package app.bookstore.model.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User extends Entity{
	
	private String loginId;
	private String name;
	private String password;
	private char sex;
	private Date birthday;
	private int loginTimes;
	private Date lastLoginDate;
	private Set<Order> orders;
	
	public User() {
		super(0);
		this.setOrders(new HashSet<Order>());
		this.setLoginTimes(0);
		this.setLastLoginDate(Calendar.getInstance().getTime());
	}
	
	public User(String loginId, String name, String password, char sex, Date birthday){
		this();
		this.setLoginId(loginId);
		this.setName(name);
		this.setPassword(password);
		this.setSex(sex);
		this.setBirthday(birthday);
	}
	
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public int getLoginTimes() {
		return loginTimes;
	}

	public void setLoginTimes(int loginTimes) {
		this.loginTimes = loginTimes;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Set<Order> getOrders() {
		return this.orders;
	}
	
	public void addOrder(Order order){
		order.setUser(this);
		this.getOrders().add(order);
	}
	
	protected void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}
