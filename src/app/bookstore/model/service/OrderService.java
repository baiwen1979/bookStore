package app.bookstore.model.service;

import app.bookstore.model.entity.Order;

public interface OrderService {

	/**
	 * 保存订单
	 * @param order 要保存的订单对象
	 */
	public void saveOrder(Order order);
}
