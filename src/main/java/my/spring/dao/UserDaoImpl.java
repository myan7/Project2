package my.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import my.spring.model.Cart;
import my.spring.model.User;

@Repository
public class UserDaoImpl implements UserDAO {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public boolean add(User user)
	{
		boolean flag = false;
		
		try 
		{
			Cart cart = user.getUserCart();
			ht.save(cart);
			ht.save(user);
			flag = true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	@Override
	public User isValid(User user)
	{
		System.out.println("user "+ user);
		List<User> users = (List<User>) ht.find("from User where userEmail=? and userPassword=?", new Object[]{user.getUserEmail(), user.getUserPassword()});
		return users.get(0);
	}

	@Override
	public void update(User user) {
	}

	@Override
	public void delete(User user) 
	{
		ht.delete(user);
	}

	@Override
	public User getUserById(int id) 
	{
		return (User) ht.get(User.class, id);
	}

	@Override
	public List<User> getAll() {
		List<User> users = (List<User>) ht.find("from User");
		System.out.println(users);
		return users;
	}
	
	
}
