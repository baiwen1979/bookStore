package app.bookstore.model.service;

import java.util.ArrayList;
import java.util.List;

import app.bookstore.model.entity.Book;

public class BookServiceImpl extends ServiceSupport<Book> implements
		BookService {

	@Override
	public Book getBook(long id) {
		return this.getDao().get(id);
	}

	@Override
	public List<Book> getBooksByCategoryId(long id) {
		return this.getDao().findBy("category.id", id);
	}

	@Override
	public List<Book> getAllBooks() {
		return this.getDao().findAll();
	}

	@Override
	public List<Book> searchBookFor(String keyword) {
		List<Book> resultBooks = new ArrayList<Book>();
		List<Book> allBooks = this.getAllBooks();
		for (Book book : allBooks){
			if (book.getName().contains(keyword) || 
				book.getCategory().getName().contains(keyword) || 
				book.getCategory().getDescription().contains(keyword)) {
				resultBooks.add(book);
			}
		}
		return resultBooks;
	}

}
