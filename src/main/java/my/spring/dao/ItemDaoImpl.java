package my.spring.dao;

import java.util.List;

import org.hibernate.boot.jaxb.hbm.internal.LockModeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import my.spring.model.AbstractItem;

@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	HibernateTemplate ht;
	
	@Override
	public String createItem() {
		
		return null;
	}

	@Override
	public List<AbstractItem> getItemsByKeyword(String keyword) {
		
		return null;
	}

	@Override
	public AbstractItem getItemByID(long id) {
		AbstractItem aItem = ht.get(AbstractItem.class, id);
		System.out.println(aItem);
		return aItem;
	}

	@Override
	public void update(AbstractItem item) {
		
		ht.update(item);
	}

	@Override
	public List<AbstractItem> getAll() {
		
		return (List<AbstractItem>) ht.find("from AbstractItem");
	}
	
	

}
