package app.bookstore.model.service;

import java.util.List;

import app.bookstore.model.entity.Category;

public class CategoryServiceImpl extends ServiceSupport<Category> implements
		CategoryService {

	@Override
	public List<Category> getAllCategories() {
		return this.getDao().findAll();
	}

}
