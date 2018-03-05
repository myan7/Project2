package my.spring.service;

import java.util.List;

import my.spring.model.AbstractItem;

public interface ItemService {

	AbstractItem getItem(long id);
	
	List<AbstractItem> getAll();
}
