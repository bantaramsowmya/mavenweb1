package com.sowmya.web2.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.sowmya.web2.model.Register;
@Component
@Repository
public class AuthenticationDaoImpl implements AuthenticationDao
{
@Autowired
 SessionFactory sessionfactory;
	@Override
	public boolean insertRegisterDetails(Register register) 
	{
		Session session=sessionfactory.openSession();
		register.setRole("ROLE_USER");
		register.setEnabled(true);
		session.save(register);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		session.close();
		return true;
	}
	@Override
	public boolean login(String email,String passWord) 
	{
	try
	{
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("From Register where email=:em and passWord=:pwd");
		query.setParameter("em", email).setParameter("pwd", passWord);
		Register register=(Register)query.uniqueResult();
		if(register.getEmail()==email&&register.getPassWord()==passWord)
		{
			System.out.println("Login success");
			session.close();
			return true;
		}
	}
	
		catch (Exception e) {

			System.out.println("Login failed");
		}
	
	return false;
	}
	@Override
	public Register getUser(String  userName) {
		String hql="from Register where username=:uname";
		Session session=sessionfactory.openSession();
		Query query=session.createQuery(hql);
		query.setParameter("uname",userName);
		Register register=(Register)query.uniqueResult();
		
if(register!=null)
{session.close();
	return register;

}
else {
	return null;
}
		}

}
