package app.bookstore.model.service;

import java.util.List;
import app.bookstore.model.entity.Category;

public interface CategoryService {

	/**
	 * 返回所有的图书分类
	 * @return 图书分类的列表
	 */
	List<Category> getAllCategories();
}
