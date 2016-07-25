package app.bookstore.model.service;

import app.bookstore.model.dao.EntityDao;
import app.bookstore.model.entity.Book;
import app.bookstore.model.entity.Category;
import app.bookstore.model.entity.Order;
import app.bookstore.model.entity.User;
import app.bookstore.util.DateTimeHelper;

public class SystemServiceImpl extends ServiceSupport<User> implements
		SystemService {
	
	private EntityDao<Book> bookDao;
	private EntityDao<Category> categoryDao;
	private EntityDao<Order> orderDao;
	
	private String feedCode;
	
	public void setFeedCode(String code){
		this.feedCode = code;
	}
	
	public EntityDao<Book> getBookDao() {
		return bookDao;
	}

	public void setBookDao(EntityDao<Book> bookDao) {
		this.bookDao = bookDao;
	}

	public EntityDao<Category> getCategoryDao() {
		return categoryDao;
	}

	public void setCategoryDao(EntityDao<Category> categoryDao) {
		this.categoryDao = categoryDao;
	}

	public EntityDao<Order> getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(EntityDao<Order> orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public void feedSampleData(String feedCode) throws Exception{
		System.out.println(this.feedCode);
		if (feedCode.equals(this.feedCode))
		{
			addUsers();
			addCategoryAndBooks();
		}
		else 
		{
			throw new Exception("数据填充码不正确");
		}
	}
	
	private void addUsers()
	{
		//创建三个用户
		User user1 = new User("sa@bookstore.com","系统管理员","123456",'M',DateTimeHelper.getDateTimeFrom("1988-12-12"));
		User user2 = new User("zhangsan@bookstore.com","张三","123456",'M',DateTimeHelper.getDateTimeFrom("1982-02-14"));
		User user3 = new User("test@bookstore.com","测试用户","1234",'F',DateTimeHelper.getDateTimeFrom("1991-10-1-"));
		//保存用户
		this.getDao().save(user1);
		this.getDao().save(user2);
		this.getDao().save(user3);
		
	}
	
	private void addCategoryAndBooks()
	{
		//创建图书分类
		Category c1 = new Category("计算机","计算机专业图书");		
		Category c2 = new Category("少儿","关于少儿教育方面的图书");
		Category c3 = new Category("生活文化","关于生活与文化的图书");
		//保存图书分类
		this.getCategoryDao().save(c1);
		this.getCategoryDao().save(c2);
		this.getCategoryDao().save(c3);
		
		//创建"计算机"类图书
		Book book1 = new Book("Java程序设计", 29.5f, "book.png");
		book1.setCategory(c1);
		Book book2 = new Book("Java编程思想", 60.0f, "book.png");
		book2.setCategory(c1);
		Book book3 = new Book("Java设计模式", 45.0f, "book.png");
		book3.setCategory(c1);
		Book book4 = new Book("iOS应用开发", 66.0f, "book.png");
		book4.setCategory(c1);
		Book book5 = new Book("Head First PMP", 80.0f, "book.png");
		book5.setCategory(c1);
		
		//创建“少儿"类图书
		Book book6 = new Book("安徒生童话集", 29.5f, "book.png");
		book6.setCategory(c2);
		Book book7 = new Book("十四只老鼠去春游", 12.0f, "book.png");
		book7.setCategory(c2);
		Book book8 = new Book("Canimals 贴纸书", 15.0f, "book.png");
		book8.setCategory(c2);
		Book book9 = new Book("唐诗三百首", 30.0f, "book.png");
		book9.setCategory(c2);
		
		//创建”生活文化“类图书
		Book book10 = new Book("论语心得", 32.0f, "book.png");
		book10.setCategory(c3);
		Book book11 = new Book("家常菜100道", 60.0f, "book.png");
		book11.setCategory(c3);
		Book book12 = new Book("有病不能乱求医", 35.0f, "book.png");
		book12.setCategory(c3);
		
		//保存图书
		this.getBookDao().save(book1);
		this.getBookDao().save(book2);
		this.getBookDao().save(book3);
		this.getBookDao().save(book4);
		this.getBookDao().save(book5);
		this.getBookDao().save(book6);
		this.getBookDao().save(book7);
		this.getBookDao().save(book8);
		this.getBookDao().save(book9);
		this.getBookDao().save(book10);
		this.getBookDao().save(book11);
		this.getBookDao().save(book12);
		
	}
	
}
