package app.bookstore.action;

import java.util.List;

import app.bookstore.model.entity.Category;
import app.bookstore.model.service.CategoryService;

public class CategoryAction extends
		GenericActionSupport<Category, CategoryService> {

	private static final long serialVersionUID = 1L;
	
	public List<Category> getCategories(){
		return this.getService().getAllCategories();
	}

}
