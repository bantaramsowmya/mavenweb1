package com.sowmya.web2.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sowmya.web2.model.Category;
@Component
@Repository
public class CategoryDaoImpl implements CategoryDao
{
@Autowired
SessionFactory sessionFactory;
	@Override
	public boolean insert(Category category) 
	{
		Session session=sessionFactory.openSession();
		category.setCategoryId((int)(Math.random()*100000));
		session.save(category);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return false;
	}
	@Override
	public List getAllCategory() {
		Session session=sessionFactory.openSession();
	Query query=session.createQuery("from Category");
	List categoryList=query.list();
		return categoryList;
	}
	@Override
	public boolean deleteCategory(int categoryId) 
	{
		try
		{
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class, categoryId);
        session.delete(category);
	Transaction transaction=session.beginTransaction();
	transaction.commit();
	session.close();
	return true;
		}
		catch (Exception e) {
			return false;
		}

	}
	@Override
	public Category editCategory(int categoryId) {
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class, categoryId);
		return category;
	}

}
