package my.spring.dao;

import my.spring.model.AbstractItem;
import my.spring.model.Cart;
import my.spring.model.User;

public interface CartDao {
	
	public void update(Cart cart, AbstractItem item, int quantity);
	public void update(Cart cart);
	public Cart create();
	public Cart getCart(User user);
}
