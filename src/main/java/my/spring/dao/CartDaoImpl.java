package my.spring.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import my.spring.model.AbstractItem;
import my.spring.model.Cart;
import my.spring.model.User;

@Repository
public class CartDaoImpl implements CartDao 
{
	@Autowired
	HibernateTemplate ht;
	
	public Cart createCart()
	{
		return null;
	}
	
	public Cart update(User user)
	{
		Cart cart = user.getUserCart();
		Map<AbstractItem, Integer> items = cart.getItems();
		
		return cart;
		
	}
	
	public Cart getCart(User user)
	{
		Cart cart = user.getUserCart();
		return cart;
	}
}
