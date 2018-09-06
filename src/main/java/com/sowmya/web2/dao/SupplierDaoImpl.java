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
import com.sowmya.web2.model.Supplier;
@Component
@Repository
public class SupplierDaoImpl implements SupplierDao
{
@Autowired
SessionFactory sessionFactory;
	@Override
	public boolean insert(Supplier supplier) {
		Session session=sessionFactory.openSession();
		supplier.setSupplierId((int)(Math.random()*100000));
		session.save(supplier);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return false;
	}
	@Override
	public List getAllSupplies() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Supplier");
		List supplierList=query.list();

		return supplierList;
	}
	@Override
	public boolean deleteSupplier(int supplierId) 
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class, supplierId);
		session.delete(supplier);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return false;
	}
	@Override
	public Supplier editSupplier(int supplierId) 
	{
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class, supplierId);
		return supplier;

	}

}
