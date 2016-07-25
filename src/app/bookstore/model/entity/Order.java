package app.bookstore.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Order extends Entity {

	private User user;
	private float totalPrice;
	private Set<OrderItem> orderItems;
	
	public Order() {
		super(0);
		this.setOrderItems(new HashSet<OrderItem>());
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public float getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public void addOrderItem(OrderItem item) {
		item.setOrder(this);
		this.getOrderItems().add(item);
	}

	protected void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	
}
