package app.bookstore.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import app.bookstore.model.entity.Book;
import app.bookstore.model.entity.OrderItem;

public class ShoppingCart {

	protected Map<Long,OrderItem> items;
	
	public ShoppingCart() {
		if (items == null) {
			items = new HashMap<Long, OrderItem>();
		}
	}
	
	/**
	 * 添加图书到购物车
	 * @param book 要添加到购物车的图书
	 * @param quantity 数量（必须大于0）
	 */
	public void addBook(Book book, int quantity) {
		if (quantity <= 0) return;
		//如果购物车里已经存在该图书，则增加该图书订单项的数量
		if (items.containsKey(book.getId())){
			OrderItem item = items.get(book.getId());
			item.setQuantity(item.getQuantity() + quantity);
		}
		else {  //否则，添加新的订单项
			OrderItem newItem = new OrderItem();
			newItem.setBook(book);
			newItem.setQuantity(quantity);
			items.put(book.getId(), newItem);
		}
	}
	
	/**
	 * 根据图书id更新购物车中相应订单项的数量
	 * @param bookId 图书Id
	 * @param quantity 新的数量（必须大于0)
	 */
	public void updateQuantity(long bookId, int quantity) {
		if (quantity <= 0) return;
		if (items.containsKey(bookId)){
			OrderItem item = items.get(bookId);
			item.setQuantity(quantity);
		}
	}
	
	/**
	 * 从购物车中删除指定id的图书
	 * @param bookId 要删除的图书Id
	 */
	public void removeBook(long bookId) {
		items.remove(bookId);
	}
	
	/**
	 * 返回购物车所有图书订单项的总价格
	 * @return 总价格
	 */
	public float getTotalPrice(){
		float totalPrice = 0;
		for (OrderItem item : items.values()){
			Book book = item.getBook();
			totalPrice += book.getPrice() * item.getQuantity();
		}
		return totalPrice;
	}
	
	/**
	 * 返回购物车中所有图书的订单项
	 * @return 订单项的数组
	 */
	public Set<OrderItem> getOrderItems()
	{
		return new HashSet<OrderItem>(items.values());
	}
	
	/**
	 * 清空购物车
	 */
	public void clear() {
		items.clear();
	}
	
}
