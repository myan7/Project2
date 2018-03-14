package my.spring.dao;

import java.util.List;

import my.spring.model.AbstractItem;

public interface ItemDao {
	public String createItem();
	
	public List<AbstractItem> getItemsByKeyword(String keyword);
	
	public AbstractItem getItemByID(long id);
	
	public void update(AbstractItem item);
	
	public List<AbstractItem> getAll();
	
	public List<AbstractItem> getByCategory(String category);
	
}
