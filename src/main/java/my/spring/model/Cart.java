package my.spring.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="P2_Cart_TBL")
public class Cart {
	@Id
	@GeneratedValue
	private long cartId;
	
//	@ElementCollection(fetch=FetchType.EAGER) 
//	@MapKeyJoinColumn(name="product_id") 
//	@Column(name="quantity", columnDefinition="NUMBER") 
//	@CollectionTable(name="pro2_cart_items", joinColumns=@JoinColumn(name="cart_id"))
	
	@ElementCollection(fetch=FetchType.EAGER,targetClass=Integer.class)
	@MapKeyJoinColumn(name ="ITEMID")
	@Column(name="Quantity")
	@CollectionTable(name="P2_CART_ITEMS_TBL", 
	joinColumns=@JoinColumn(name="CARTID"))
	private Map<AbstractItem,Integer> items;
	
	
	public Cart() {
		
	}
	
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public Map<AbstractItem, Integer> getItems() {
		return items;
	}
	public void setItems(Map<AbstractItem, Integer> items) {
		this.items = items;
	}
	
	
}
