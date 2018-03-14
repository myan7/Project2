package my.spring.service;

import my.spring.model.AbstractItem;
import my.spring.model.Cart;
import my.spring.model.User;

public interface CartService {

	public void update(Cart cart, AbstractItem item, int quantity);
	public Cart getCart(User user);
	public void update(Cart cart);
	public void removeFromCart(long id, Cart cart);
}
