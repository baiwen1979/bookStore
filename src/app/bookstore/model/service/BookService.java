package app.bookstore.model.service;

import java.util.List;

import app.bookstore.model.entity.Book;

public interface BookService {

	/**
	 * 返回指定id的图书
	 * @param id 图书Id
	 * @return 指定的图书对象
	 */
	public Book getBook(long id);
	
	/**
	 * 返回指定图书分类id下的所有图书
	 * @param id 分类Id
	 * @return 指定分类下的所有图书的列表
	 */
	public List<Book> getBooksByCategoryId(long id);
	
	/**
	 * 返回所有图书
	 * @return 所有图书的列表
	 */
	public List<Book> getAllBooks();
	
	/**
	 * 搜索包含指定关键字的图书
	 * @param keyword 关键字
	 * @return 包含关键字的图书列表
	 */
	public List<Book> searchBookFor(String keyword);
	
}
