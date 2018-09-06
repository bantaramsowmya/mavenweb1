package com.sowmya.web2.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sowmya.web2.model.Cart;
import com.sowmya.web2.model.Product;
@Component
@Repository
public class CartDaoImpl implements CartDao
{
@Autowired
SessionFactory sessionfactory;


	@Override
	public boolean insertCart(int productId, int quantity,String username) 
	{
		
		Session session=sessionfactory.openSession();
		Product product=(Product)session.get(Product.class, productId );
		Cart cart=new Cart();
	
		 cart.setCartId(((int)(Math.random()*100000)));
		
		cart.setProductName(product.getProductName());
		cart.setProductPrice(product.getProductPrice());
		cart.setQuantity(quantity);
		cart.setTotalPrice(quantity*cart.getProductPrice());
		cart.setCartUser(username);
		
		session.save(cart);
		
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public List getAllCartDetails(String cartUser) 
	{
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Cart where cartUser=:cu");
		query.setParameter("cu", cartUser);
		List cartList=query.list();
		session.close();
return cartList;

	}
}

