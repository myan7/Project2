package my.spring.dao;

import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import my.spring.model.AbstractItem;
import my.spring.model.Cart;
import my.spring.model.User;

@Repository
public class CartDaoImpl implements CartDao {
	@Autowired
	HibernateTemplate ht;

	@Override
	@Transactional  //why do I need this annotation since I have @Transactional for the update(cart) method
	public void update(Cart cart, AbstractItem item, int quantity) {
		
		Map<AbstractItem, Integer> items = cart.getItems();

//		System.out.println(items.size());
		if (items.containsKey(item)) {
			int originQuantity = items.get(item);
			items.remove(item);
			update(cart);
			items.put(item, originQuantity + quantity);
			System.out.println(items.get(item));
		} 
		else {
			items.put(item, quantity);
		}
		System.out.println(items.size());
		update(cart);
		System.out.println(cart.getItems().keySet().size()+"from repository");
	}

	@Override
	public Cart getCart(User user) {
		Cart cart = user.getUserCart();
		return cart;
	}

	@Override
	@Transactional
	public void update(Cart cart) {
		
		ht.saveOrUpdate(cart);
	}

	@Override
	public Cart create() {

		return null;
	}

}
