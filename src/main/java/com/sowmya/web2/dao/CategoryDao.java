package com.sowmya.web2.dao;

import java.util.List;

import com.sowmya.web2.model.Category;


public interface CategoryDao 
{
boolean insert(Category category);
List getAllCategory();
boolean deleteCategory(int categoryId);
Category editCategory(int categoryId);
}
