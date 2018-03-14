package my.spring.service;

import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.spring.dao.CartDao;
import my.spring.model.AbstractItem;
import my.spring.model.Cart;
import my.spring.model.User;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDao cartDao;
	
	
	
	@Override
	public void update(Cart cart, AbstractItem item, int quantity) {
		cartDao.update(cart, item, quantity);
		System.out.println(cart.getItems().keySet().size()+"from service");
	}

	@Override
	public Cart getCart(User user) {
		
		return cartDao.getCart(user);
	}

	@Override
	public void update(Cart cart) {
		cartDao.update(cart);
	}

	@Override
	@Transactional
	public void removeFromCart(long id, Cart cart) 
	{
		Map<AbstractItem, Integer> items = cart.getItems();
		AbstractItem  item = null;
		for(AbstractItem i: items.keySet())
		{
			if(i.getItemId() == id)
				item = i;
		}
		items.remove(item);
		cartDao.update(cart);
	}

}
