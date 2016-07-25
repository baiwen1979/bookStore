package app.bookstore.action;

import java.util.List;

import app.bookstore.model.entity.Book;
import app.bookstore.model.service.BookService;

public class BookAction extends GenericActionSupport<Book, BookService> {

	private static final long serialVersionUID = 1L;
	
	private long categoryId;
	private String keyword;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
		
	public List<Book> getBooks()
	{
		if (this.getKeyword() != null && !this.getKeyword().isEmpty()){
			return this.getService().searchBookFor(this.getKeyword());
		}
		if (this.getCategoryId() == 0) {
			return this.getService().getAllBooks();
		}
		return this.getService().getBooksByCategoryId(this.getCategoryId());
	}
	
}
