package app.bookstore.model.service;

import app.bookstore.model.entity.Order;

public class OrderServiceImpl extends ServiceSupport<Order> implements
		OrderService {

	@Override
	public void saveOrder(Order order) {
		this.getDao().save(order);

	}

}
