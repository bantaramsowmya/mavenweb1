package com.sowmya.web2.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sowmya.web2.model.Product;
@Component
@Repository
public class ProductDaoImpl implements ProductDao
{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean insert(Product product) 
	{
		Session session=sessionFactory.openSession();
		
		session.save(product);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
		return false;
		
	}


	@Override
	public List getAllProducts() {
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("from Product");
	List productList=query.list();
	session.close();
		return productList;	
	}
	@Override
	public boolean deleteProduct(int productId) 
	{
		try
		{
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.delete(product);
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
	public Product editProduct(int productId) 
	{
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.close();
		return product;
	}


	@Override
	public Product showMoreDetails(int productId) {
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.close();
		return product;
	}

}
