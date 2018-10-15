package com.sowmya.web2.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class OrderDaoImpl implements OrderDao
{
	@Autowired
	SessionFactory sessionfactory;
	@Override
	public boolean deleteOrder(String cartUser) 
	{
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("delete Cart where cartUser=:cu");
		query.setParameter("cu", cartUser);
		query.executeUpdate();
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
		return true;
	}

}
