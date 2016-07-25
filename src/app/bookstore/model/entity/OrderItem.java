package app.bookstore.model.entity;

public class OrderItem extends Entity {
	
	private int quantity;
	private Order order;
	private Book book;

	public OrderItem() {
		super(0);
		this.setQuantity(0);
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
		//order.addOrderItem(this);
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
