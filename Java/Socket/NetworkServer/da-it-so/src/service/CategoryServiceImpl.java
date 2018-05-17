package service;

import java.util.List;

import dto.Category;

public interface CategoryServiceImpl {
	public List<Category> getAllCategories(int state);

	public Category categorySearchName(int category_id);
}
